package com.tw.vapasi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void expectSquareArea4ForInput2() {
        Square square = new Square(2.0f);
        assertEquals(4.0, square.area());
    }

    @Test
    void expectSquarePerimeter8ForValue2() {
        Rectangle square = new Square(2.0f);
        assertEquals(8.0, square.perimeter());
    }
}
