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
        employee = new Employee("123", 24500.0);
    }


    @Test
    @DisplayName("setId should set correct id")
    void setIdShouldSetCorrectId() {
        employee.setId("321");
        var result = employee.getId();
        assertThat(result).isEqualTo("321");
    }


    @Test
    @DisplayName("setSalary should set correct salary")
    void setSalaryShouldSetCorrectSalary() {
        employee.setSalary(30000.00);
        var result = employee.getSalary();
        assertThat(result).isEqualTo(30000.0);
    }


    @Test
    @DisplayName("setPaid should set paid status to true")
    void setPaidShouldSetPaidStatusToTrue() {
        employee.setPaid(true);
        var result = employee.isPaid();
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Getting Employee attributes then values should match initial values")
    void gettingEmployeeAttributesThenValuesShouldMatchInitialValues() {
        var employeeId = employee.getId();
        var employeeSalary = employee.getSalary();
        var isEmployeePaid = employee.isPaid();

        assertThat(employeeId).isEqualTo("123");
        assertThat(employeeSalary).isEqualTo(24500.0);
        assertThat(isEmployeePaid).isFalse();
    }

    @Test
    @DisplayName("toString should return expected format")
    void toStringShouldReturnExpectedFormat() {
        var result = employee.toString();
        assertThat(result).isEqualTo("Employee [id=123, salary=24500.0]");
    }

}