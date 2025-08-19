package com.tharika.assignment.employees;

public class Employee {
	    private String name;
	    private int employeeId;
	    private double salary;
	    
	    // Protected attribute - accessible within package and subclasses
	    protected String department;
	    
	    // Public constant
	    public static final String COMPANY_NAME = "TNS India Foundation";
	    
	    public Employee() {
	        this.department = "General";
	    }
	    
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        this.department = "General";
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    
	    public double getSalary() {
	        return salary;
	    }
	    
	    /**
	     * Setter method for salary
	     * @param salary employee's salary
	     */
	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	    }
	    
	    public String getDepartment() {
	        return department;
	    }
	    
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    
	    protected String getBasicInfo() {
	        return "ID: " + employeeId + ", Name: " + name + ", Department: " + department;
	    }
	    
	    public String getEmployeeInfo() {
	        return "Employee [" + getBasicInfo() + ", Salary: $" + salary + "]";
	    }
}
