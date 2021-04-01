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
		int[] x_position = new int[1000];
		int[] yp = new int[1000];
		int[] xv = new int[1000];
		int[] yv = new int[1000];
		int[] w = new int[1000];
		int[] h = new int[1000];
		Color[] c = new Color[1000];
		bool[] col = new bool[1000];
		int itemCount = 0;
		Random r = new Random();
		public Form1()
		{
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
		private void EventStuff(object s, EventArgs e)
		{
			if (s is Button)
			{
				for (int i = 0; i < 100 && itemCount < 1000; ++i)
				{
					w[itemCount] = 20;
					h[itemCount] = 20;
					x_position[itemCount] = (int)(r.NextDouble() * (pnl.Width - w[itemCount]));
					yp[itemCount] = (int)(r.NextDouble() * (pnl.Height - h[itemCount]));
					xv[itemCount] = r.Next(2) * 2 - 1;
					yv[itemCount] = r.Next(2) * 2 - 1;
					col[itemCount] = false;
					c[itemCount] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					itemCount++;
				}
				pnl.Refresh();
			}
			else if (s is Panel)
			{
				if (e is MouseEventArgs)
				{
					if (itemCount == 1000)
						return;
					x_position[itemCount] = ((MouseEventArgs)e).X;
					yp[itemCount] = ((MouseEventArgs)e).Y;
					xv[itemCount] = r.Next(2) * 2 - 1;
					yv[itemCount] = r.Next(2) * 2 - 1;
					w[itemCount] = 20;
					h[itemCount] = 20;
					col[itemCount] = false;
					c[itemCount] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					Graphics gr = pnl.CreateGraphics();
					gr.FillRectangle(new SolidBrush(c[itemCount]), x_position[itemCount], yp[itemCount], w[itemCount], h[itemCount]);
					itemCount++;
					pnl.Refresh();
				}
				else if (e is PaintEventArgs)
				{
					Graphics gr = pnl.CreateGraphics();
					for (int i = 0; i < itemCount; ++i)
					{
						gr.FillRectangle(new SolidBrush(c[i]), x_position[i], yp[i], w[i], h[i]);
					}
				}
			}
			else if (s is Timer)
			{
				for (int i = 0; i < itemCount; ++i)
				{
					if (col[i])
					{
						col[i] = false;
						c[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					x_position[i] += xv[i];
					yp[i] += yv[i];
					for (int j = i + 1; j < itemCount; ++j)
					{
						int dX = Math.Abs(x_position[i] - x_position[j]);
						int dY = Math.Abs(yp[i] - yp[j]);
						if (dX < w[i] && dY < h[i])
						{
							col[i] = true;
							col[j] = true;
							c[j] = Color.Red;
							c[i] = Color.Red;
							dX = w[i] - dX;
							dY = h[i] - dY;
							if (dX < dY)
							{
								if (x_position[i] < x_position[j])
								{
									switch (xv[i])
									{
										case -1:
											xv[i] = 1;
											break;
										case 1:
											xv[i] = -1;
											break;
									}
									switch (xv[j])
									{
										case -1:
											xv[j] = 1;
											break;
										case 1:
											xv[j] = -1;
											break;
									}
									x_position[i] += xv[i]; // * dX;
									x_position[j] += xv[j]; // * dX;
								}
								else
								{
									switch (xv[i])
									{
										case -1:
											xv[i] = 1;
											break;
										case 1:
											xv[i] = -1;
											break;
									}
									switch (xv[j])
									{
										case -1:
											xv[j] = 1;
											break;
										case 1:
											xv[j] = -1;
											break;
									}
									x_position[j] += xv[j]; // * dX;
									x_position[i] += xv[i]; // * dX;
								}
							}
							else
							{
								if (yp[i] < yp[j])
								{
									switch (yv[i])
									{
										case -1:
											yv[i] = 1;
											break;
										case 1:
											yv[i] = -1;
											break;
									}
									switch (yv[j])
									{
										case -1:
											yv[j] = 1;
											break;
										case 1:
											yv[j] = -1;
											break;
									}
									yp[i] += yv[i]; // * dY;
									yp[j] += yv[j]; //* dY;
								}
								else
								{
									switch (yv[i])
									{
										case -1:
											yv[i] = 1;
											break;
										case 1:
											yv[i] = -1;
											break;
									}
									switch (yv[j])
									{
										case -1:
											yv[j] = 1;
											break;
										case 1:
											yv[j] = -1;
											break;
									}
									yp[j] += yv[j]; // * dY;
									yp[i] += yv[i]; // * dY;
								}
							}
						}
					}
					if (x_position[i] > pnl.Width - w[i])
					{
						xv[i] *= -1;
						x_position[i] = pnl.Width - w[i];
						c[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					else if (x_position[i] < 0)
					{
						xv[i] *= -1;
						x_position[i] = 0;
						c[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					if (yp[i] > pnl.Height - h[i])
					{
						yv[i] *= -1;
						yp[i] = pnl.Height - h[i];
						c[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					else if (yp[i] < 0)
					{
						yv[i] *= -1;
						yp[i] = 0;
						c[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
				}
				label1.Text = itemCount.ToString() + " Items";
				label1.Refresh();
				pnl.Refresh();
			}
		}

		private void button4_Click(object sender, EventArgs e)
		{
			itemCount = 0;
		}
	}
}
