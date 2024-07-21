package com.example.evistoriador.controller;

import com.example.evistoriador.model.DocumentRequest;
import com.example.evistoriador.service.EVistoriadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EVistoriadorController {
    private EVistoriadorService service;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/")
    public ResponseEntity<byte[]> generateDoc(@RequestBody DocumentRequest request){
        service.generateDoc(String.valueOf(request));
        return ResponseEntity.ok().body(request.getInput1().getBytes());
    }

    public ResponseEntity<byte[]> generatePdf(@RequestBody DocumentRequest request){
        service.generatePdf(String.valueOf(request));
        return ResponseEntity.ok().body(request.getInput1().getBytes());
    }
}