/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author LAPTOP ACER
 */
public class WorkerList extends ArrayList<Worker>{
    public ArrayList<Worker> search(Predicate<Worker> p){
        ArrayList<Worker> workerList = new ArrayList<>();
        for (Worker w:this){
            if (p.test(w)) workerList.add(w);
        }
        return workerList;
    }
}
