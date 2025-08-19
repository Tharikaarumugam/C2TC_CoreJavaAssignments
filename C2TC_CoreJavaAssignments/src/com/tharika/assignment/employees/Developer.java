package com.tharika.assignment.employees;

public class Developer extends Employee {
    // Private attributes specific to Developer
    private String programmingLanguage;
    private String projectName;
    private int experienceYears;
    
    public Developer() {
        super();
        this.department = "Development"; // Accessing protected member from parent
        this.programmingLanguage = "Java";
    }
    
    public Developer(String name, int employeeId, double salary, 
                    String programmingLanguage, String projectName) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.projectName = projectName;
        this.department = "Development";
        this.experienceYears = 0;
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    public String getProjectName() {
        return projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public int getExperienceYears() {
        return experienceYears;
    }
    
    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        }
    }
    
    public String getSkillLevel() {
        if (experienceYears < 2) return "Junior";
        else if (experienceYears < 5) return "Mid-Level";
        else return "Senior";
    }
    
    @Override
    public String getEmployeeInfo() {
        return "Developer [" + getBasicInfo() + ", Salary: $" + getSalary() + 
               ", Language: " + programmingLanguage + ", Project: " + projectName + 
               ", Experience: " + experienceYears + " years, Level: " + getSkillLevel() + "]";
    }
}

