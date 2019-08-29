package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void expectRectangleArea12For4And3() {
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(12, rectangle.area());
    }

    @Test
    void expectRectangleArea15Dot75For4Dot5And3DotFive() {
        Rectangle rectangle = new Rectangle(4.5f, 3.5f);
        assertEquals(15.75, rectangle.area());
    }

    @Test
    void expectRectanglePerimeter70For12Dot5And5Dot6() {
        Rectangle rectangle = new Rectangle(12.0f, 5.0f);
        assertEquals(34.0, rectangle.perimeter());
    }
}
