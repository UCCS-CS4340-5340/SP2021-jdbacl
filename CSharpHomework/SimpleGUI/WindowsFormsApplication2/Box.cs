using System;
using System.Drawing;

namespace CS4340_5340_HW5
{
    class Box
    {
		Rectangle m_bounds;
		private int x_velocity;
		private int y_velocity;
		private Color boxColor;
		private bool colliding;

		public Box()
        {
			m_bounds = new Rectangle(new Point(0,0), new Size(0,0));

			x_velocity = 0;
			y_velocity = 0;

			boxColor = new Color();
			colliding = false;
		}

		public void checkColliding(Size rectSize, Random r)
        {
			// Check X
			if (m_bounds.X > rectSize.Width - m_bounds.Width)
			{
				X_velocity *= -1;
				m_bounds.X = rectSize.Width - m_bounds.Width;
				BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
			}
			else if (m_bounds.Location.X < 0)//rect.X)
			{
				X_velocity *= -1;
				m_bounds.X = 0;
				BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
			}
			// Check Y
			if (m_bounds.Location.Y > rectSize.Height - m_bounds.Height)
			{
				Y_velocity *= -1;
				m_bounds.Y = rectSize.Height - m_bounds.Size.Height;
				BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
			}
			else if (m_bounds.Location.Y < 0)//rect.Y)
			{
				Y_velocity *= -1;
				m_bounds.Y = 0;
				BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
			}
		}

		public void setNotColliding(Random r)
        {
			if (Colliding)
			{
				Colliding = false;
				BoxColor = Color.FromArgb(r.Next(256), r.Next(256), r.Next(256));
			}
		}
		
		public int X_position { get => m_bounds.X; set => m_bounds.X = value; }
		public int Y_position { get => m_bounds.Y; set => m_bounds.Y = value; }
		public int BoxWidth { get => m_bounds.Width; set => m_bounds.Width = value; }
		public int BoxHeight { get => m_bounds.Height; set => m_bounds.Height = value; }

		public int X_velocity { get => x_velocity; set => x_velocity = value; }
        public int Y_velocity { get => y_velocity; set => y_velocity = value; }
        public Color BoxColor { get => boxColor; set => boxColor = value; }
        public bool Colliding { get => colliding; set => colliding = value; }
    }
}