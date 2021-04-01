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
		int[] y_position = new int[1000];
		int[] x_velocity = new int[1000];
		int[] y_velocity = new int[1000];
		int[] boxWidth = new int[1000];
		int[] boxHeight = new int[1000];
		Color[] boxColor = new Color[1000];
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
					boxWidth[itemCount] = 20;
					boxHeight[itemCount] = 20;
					x_position[itemCount] = (int)(r.NextDouble() * (pnl.Width - boxWidth[itemCount]));
					y_position[itemCount] = (int)(r.NextDouble() * (pnl.Height - boxHeight[itemCount]));
					x_velocity[itemCount] = r.Next(2) * 2 - 1;
					y_velocity[itemCount] = r.Next(2) * 2 - 1;
					col[itemCount] = false;
					boxColor[itemCount] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
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
					y_position[itemCount] = ((MouseEventArgs)e).Y;
					x_velocity[itemCount] = r.Next(2) * 2 - 1;
					y_velocity[itemCount] = r.Next(2) * 2 - 1;
					boxWidth[itemCount] = 20;
					boxHeight[itemCount] = 20;
					col[itemCount] = false;
					boxColor[itemCount] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					Graphics gr = pnl.CreateGraphics();
					gr.FillRectangle(new SolidBrush(boxColor[itemCount]), x_position[itemCount], y_position[itemCount], boxWidth[itemCount], boxHeight[itemCount]);
					itemCount++;
					pnl.Refresh();
				}
				else if (e is PaintEventArgs)
				{
					Graphics gr = pnl.CreateGraphics();
					for (int i = 0; i < itemCount; ++i)
					{
						gr.FillRectangle(new SolidBrush(boxColor[i]), x_position[i], y_position[i], boxWidth[i], boxHeight[i]);
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
						boxColor[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					x_position[i] += x_velocity[i];
					y_position[i] += y_velocity[i];
					for (int j = i + 1; j < itemCount; ++j)
					{
						int dX = Math.Abs(x_position[i] - x_position[j]);
						int dY = Math.Abs(y_position[i] - y_position[j]);
						if (dX < boxWidth[i] && dY < boxHeight[i])
						{
							col[i] = true;
							col[j] = true;
							boxColor[j] = Color.Red;
							boxColor[i] = Color.Red;
							dX = boxWidth[i] - dX;
							dY = boxHeight[i] - dY;
							if (dX < dY)
							{
								if (x_position[i] < x_position[j])
								{
									switch (x_velocity[i])
									{
										case -1:
											x_velocity[i] = 1;
											break;
										case 1:
											x_velocity[i] = -1;
											break;
									}
									switch (x_velocity[j])
									{
										case -1:
											x_velocity[j] = 1;
											break;
										case 1:
											x_velocity[j] = -1;
											break;
									}
									x_position[i] += x_velocity[i]; // * dX;
									x_position[j] += x_velocity[j]; // * dX;
								}
								else
								{
									switch (x_velocity[i])
									{
										case -1:
											x_velocity[i] = 1;
											break;
										case 1:
											x_velocity[i] = -1;
											break;
									}
									switch (x_velocity[j])
									{
										case -1:
											x_velocity[j] = 1;
											break;
										case 1:
											x_velocity[j] = -1;
											break;
									}
									x_position[j] += x_velocity[j]; // * dX;
									x_position[i] += x_velocity[i]; // * dX;
								}
							}
							else
							{
								if (y_position[i] < y_position[j])
								{
									switch (y_velocity[i])
									{
										case -1:
											y_velocity[i] = 1;
											break;
										case 1:
											y_velocity[i] = -1;
											break;
									}
									switch (y_velocity[j])
									{
										case -1:
											y_velocity[j] = 1;
											break;
										case 1:
											y_velocity[j] = -1;
											break;
									}
									y_position[i] += y_velocity[i]; // * dY;
									y_position[j] += y_velocity[j]; //* dY;
								}
								else
								{
									switch (y_velocity[i])
									{
										case -1:
											y_velocity[i] = 1;
											break;
										case 1:
											y_velocity[i] = -1;
											break;
									}
									switch (y_velocity[j])
									{
										case -1:
											y_velocity[j] = 1;
											break;
										case 1:
											y_velocity[j] = -1;
											break;
									}
									y_position[j] += y_velocity[j]; // * dY;
									y_position[i] += y_velocity[i]; // * dY;
								}
							}
						}
					}
					if (x_position[i] > pnl.Width - boxWidth[i])
					{
						x_velocity[i] *= -1;
						x_position[i] = pnl.Width - boxWidth[i];
						boxColor[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					else if (x_position[i] < 0)
					{
						x_velocity[i] *= -1;
						x_position[i] = 0;
						boxColor[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					if (y_position[i] > pnl.Height - boxHeight[i])
					{
						y_velocity[i] *= -1;
						y_position[i] = pnl.Height - boxHeight[i];
						boxColor[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
					}
					else if (y_position[i] < 0)
					{
						y_velocity[i] *= -1;
						y_position[i] = 0;
						boxColor[i] = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
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
