package JavaProject2;


public abstract class Task9 {
    public interface Shape {

        float radius = 3;

        abstract void calculateArea();

        abstract void calculatePerimeter();

    }


    static class Circle implements Shape {


        @Override
        public void calculateArea() {

            double area = radius * radius * Math.PI;
            System.out.println("Area of circle : "+area);


        }

        @Override
        public void calculatePerimeter() {


            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perimeter of circle : "+perimeter);

        }
    }


    static class Square implements Shape {

        int side = 10;


        @Override
        public void calculateArea() {
            long area = side * side;
            System.out.println("Area of square is "+area);

        }

        @Override
        public void calculatePerimeter() {
            long perimeter = side * 4;
            System.out.println("Perimeter of square is "+perimeter);

        }
    }
}
class test {
    public static void main(String[] args) {
        Task9.Shape[] arr = {new Task9.Circle(), new Task9.Square()};
        for (Task9.Shape a : arr) {
            a.calculateArea();
            a.calculatePerimeter();

        }
    }
}

