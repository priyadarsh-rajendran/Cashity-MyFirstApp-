package com.project.priyadarshrajendran.cashity;

/**
 * Created by Priyadarshini Rajendran on 3/2/2017.
 */

public class ListView_List {
    private int id;
    private String name;

    public ListView_List(int id, String name){
        this.name = name;
        this.id = id;
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
}
