public class Rectangle {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: java Rectangle <width> <height>");
            return;
        }

        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
