package com.java.other.java8;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PeekOperation {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);

        empList.stream()
                .peek(e -> e.salaryIncrement(10.0)) //intermediate operation: for multiple operations
                .peek(System.out::println)
                .collect(Collectors.toList());

       /* empList.stream()
                .sorted((e,f)-> e.name.compareTo(f.name))*/

        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);

        Double sumSal = empList.stream()
                .map(e->e.getSalary(e))
                .reduce(0.0, Double::sum);


    }

    private static class Employee {
        int id; String name;
        double salary;
        public Employee(int i, String n, double v) {
             id = i ;
             name = n;
             salary = v;
        }

        public void salaryIncrement(double v) {
            salary += v;
        }

        public double getSalary(Employee employee) {
            return employee.salary;
        }
    }
}
