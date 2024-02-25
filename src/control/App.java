/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import common.Library;
import common.Validation;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import model.History;
import model.HistoryList;
import model.Worker;
import model.WorkerList;
import view.Menu;

/**
 *
 * @author LAPTOP ACER
 */
public class App extends Menu<String> {

    private Validation val = new Validation();
    private Library lib = new Library();
    public static WorkerList wList = new WorkerList();
    public static HistoryList hList = new HistoryList();
    private static String[] mc = {"Add worker", "Increase salary", "Decrease salary", "Show history", "Exit"};

    public App() {
        super("MENU", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                doAddWorker();
                break;
            case 2:
                doIncreaseSalary();
                break;
            case 3:
                doDecreaseSalary();
                break;
            case 4:
                hList.display();
                break;
            case 5:
                System.out.println("Exitting...");
                System.exit(0);
        }
    }

    public void doAddWorker() {
        String code = val.getCode();
        String name = lib.getString("Input worker's name");
        int age = val.getAge();
        double salary = val.getSalary();
        String wLoca = lib.getString("Input worker's location");
        wList.add(new Worker(code, name, wLoca, age, salary));
        System.out.println("Adding successfully!!!");
    }

    public void doIncreaseSalary() {
        String code = lib.getString("Input code");
        ArrayList<Worker> list = wList.search(p -> p.getwCode().equals(code));
        if (list.isEmpty()) {
            System.out.println("Not found");
        } else {
            double amount = val.getAmount();
            Worker w = list.get(0);
            w.setwSalary(w.getwSalary() + amount);
            LocalDateTime currentTime = LocalDateTime.now();
            String formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(currentTime);
            hList.add(new History(w, true, formattedDate));
        }
    }

    public void doDecreaseSalary() {
        String code = lib.getString("Input code");
        ArrayList<Worker> list = wList.search(p -> p.getwCode().equals(code));
        if (list.isEmpty()) {
            System.out.println("Not found");
        } else {
            double amount = val.getAmount();
            Worker w = list.get(0);
            w.setwSalary(w.getwSalary() - amount);
            LocalDate currentTime = LocalDate.now();
            String formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(currentTime);
            hList.add(new History(w, false, formattedDate));
        }
    }

    public static void main(String[] args) {
        wList.add(new Worker("W1", "Gia Huy", "Quang Nam", 19, 2000));
        wList.add(new Worker("W2", "Van Dat", "Quang Binh", 19, 2000));
        new App().run();
    }
}
