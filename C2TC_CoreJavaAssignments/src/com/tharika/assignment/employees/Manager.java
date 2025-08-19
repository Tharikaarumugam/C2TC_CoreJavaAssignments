package com.tharika.assignment.employees;

public class Manager extends Employee {
    // Private attributes specific to Manager
    private int teamSize;
    private String managementLevel;
    private double bonus;
 
    public Manager() {
        super();
        this.department = "Management"; // Accessing protected member from parent
        this.managementLevel = "Mid-Level";
    }
    
    public Manager(String name, int employeeId, double salary, int teamSize, String managementLevel) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
        this.managementLevel = managementLevel;
        this.department = "Management";
        this.bonus = 0.0;
    }
    
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        }
    }
    
    public String getManagementLevel() {
        return managementLevel;
    }
    
    public void setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    public double getTotalCompensation() {
        return getSalary() + bonus;
    }
    
    @Override
    public String getEmployeeInfo() {
        return "Manager [" + getBasicInfo() + ", Salary: $" + getSalary() + 
               ", Team Size: " + teamSize + ", Level: " + managementLevel + 
               ", Bonus: $" + bonus + ", Total: $" + getTotalCompensation() + "]";
    }
}
