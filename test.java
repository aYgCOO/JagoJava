interface Shape {
    void getArea();
}

interface Colorable {
    void setColor(String color);
}

class Circle implements Shape, Colorable {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("The area of the circle is " + Math.PI * radius * radius);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
