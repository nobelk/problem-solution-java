package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFirstNonRepeatingChar {

    @Test
    public void TestFirstNonRepeatingCharFinder(){

        FirstNonRepeatingChar fc = new FirstNonRepeatingChar();

        assertTrue(0 == fc.firstUniqChar("leetcode"));
        assertTrue(2 == fc.firstUniqChar("loveleetcode"));
        assertTrue(-1 == fc.firstUniqChar("aabb"));
    }
}
