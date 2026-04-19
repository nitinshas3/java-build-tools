package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    void testReverse() {
        ReverseString reverse = new ReverseString();
        assertEquals(reverse.reverse("java"),"avaj");
    }

    @Test
    void testReverse_multi(){
        ReverseString reverse = new ReverseString();
        assertEquals(reverse.reverse("java is an easy language"), "egaugnal ysae na si avaj","string is not reversed properly"); //message for failing of test
    }
}
