package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLongestCommonPrefix {
    @Test
    public void TestPrefixFinder(){
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        assertEquals("fl", lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));

    }
}