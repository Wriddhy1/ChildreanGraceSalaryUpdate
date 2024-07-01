package com.oop.childreangracesalaryupdate;

public class Teacher {
    String name;
    String month;
    String salary;

    public Teacher(String name, String month, String salary) {
        this.name = name;
        this.month = month;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
