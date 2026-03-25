package com.example;

public class Main {

    public static void main(String[] args) throws Exception {

        // Step 1: Create table
        EmployeeDAO.createTable();

        // Step 2: Insert data
        EmployeeDAO.insert(new Employee(1, "diljot", "diljot@gmail.com", 21));
        EmployeeDAO.insert(new Employee(2, "John", "john@gmail.com", 25));

        // Step 3: Fetch data
        System.out.println("Before Update:");
        EmployeeDAO.fetch();

        // Step 4: Update
        EmployeeDAO.update(1, "jot");

        // Step 5: Delete
        EmployeeDAO.delete(2);

        // Step 6: Fetch again
        System.out.println("After Update & Delete:");
        EmployeeDAO.fetch();
    }
}