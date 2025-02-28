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
    @DisplayName("Setting Employee attributes then value should be updated")
    void settingEmployeeAttributesThenValueShouldBeUpdated() {
        employee.setId("321");
        employee.setSalary(30000.0);
        employee.setPaid(true);

        assertThat(employee.getId()).isEqualTo("321");
        assertThat(employee.getSalary()).isEqualTo(30000.0);
        assertThat(employee.isPaid()).isTrue();
    }

    @Test
    @DisplayName("toString should return expected format")
    void toStringShouldReturnExpectedFormat() {
        var result = employee.toString();
        assertThat(result).isEqualTo("Employee [id=123, salary=24500.0]");
    }

}