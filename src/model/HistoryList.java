/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author LAPTOP ACER
 */
public class HistoryList extends ArrayList<History>{
    public void display(){
        System.out.println("----------------------History-------------------------");
        for (History h : this){
            System.out.println(h);
        }
    }
}
