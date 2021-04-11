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
			for(int i = 0; i < 1000; ++i)
            {
				boxes[i] = new Box();
            }

			InitializeComponent();
			this.SetBounds((Screen.GetBounds(this).Width / 2) - (this.Width / 2),
						   (Screen.GetBounds(this).Height / 2) - (this.Height / 2),
						   this.Width, this.Height, BoundsSpecified.Location);
			this.SetStyle(ControlStyles.OptimizedDoubleBuffer, true);
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
			for (int i = 0; i < 100 && itemCount < 1000; ++i)
			{
				boxes[itemCount].BoxWidth = 20;
				boxes[itemCount].BoxHeight = 20;
				boxes[itemCount].X_position 
					= (int)(r.NextDouble() * (pnl.Width - boxes[itemCount].BoxWidth));
				boxes[itemCount].Y_position 
					= (int)(r.NextDouble() * (pnl.Height - boxes[itemCount].BoxHeight));
				boxes[itemCount].X_velocity = r.Next(2) * 2 - 1;
				boxes[itemCount].Y_velocity = r.Next(2) * 2 - 1;
				boxes[itemCount].Colliding = false;
				boxes[itemCount].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				itemCount++;
			}
			pnl.Refresh();
		}

		private void panelClicked(object s, EventArgs e)
		{
			if (itemCount == 1000)
				return;
			boxes[itemCount].X_position = ((MouseEventArgs)e).X;
			boxes[itemCount].Y_position = ((MouseEventArgs)e).Y;
			boxes[itemCount].X_velocity = r.Next(2) * 2 - 1;
			boxes[itemCount].Y_velocity = r.Next(2) * 2 - 1;
			boxes[itemCount].BoxWidth = 20;
			boxes[itemCount].BoxHeight = 20;
			boxes[itemCount].Colliding = false;
			boxes[itemCount].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
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
				if (boxes[i].Colliding)
				{
					boxes[i].Colliding = false;
					boxes[i].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				}
				boxes[i].X_position += boxes[i].X_velocity;
				boxes[i].Y_position += boxes[i].Y_velocity;
				for (int j = i + 1; j < itemCount; ++j)
				{
					int dX = Math.Abs(boxes[i].X_position - boxes[j].X_position);
					int dY = Math.Abs(boxes[i].Y_position - boxes[j].Y_position);
					if (dX < boxes[i].BoxWidth && dY < boxes[i].BoxHeight)
					{
						boxes[i].Colliding = true;
						boxes[j].Colliding = true;
						boxes[j].BoxColor = Color.Red;
						boxes[i].BoxColor = Color.Red;
						dX = boxes[i].BoxWidth - dX;
						dY = boxes[i].BoxHeight - dY;
						if (dX < dY)
						{
							if (boxes[i].X_position < boxes[j].X_position)
							{
								switch (boxes[i].X_velocity)
								{
									case -1:
										boxes[i].X_velocity = 1;
										break;
									case 1:
										boxes[i].X_velocity = -1;
										break;
								}
								switch (boxes[j].X_velocity)
								{
									case -1:
										boxes[j].X_velocity = 1;
										break;
									case 1:
										boxes[j].X_velocity = -1;
										break;
								}
								boxes[i].X_position += boxes[i].X_velocity; // * dX;
								boxes[j].X_position += boxes[j].X_velocity; // * dX;
							}
							else
							{
								switch (boxes[i].X_velocity)
								{
									case -1:
										boxes[i].X_velocity = 1;
										break;
									case 1:
										boxes[i].X_velocity = -1;
										break;
								}
								switch (boxes[j].X_velocity)
								{
									case -1:
										boxes[j].X_velocity = 1;
										break;
									case 1:
										boxes[j].X_velocity = -1;
										break;
								}
								boxes[j].X_position += boxes[j].X_velocity; // * dX;
								boxes[i].X_position += boxes[i].X_velocity; // * dX;
							}
						}
						else
						{
							if (boxes[i].Y_position < boxes[j].Y_position)
							{
								switch (boxes[i].Y_velocity)
								{
									case -1:
										boxes[i].Y_velocity = 1;
										break;
									case 1:
										boxes[i].Y_velocity = -1;
										break;
								}
								switch (boxes[j].Y_velocity)
								{
									case -1:
										boxes[j].Y_velocity = 1;
										break;
									case 1:
										boxes[j].Y_velocity = -1;
										break;
								}
								boxes[i].Y_position += boxes[i].Y_velocity; // * dY;
								boxes[j].Y_position += boxes[j].Y_velocity; //* dY;
							}
							else
							{
								switch (boxes[i].Y_velocity)
								{
									case -1:
										boxes[i].Y_velocity = 1;
										break;
									case 1:
										boxes[i].Y_velocity = -1;
										break;
								}
								switch (boxes[j].Y_velocity)
								{
									case -1:
										boxes[j].Y_velocity = 1;
										break;
									case 1:
										boxes[j].Y_velocity = -1;
										break;
								}
								boxes[j].Y_position += boxes[j].Y_velocity; // * dY;
								boxes[i].Y_position += boxes[i].Y_velocity; // * dY;
							}
						}
					}
				}
				if (boxes[i].X_position > pnl.Width - boxes[i].BoxWidth)
				{
					boxes[i].X_velocity *= -1;
					boxes[i].X_position = pnl.Width - boxes[i].BoxWidth;
					boxes[i].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				}
				else if (boxes[i].X_position < 0)
				{
					boxes[i].X_velocity *= -1;
					boxes[i].X_position = 0;
					boxes[i].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				}
				if (boxes[i].Y_position > pnl.Height - boxes[i].BoxHeight)
				{
					boxes[i].Y_velocity *= -1;
					boxes[i].Y_position = pnl.Height - boxes[i].BoxHeight;
					boxes[i].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				}
				else if (boxes[i].Y_position < 0)
				{
					boxes[i].Y_velocity *= -1;
					boxes[i].Y_position = 0;
					boxes[i].BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
				}
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
