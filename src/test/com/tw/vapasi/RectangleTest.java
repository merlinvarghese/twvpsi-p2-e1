package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void rectangleAreaFor4And3() {
        Rectangle rect = new Rectangle(4,3);
        assertEquals(12, rect.findAreaOfRectangle(4, 3));
    }

    @Test
    void rectangleAreaForFloatValues() {
        Rectangle rect = new Rectangle(4.5f,3.5f);
        assertEquals(15.75, rect.findAreaOfRectangle(4.5f, 3.5f));
    }
}
