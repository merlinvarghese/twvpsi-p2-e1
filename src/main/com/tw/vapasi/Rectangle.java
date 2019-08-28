package com.tw.vapasi;

public class Rectangle {
    private float length;
    private float breadth;

    public Rectangle(float length,float breadth) {
        this.length = length;
        this .breadth = breadth;
    }

    float findAreaOfRectangle(float length, float breadth) {
        return length*breadth;
    }
}
