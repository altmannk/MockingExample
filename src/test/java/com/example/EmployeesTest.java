package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

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

    @Test
    @DisplayName("payEmployees should return 0 for unsuccessful payments (Mockito)")
    void payEmployeesShouldReturn0ForUnsuccessfulPayments() {
        BankService bankServiceMock = Mockito.mock(BankService.class);
        doThrow(RuntimeException.class).when(bankServiceMock).pay(anyString(), anyDouble());

        EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
        Employees employees = new Employees(employeeRepository, bankServiceMock);

        int payments = employees.payEmployees();

        // Verifiera att antalet lyckade betalningar är 0 eftersom RuntimeException kastas för varje betalning
        assertThat(payments).isEqualTo(0);
        // Verifiera att metoden anropats
        verify(bankServiceMock, times(3)).pay(anyString(), anyDouble());
        // kontrollera isPaid() är falskt för varje employee i findAll()
        assertThat(employeeRepository.findAll()).extracting(Employee::isPaid).containsOnly(false);
    }
}