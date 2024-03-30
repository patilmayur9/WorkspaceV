package com.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass {

 
    public static void main(String[] args) {
        // Sample data
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "John", new Address(101, "City1", 12345)),
                new Employee(1, "Jane","John", new Address(102, "City2", 12345)),
                new Employee(3, "Doe", "John",new Address(103, "City1", 67890)),
                new Employee(3, "Smith","John", new Address(104, "City2", 67890))
        );
        //get employee names group by empId
        Map<Integer, List<String>> e =  employees.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.mapping(Employee::getName, Collectors.toList())));
        e.forEach((id, empname) -> {
            System.out.println("emp id " + id);
            empname.forEach(empName -> System.out.println("  Employee: " + empName));
            System.out.println();
        });
        //get employee objects  group by empID
        Map<Integer, List<Employee>> empl =  employees.stream().collect(Collectors.groupingBy(emp -> emp.getId()));
       
        empl.forEach((id, employeeList) -> {
            System.out.println("emp id " + id);
            employeeList.forEach(employee -> System.out.println("  Employee: " + employee));
            System.out.println();
        });
        // Group employees by zip code
        Map<Integer, List<Employee>> employeesByZipCode = employees.stream()
        		.collect(Collectors.groupingBy(employee -> employee.getAddress().getZipCode()));

        
        // Print the result
        employeesByZipCode.forEach((zipCode, employeeList) -> {
            System.out.println("Zip Code: " + zipCode);
            employeeList.forEach(employee -> System.out.println("  Employee: " + employee));
            System.out.println();
        });
        
        
        
        // Using IntStream to sum numbers from 0 to 50 
        int sum = IntStream.rangeClosed(0, 50)
                .sum();
    }
/*
 * Map<City, Set<String>> namesByCity
   = people.stream().collect(
     groupingBy(Person::getCity,
                TreeMap::new,
                mapping(Person::getLastName,
                        toSet())));
 */
  /*
   *  Map<City, Set<String>> namesByCity
   = people.stream().collect(
     groupingBy(Person::getCity,
                mapping(Person::getLastName,
                        toSet())));
   */
    /*
     *  ConcurrentMap<City, Set<String>> namesByCity
   = people.stream().collect(
     groupingByConcurrent(Person::getCity,
                          ConcurrentSkipListMap::new,
                          mapping(Person::getLastName,
                                  toSet())));
     */
  
    
}