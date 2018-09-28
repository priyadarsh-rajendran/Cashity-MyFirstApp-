package com.project.priyadarshrajendran.cashity;

/**
 * Created by Priyadarshini Rajendran on 3/2/2017.
 */

public class Graph_all_List {
    private int id;
    private String name;
    private int amount;

    public Graph_all_List (int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
