/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author LAPTOP ACER
 */
public class History {
    private Worker worker;
    private boolean status;
    private LocalDate date;

    public History(Worker worker, boolean status, String date) {
        this.worker = worker;
        this.status = status;
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    

    public History() {
    }

    public Worker getWorker() {
        return worker;
    }

    public boolean isStatus() {
        return status;
    }

    

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String statusText;
        if (this.status){
            statusText = "UP";
        } else statusText = "DOWN";
        return String.format("%-6s %-10s %-6d %-12.3f %-8s %-10s",worker.getwCode(),worker.getwName(),worker.getwAge(), worker.getwSalary(),statusText,DateTimeFormatter.ofPattern("dd/MM/yyyy").format(date) );
    }
    
   
    
}
