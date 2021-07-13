package com.training.springbootTraining.entity;

import javax.persistence.*;

@Entity(name="employeedetails")
@Table(name="employeedetails")
public class Employee {
    //define fields
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empno")
    private int id;

    @Column(name="ename")
    private String ename;

    public String getJob() {
        return job;
    }

    @Column(name="job")
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Employee() {
    }

    public Employee(int id, String ename) {
        this.id = id;
        this.ename = ename;
//        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                '}';
    }
}
