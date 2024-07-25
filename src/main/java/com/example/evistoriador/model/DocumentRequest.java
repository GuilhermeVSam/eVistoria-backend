package com.example.evistoriador.model;

import java.util.ArrayList;
import java.util.List;

public class DocumentRequest {
    private List<TableData> tableData;
    private DocumentData documentData;

    public DocumentRequest(List<TableData> tableData, String dataInput){
        this.tableData = tableData;
        this.documentData = new DocumentData(dataInput);
    }
}