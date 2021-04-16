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

		private void paintBox(Graphics gr, Box box)
        {
			gr.FillRectangle(new SolidBrush(box.BoxColor),
							 box.X_position,
							 box.Y_position,
							 box.BoxWidth,
							 box.BoxHeight);
		}

		private void panelClicked(object s, EventArgs e)
		{
			if (itemCount == 1000)
			{
				return;
			}

			boxes[itemCount].updatePosition(((MouseEventArgs)e).Location);

			Graphics gr = pnl.CreateGraphics();
			paintBox(gr, boxes[itemCount]);

			itemCount++;
			pnl.Refresh();
		}

		private void panelPaint(object s, EventArgs e)
		{
			Graphics gr = pnl.CreateGraphics();
			for (int i = 0; i < itemCount; ++i)
			{
				paintBox(gr, boxes[i]);
			}
		}

		private void pollEvent(object s, EventArgs e)
		{
			for (int i = 0; i < itemCount; ++i)
			{
				boxes[i].setColliding(false);
				boxes[i].updatePosition();

				for (int j = i + 1; j < itemCount; ++j)
				{
					boxes[i].checkBoxCollision(boxes[j]);
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
