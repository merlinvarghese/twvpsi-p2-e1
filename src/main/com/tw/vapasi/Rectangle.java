package com.tw.vapasi;

class Rectangle{
    private float length;
    private float breadth;

    Rectangle(float length,float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(float side) {
        this.length = side;
        this.breadth = side;
    }

    float area() {
        return length * breadth;
    }

    float perimeter() {
        return 2 * (length + breadth);
    }
}
