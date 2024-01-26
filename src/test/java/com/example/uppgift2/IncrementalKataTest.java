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

}
