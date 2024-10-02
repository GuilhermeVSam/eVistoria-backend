package com.example.evistoriador.model;

import java.util.ArrayList;
import java.util.List;

public class TableData{
    private List<Table> tables;

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "tablesData=" + tables +
                '}';
    }

    public static class Table {
        private String title;
        private List<String> fields;

        public String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public List<String> getFields() {
            return fields;
        }

        public void setFields(List<String> fields) {
            this.fields = fields;
        }

        @Override
        public String toString() {
            return "Table{" +
                    "title='" + title + '\'' +
                    ", fields=" + fields +
                    '}';
        }
    }
}