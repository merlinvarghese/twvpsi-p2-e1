package com.tw.vapasi;

class Rectangle {
    private double length;
    private double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    private Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    static Rectangle createRectangle(double length, double breadth) {
        return new Rectangle(length, breadth);
    }

    static Rectangle createSquare(double side) {
        return new Rectangle(side);
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}
