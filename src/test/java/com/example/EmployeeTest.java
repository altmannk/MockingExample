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
    @DisplayName("getId should return correct id")
    void getIdShouldReturnsCorrectId() {
        var result = employee.getId();
        assertThat(result).isEqualTo("123");
    }

    @Test
    @DisplayName("setId should set correct id")
    void setIdShouldSetCorrectId() {
        employee.setId("321");
        var result = employee.getId();
        assertThat(result).isEqualTo("321");
    }

    @Test
    @DisplayName("getSalary should return correct salary")
    void getSalaryShouldReturnCorrectSalary() {
        var result = employee.getSalary();
        assertThat(result).isEqualTo(24500.00);
    }

    @Test
    @DisplayName("setSalary should set correct salary")
    void setSalaryShouldSetCorrectSalary() {
        employee.setSalary(30000.00);
        var result = employee.getSalary();
        assertThat(result).isEqualTo(30000.00);
    }

    @Test
    @DisplayName("isPaid should return false by default as paid status")
    void isPaidShouldReturnFalseByDefaultAsPaidStatus() {
        var result = employee.isPaid();
        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("setPaid should set paid status to true")
    void setPaidShouldSetPaidStatusToTrue() {
        employee.setPaid(true);
        var result = employee.isPaid();
        assertThat(result).isTrue();
    }


}