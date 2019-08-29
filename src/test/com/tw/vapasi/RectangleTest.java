package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void expectRectangleArea12For4And3() {
        Rectangle rectangle = Rectangle.createRectangle(4, 3);
        assertEquals(12, rectangle.area());
    }

    @Test
    void expectRectangleArea15Dot75For4Dot5And3DotFive() {
        Rectangle rectangle = Rectangle.createRectangle(4.5, 3.5);
        assertEquals(15.75, rectangle.area());
    }

    @Test
    void expectRectanglePerimeter70For12Dot5And5Dot6() {
        Rectangle rectangle = Rectangle.createRectangle(12.0, 5.0);
        assertEquals(34.0, rectangle.perimeter());
    }

    @Test
    void expectSquareArea4ForInput2() {
        Rectangle rectangle = Rectangle.createSquare(2.0);
        assertEquals(4.0, rectangle.area());
    }

    @Test
    void expectSquarePerimeter8ForValue2() {
        Rectangle square = Rectangle.createSquare(2.0);
        assertEquals(8.0, square.perimeter());
    }
}
