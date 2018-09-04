package com.zyy.strategy;

import java.util.Objects;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018/8/25 上午9:16
 * @Vertion 1.0
 **/
public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private Status ststus;

    public Status getStstus() {
        return ststus;
    }

    public void setStstus(Status ststus) {
        this.ststus = ststus;
    }

    public Employee(){}

    public Employee(Integer age){
        this.age = age;
    }

    public Employee(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public Employee(String name, Integer age, Double salary, Status ststus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.ststus = ststus;
    }

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salary, employee.salary) &&
                ststus == employee.ststus;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, salary, ststus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", ststus=" + ststus +
                '}';
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}
