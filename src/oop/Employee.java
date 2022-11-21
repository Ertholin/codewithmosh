package oop;

public class Employee {

    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
        // new Employee().calculateWage();
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary cannot less or equal than 0");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly cannot less or equal than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }
    public int calculateWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0);
    }
}
