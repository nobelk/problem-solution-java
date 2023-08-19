package org.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestValidPalindrome {
    @Test
    public void TestPalindrome(){
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("tenet"));
        assertTrue(vp.isPalindrome("Tenet"));
        assertFalse(vp.isPalindrome("text"));
        assertTrue(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }
}