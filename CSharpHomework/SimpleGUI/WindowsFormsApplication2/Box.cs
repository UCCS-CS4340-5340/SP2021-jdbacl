using System.Drawing;

namespace CS4340_5340_HW5
{
    class Box
    {

		private int x_position;
		private int y_position;
		private int x_velocity;
		private int y_velocity;
		private int boxWidth;
		private int boxHeight;
		private Color boxColor;
		private bool colliding;

		public Box()
        {
			x_position = 0;
			y_position = 0;
			x_velocity = 0;
			y_velocity = 0;
			boxWidth = 0;
			boxHeight = 0;
			boxColor = new Color();
			colliding = false;
	}

        public int X_position { get => x_position; set => x_position = value; }
        public int Y_position { get => y_position; set => y_position = value; }
        public int X_velocity { get => x_velocity; set => x_velocity = value; }
        public int Y_velocity { get => y_velocity; set => y_velocity = value; }
        public int BoxWidth { get => boxWidth; set => boxWidth = value; }
        public int BoxHeight { get => boxHeight; set => boxHeight = value; }
        public Color BoxColor { get => boxColor; set => boxColor = value; }
        public bool Colliding { get => colliding; set => colliding = value; }
    }
}