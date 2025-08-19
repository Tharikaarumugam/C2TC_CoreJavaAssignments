package com.tharika.assignment.utilities;

import com.tharika.assignment.employees.Employee;
import com.tharika.assignment.employees.Manager;
import com.tharika.assignment.employees.Developer;
import java.util.List;
import java.util.ArrayList;

public class AssignmentMain  {
    
    // Private static list to store employees
    private static List<Employee> employeeDatabase = new ArrayList<>();
    
    // Public constant
    public static final double MINIMUM_SALARY = 30000.0;
    
    private AssignmentMain() {
        // Private constructor
    }
    
    public static boolean addEmployee(Employee employee) {
        if (employee != null && employee.getSalary() >= MINIMUM_SALARY) {
            employeeDatabase.add(employee);
            return true;
        }
        return false;
    }
    
    public static Employee findEmployeeById(int employeeId) {
        for (Employee emp : employeeDatabase) {
            if (emp.getEmployeeId() == employeeId) {
                return emp;
            }
        }
        return null;
    }
    
    public static void displayAllEmployees() {
        System.out.println("\n=== Employee Database ===");
        if (employeeDatabase.isEmpty()) {
            System.out.println("No employees in database.");
            return;
        }
        
        for (Employee emp : employeeDatabase) {
            System.out.println(emp.getEmployeeInfo());
        }
    }
    
    public static double calculateAverageSalary() {
        if (employeeDatabase.isEmpty()) {
            return 0.0;
        }
        
        double totalSalary = 0.0;
        for (Employee emp : employeeDatabase) {
            totalSalary += emp.getSalary();
        }
        
        return totalSalary / employeeDatabase.size();
    }
    
    public static int countEmployeesByType(Class<? extends Employee> employeeType) {
        int count = 0;
        for (Employee emp : employeeDatabase) {
            if (employeeType.isInstance(emp)) {
                count++;
            }
        }
        return count;
    }
    
    public static List<Manager> getManagersWithLargeTeams(int minTeamSize) {
        List<Manager> result = new ArrayList<>();
        for (Employee emp : employeeDatabase) {
            if (emp instanceof Manager) {
                Manager manager = (Manager) emp;
                if (manager.getTeamSize() > minTeamSize) {
                    result.add(manager);
                }
            }
        }
        return result;
    }
    
    public static List<Developer> getDevelopersByLanguage(String language) {
        List<Developer> result = new ArrayList<>();
        for (Employee emp : employeeDatabase) {
            if (emp instanceof Developer) {
                Developer developer = (Developer) emp;
                if (language.equalsIgnoreCase(developer.getProgrammingLanguage())) {
                    result.add(developer);
                }
            }
        }
        return result;
    }
    
    public static boolean updateEmployeeSalary(int employeeId, double newSalary) {
        Employee emp = findEmployeeById(employeeId);
        if (emp != null && newSalary >= MINIMUM_SALARY) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    public static String getDatabaseStats() {
        int totalEmployees = employeeDatabase.size();
        int managers = countEmployeesByType(Manager.class);
        int developers = countEmployeesByType(Developer.class);
        double avgSalary = calculateAverageSalary();
        
        return String.format(
            "Database Statistics:\n" +
            "Total Employees: %d\n" +
            "Managers: %d\n" +
            "Developers: %d\n" +
            "Average Salary: $%.2f",
            totalEmployees, managers, developers, avgSalary
        );
    }

    public static boolean removeEmployee(int employeeId) {
        Employee emp = findEmployeeById(employeeId);
        if (emp != null) {
            employeeDatabase.remove(emp);
            return true;
        }
        return false;
    }

    public static List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeDatabase);
    }

    public static void clearDatabase() {
        employeeDatabase.clear();
    }

    public static int getTotalEmployeeCount() {
        return employeeDatabase.size();
    }
}
