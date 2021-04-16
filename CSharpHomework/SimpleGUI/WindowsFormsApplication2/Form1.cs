using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace CS4340_5340_HW5
{
	public partial class Form1 : Form
	{
		Box[] boxes = new Box[1000];
		int itemCount = 0;
		Random r = new Random();

		public Form1()
		{
			InitializeComponent();
			this.SetBounds((Screen.GetBounds(this).Width / 2) - (this.Width / 2),
						   (Screen.GetBounds(this).Height / 2) - (this.Height / 2),
						   this.Width, this.Height, BoundsSpecified.Location);
			this.SetStyle(ControlStyles.OptimizedDoubleBuffer, true);

			for (int i = 0; i < 1000; ++i)
			{
				boxes[i] = new Box(r, pnl.Bounds.Size);
			}
		}
		protected override CreateParams CreateParams
		{
			get
			{
				CreateParams cp = base.CreateParams;
				cp.ExStyle |= 0x02000000;  // Turn on WS_EX_COMPOSITED (child control double-buffering)
				return cp;
			}
		}

		private void addItemsClicked(object s, EventArgs e)
		{
			itemCount += 100;
			itemCount = itemCount > 1000 ? 1000 : itemCount;

			pnl.Refresh();
		}

		private void panelClicked(object s, EventArgs e)
		{
			if (itemCount == 1000)
			{
				return;
			}
			boxes[itemCount].X_position = ((MouseEventArgs)e).X;
			boxes[itemCount].Y_position = ((MouseEventArgs)e).Y;

			Graphics gr = pnl.CreateGraphics();
			gr.FillRectangle(new SolidBrush(boxes[itemCount].BoxColor),
											boxes[itemCount].X_position,
											boxes[itemCount].Y_position,
											boxes[itemCount].BoxWidth,
											boxes[itemCount].BoxHeight);
			itemCount++;
			pnl.Refresh();
		}

		private void panelPaint(object s, EventArgs e)
		{
			Graphics gr = pnl.CreateGraphics();
			for (int i = 0; i < itemCount; ++i)
			{
				gr.FillRectangle(new SolidBrush(boxes[i].BoxColor),
												boxes[i].X_position,
												boxes[i].Y_position,
												boxes[i].BoxWidth,
												boxes[i].BoxHeight);
			}
		}

		private void pollEvent(object s, EventArgs e)
		{
			for (int i = 0; i < itemCount; ++i)
			{
				boxes[i].setColliding(false);

				boxes[i].X_position += boxes[i].X_velocity;
				boxes[i].Y_position += boxes[i].Y_velocity;
				for (int j = i + 1; j < itemCount; ++j)
				{
					int dX = Math.Abs(boxes[i].X_position - boxes[j].X_position);
					int dY = Math.Abs(boxes[i].Y_position - boxes[j].Y_position);
					if (dX < boxes[i].BoxWidth && dY < boxes[i].BoxHeight)
					{
						boxes[i].setColliding(true);
						boxes[j].setColliding(true);

						dX = boxes[i].BoxWidth - dX;
						dY = boxes[i].BoxHeight - dY;
						if (dX < dY)
						{
							boxes[i].X_velocity *= -1;
							boxes[j].X_velocity *= -1;

							boxes[i].X_position += boxes[i].X_velocity; // * dX;
							boxes[j].X_position += boxes[j].X_velocity; // * dX;
						}
						else
						{
							boxes[i].Y_velocity *= -1;
							boxes[j].Y_velocity *= -1;

							boxes[i].Y_position += boxes[i].Y_velocity; // * dY;
							boxes[j].Y_position += boxes[j].Y_velocity; //* dY;
						}
					}
				}
				// Check collision with panel
				boxes[i].checkBorderCollision(pnl.Bounds.Size);
			}
			label1.Text = itemCount.ToString() + " Items";
			label1.Refresh();
			pnl.Refresh();
		}

		private void clearButtonClicked(object sender, EventArgs e)
		{
			itemCount = 0;
		}
	}
}
