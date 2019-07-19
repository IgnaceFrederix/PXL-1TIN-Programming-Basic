package opdracht7;

public class RectangleUnchecked {
	
	
		private int height;
		private int width;

		public RectangleUnchecked(int width, int height) {
			setHeight(height);
			setWidth(width);
		}

		public void setHeight(int height) {
			if (height < 0) {
				throw new RuntimeException("negative height");
			}
			this.height = height;
		}

		public void setWidth(int width){
			if (width < 0) {
				throw new RuntimeException("negative width");
			}
			this.width = width;
		}

	}



