using System;
using System.Drawing;

namespace CS4340_5340_HW5
{
    class Box
    {
		private Rectangle m_bounds;
		private int x_velocity;
		private int y_velocity;
		private Color boxColor;
		private bool colliding;

		private Random m_random;

		public Box(Random random, Size bounds) : this(random)
        {
			Size size = new Size(20, 20);
			Point location = new Point((int)(random.NextDouble() * (bounds.Width - size.Width)),
									   (int)(random.NextDouble() * (bounds.Height - size.Height)));
			m_bounds = new Rectangle(location, size);
		}

		public Box(Random random, Point location) : this(random)
		{
			Size size = new Size(20, 20);
			m_bounds = new Rectangle(location, size);
		}

		// Base constructor for others to build on
		private Box(Random random)
        {
			x_velocity = random.Next(2) * 2 - 1;
			y_velocity = random.Next(2) * 2 - 1;

			m_random = random;

			// Initialize color after random
			changeColor();

			colliding = false;
		}

		public void checkBorderCollision(Size rectSize)
        {
			// Check X
			if (m_bounds.X > rectSize.Width - m_bounds.Width)
			{
				X_velocity *= -1;
				m_bounds.X = rectSize.Width - m_bounds.Width;
				changeColor();
			}
			else if (m_bounds.Location.X < 0)
			{
				X_velocity *= -1;
				m_bounds.X = 0;
				changeColor();
			}
			// Check Y
			if (m_bounds.Location.Y > rectSize.Height - m_bounds.Height)
			{
				Y_velocity *= -1;
				m_bounds.Y = rectSize.Height - m_bounds.Size.Height;
				changeColor();
			}
			else if (m_bounds.Location.Y < 0)
			{
				Y_velocity *= -1;
				m_bounds.Y = 0;
				changeColor();
			}
		}

		public void setColliding(bool isColliding)
        {
			if (isColliding)
            {
				Colliding = true;
				setRed();
			}
			else
			{
				Colliding = false;
				changeColor();
			}
		}
		
		public int X_position { get => m_bounds.X; set => m_bounds.X = value; }
		public int Y_position { get => m_bounds.Y; set => m_bounds.Y = value; }
		public int BoxWidth { get => m_bounds.Width; set => m_bounds.Width = value; }
		public int BoxHeight { get => m_bounds.Height; set => m_bounds.Height = value; }
		public Color BoxColor { get => boxColor; }
		public int X_velocity { get => x_velocity; set => x_velocity = value; }
        public int Y_velocity { get => y_velocity; set => y_velocity = value; }
        public bool Colliding { get => colliding; set => colliding = value; }

		private void changeColor()
        {
			boxColor = Color.FromArgb(m_random.Next(256), m_random.Next(256), m_random.Next(256));
		}

		private void setRed()
        {
			boxColor = Color.Red;
        }
    }
}