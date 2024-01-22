package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void init(){
        employee = new Employee("123", 24500.00);
    }

    @Test
    @DisplayName("getId returns correct id")
    void getIdReturnsCorrectId() {
        var result = employee.getId();
        assertThat(result).isEqualTo("123");
    }

    @Test
    @DisplayName("setId sets correct id")
    void setIdReturnsCorrectId() {
        employee.setId("321");
        var result = employee.getId();
        assertThat(result).isEqualTo("321");
    }

    @Test
    @DisplayName("getSalary returns correct salary")
    void getSalaryReturnsCorrectSalary() {
        var result = employee.getSalary();
        assertThat(result).isEqualTo(24500.00);
    }

}