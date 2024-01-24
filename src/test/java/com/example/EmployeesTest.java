package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class EmployeesTest {

    @Test
    @DisplayName("payEmployees should return correct count for successful payments")
    void payEmployeesShouldReturnCorrectCountForSuccessfulPayments() {
        BankService bankService = new BankServiceStub();
        EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
        Employees employees = new Employees(employeeRepository, bankService);

        int payments = employees.payEmployees();

        assertThat(payments).isEqualTo(3);
    }

}