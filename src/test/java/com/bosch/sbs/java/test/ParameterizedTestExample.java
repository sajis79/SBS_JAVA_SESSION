package com.bosch.sbs.java.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestExample {
    //In order to use parameterized tests you need to add a dependency on the junit-jupiter-params artifact.//
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba", "malayalam", "level", "civic","madam","noon" })
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }

/* Gives a nice error so its here for display!
    @ParameterizedTest
    @ValueSource(strings = {" ", "   ", "\t", "\n"})
    void testWithValueSourceWithEmptyStingOrSpecialChar(int argument) {
        assertNotNull(argument);
    }
*/
    @ParameterizedTest
    @ValueSource(strings = {" ", "   ", "\t", "\n"})
    void testWithValueSourceWithEmptyStingOrSpecialChar(String argument) {
        assertNotNull(argument);
    }
    /*
    Please go through below link
    https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
    @NullSource
    @EmptySource
    @NullAndEmptySource
     */


    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    //Same as above, reduced two to one annotation
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankTogether(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    //Copied from ..
    private boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
