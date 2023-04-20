public class Circle {
        private static final double PI = 3.14;
        private static int radius;

        public Circle( int radius) {
            Circle.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public  void setRadius(int radius) {
            Circle.radius = radius;
        }

        static void area(){
            int rad = radius/2;
            double area = PI * (rad * rad);
            System.out.println(area);

        }

        static void cumfcirerence(){
            int rad = radius/2;
            double cumfcirerence=PI*2*rad;
            System.out.println(cumfcirerence);
        }

        @Override
        public String toString() {
            return "Circle{}";
        }
    }

