package com.example.evistoriador.service;

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
}
