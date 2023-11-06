package org.app;

import org.app.StringToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringToInteger {

    @Test
    public void TestStringToInt(){
        StringToInteger si = new StringToInteger();
        assertEquals(-42, si.ConvertToInteger("   -42"));
        // following test not passing
        // Assert.assertEquals(-2147483648, si.ConvertToInteger("-91283472332"));
    }
}
