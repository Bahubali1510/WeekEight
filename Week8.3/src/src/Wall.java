package src;

public class Wall {
        private double width;
        private double height;

        // No-arg constructor
        public Wall() {
            this.width = 0.0;
            this.height = 0.0;
        }

        // Constructor with parameters
        public Wall(double width, double height) {
            if (width < 0) {
                this.width = 0.0;
            } else {
                this.width = width;
            }

            if (height < 0) {
                this.height = 0.0;
            } else {
                this.height = height;
            }
        }

        // Getter for width
        public double getWidth() {
            return width;
        }

        // Getter for height
        public double getHeight() {
            return height;
        }

        // Setter for width
        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0.0;
            } else {
                this.width = width;
            }
        }

        // Setter for height
        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0.0;
            } else {
                this.height = height;
            }
        }

        // Method to calculate the area of the wall
        public double getArea() {
            return width * height;
        }

        public static void main(String[] args) {
            Wall wall = new Wall(5, 4);
            System.out.println("area= " + wall.getArea());

            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }
    }


