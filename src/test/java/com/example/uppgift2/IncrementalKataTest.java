package com.example.uppgift2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
