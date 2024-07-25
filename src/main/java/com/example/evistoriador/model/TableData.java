package com.example.evistoriador.model;

import java.util.ArrayList;

public class TableData{
    private String title;
    private ArrayList<String> lines;

    public TableData() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }
}