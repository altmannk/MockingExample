package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class IncrementalKataTest {


    @Test
    @DisplayName("Given empty string then return 0")
    void givenEmptyStringThenReturn0() {
        int result = IncrementalKata.add("");

        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Given '1' then return 1")
    void given1ThenReturn1() {
        assertThat(IncrementalKata.add("1")).isEqualTo(1);
    }

    @Test
    @DisplayName("Two string numbers should return sum")
    void twoStringNumbersShouldReturnSum() {
        int result = IncrementalKata.add("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Unknown amount of numbers should return sum")
    void unknownAmountOfNumbersShouldReturnSum() {
        int result = IncrementalKata.add("1,2,3,4,5");
        assertThat(result).isEqualTo(15);
    }

    @Test
    @DisplayName("New lines between string numbers should return sum")
    void newLinesBetweenStringNumbersShouldReturnSum() {
        int result = IncrementalKata.add("1\n2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("String with custom delimiter should return sum")
    void stringWithCustomDelimiterShouldReturnSum() {
        int result = IncrementalKata.add("//;\n1;2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("A negative number should throw exception with message 'negatives not allowed'")
    void aNegativeNumberShouldThrowException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            IncrementalKata.add("-1");
        });
        assertThat(thrown.getMessage()).contains("negatives not allowed -1");
    }

    @Test
    @DisplayName("Multiple negative number should throw exception with message")
    void multipleNegativeNumberShouldThrowException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            IncrementalKata.add("-1,2,3,-4");
        });
        assertThat(thrown.getMessage()).contains("negatives not allowed -1,-4");
    }

}
