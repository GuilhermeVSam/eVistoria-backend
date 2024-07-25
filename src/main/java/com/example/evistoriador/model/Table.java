package com.example.evistoriador.model;

import java.util.ArrayList;


public class Table {
    private String title;
    private ArrayList<ArrayList<String>> data;

    public Table(){
        this.title = "";
        this.data = new ArrayList<ArrayList<String>>();
    }

    public String getTitle(String title){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String addLine(String[] line){
        ArrayList<String> matrix = new ArrayList<String>();
        matrix.add(line[0]);
        matrix.add(line[1]);
        data.add(matrix);

        return "aa";
    }

    public String[][] getData(ArrayList<ArrayList<String>> data){
        return convertToMatrix(data);
    }

    public String[][] convertToMatrix(ArrayList<ArrayList<String>> dataList) {
        int numRows = dataList.size();
        int numCols = 0;
        // Find the maximum number of columns
        for (ArrayList<String> row : dataList) {
            numCols = Math.max(numCols, row.size());
        }

        String[][] matrix = new String[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            ArrayList<String> row = dataList.get(i);
            for (int j = 0; j < row.size(); j++) {
                matrix[i][j] = row.get(j);
            }
            // Optional: Fill remaining cells in the row with null or a default value
            for (int j = row.size(); j < numCols; j++) {
                matrix[i][j] = null; // Or any default value
            }
        }

        return matrix;
    }
}
