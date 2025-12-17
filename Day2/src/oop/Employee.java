package oop;

public class Employee {
    private int id;
    private String name;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double hra = basicSalary*0.20;
        double da = basicSalary*0.10;
        return basicSalary+hra+da;
    }

    public void display() {
        System.out.println("id =" + id + " , name = " + name + " , salary = " + calculateSalary());
    }
}
