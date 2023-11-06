package org.app;

import org.app.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestValidAnagram {
    @Test
    public void anagramTest(){
        ValidAnagram va = new ValidAnagram();
        assertTrue(va.isAnagram("anagram", "nagaram"));
    }
}
