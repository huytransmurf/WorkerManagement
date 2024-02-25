/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import model.WorkerList;
import control.App;

/**
 *
 * @author LAPTOP ACER
 */
public class Validation {

    Library lib = new Library();

    public int getAge() {
        int age;
        while (true) {
            age = lib.getInt("Input worker's age(must be in range 18 to 50)");
            if (age < 18 || age > 50) {
                System.out.println("Input out of range");
            } else {
                break;
            }
        }
        return age;
    }

    public double getSalary() {
        double salary;
        while (true) {
            salary = lib.getInt("Input worker's salary(must be greater than 0)");
            if (salary < 0) {
                System.out.println("Input out of range");
            } else {
                break;
            }
        }
        return salary;
    }
    String wcode = "";

    public String getCode() {

        while (true) {
            wcode = lib.getString("Input worker's code(must not be null)");
            if (!App.wList.search(p -> p.getwCode().equals(wcode)).isEmpty()) {
                System.out.println("Dupliacted worker's code");
            } else if (wcode.isBlank()) {
                System.out.println("Code is null");
            } else {
                break;
            }
        }
        return wcode;
    }
    public double getAmount(){
        double amount;
        while(true){
            amount = lib.getDouble("Input amount");
            if (amount < 0){
                System.out.println("Amount must be greater than 0");
            } else break;
        }
        return amount;
    }
}
