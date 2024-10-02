package com.example.evistoriador.service;
import com.example.evistoriador.model.DocumentRequest;
import com.google.gson.Gson;

public class EVistoriadorService {
    public String hello(String name) {
        return String.format("Hello %s!", name);
    }

    public byte[] generateDoc(String input1){
        return input1.getBytes();
    }

    public byte[] generatePdf(String input1){
        return input1.getBytes();
    }

    public void logJson(String jsonPayload){
        System.out.println("Received JSON: " + jsonPayload);
        Gson gson = new Gson();

        DocumentRequest document = gson.fromJson(jsonPayload, DocumentRequest.class);
        DOCXGen docxGen = new DOCXGen(document);
    }
}
