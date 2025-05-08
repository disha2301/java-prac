package com.gevernova;

import com.gevernova.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();
    @Test
    void testReverse(){
        assertEquals("cba",utils.reverse("abc"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null));
    }
    @Test
    void testIsPalindrome(){
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("disha"));
    }
    @Test
    void testToUpperCase(){
        assertEquals("DISHA", utils.toUpperCase("disha"));
        assertNull(utils.toUpperCase(null));

    }
}
