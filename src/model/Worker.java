/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LAPTOP ACER
 */
public class Worker {
    private String wCode, wName,wLocation;
    private int wAge;
    private double wSalary;

    public Worker() {
    }

    public Worker(String wCode, String wName, String wLocation, int wAge, double wSalary) {
        this.wCode = wCode;
        this.wName = wName;
        this.wLocation = wLocation;
        this.wAge = wAge;
        this.wSalary = wSalary;
    }

    public String getwCode() {
        return wCode;
    }

    public String getwName() {
        return wName;
    }

    public String getwLocation() {
        return wLocation;
    }

    public int getwAge() {
        return wAge;
    }

    public double getwSalary() {
        return wSalary;
    }

    public void setwCode(String wCode) {
        this.wCode = wCode;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public void setwLocation(String wLocation) {
        this.wLocation = wLocation;
    }

    public void setwAge(int wAge) {
        this.wAge = wAge;
    }

    public void setwSalary(double wSalary) {
        this.wSalary = wSalary;
    }
     
}
