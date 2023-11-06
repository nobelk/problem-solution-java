package org.app;

import org.app.ReverseInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestReverseInt {

    @Test
    public void reverse(){
        ReverseInt ri = new ReverseInt();
        assertTrue(ri.reverse(544)==445);
        assertTrue(ri.reverse(-8)==-8);
        assertTrue(ri.reverse(-808)==-808);
        assertTrue(ri.reverse(-800)==-8);
    }
}
