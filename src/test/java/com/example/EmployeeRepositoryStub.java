package com.example;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository{
    @Override
    public List<Employee> findAll() {

        Employee employee1 = new Employee("567", 24000.0);
        Employee employee2 = new Employee("789", 31000.0);
        Employee employee3 = new Employee("333", 26000.0);

        return Arrays.asList(employee1, employee2, employee3);
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
