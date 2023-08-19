package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNeedleInHaystack {

    @Test
    public void TestNeedleInHaystack(){
        NeedleInHaystack niH = new NeedleInHaystack();
        assertEquals(2, niH.findNeedleInHaystack("hello", "ll"));
        assertEquals(0, niH.findNeedleInHaystack("", ""));
        assertEquals(-1, niH.findNeedleInHaystack("aaaaa", "bba"));
        assertEquals(0, niH.findNeedleInHaystack("a", "a"));
        assertEquals(2, niH.findNeedleInHaystack("abc", "c"));
    }
}
