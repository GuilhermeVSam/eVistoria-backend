package com.example.evistoriador.controller;

import com.example.evistoriador.model.DocumentRequest;
import com.example.evistoriador.service.EVistoriadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5173")
public class EVistoriadorController {
    private EVistoriadorService service = new EVistoriadorService();

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/generateDoc")
    public void generateDoc(@RequestParam(value = "input1") String input1){
        System.out.println("Hello World");
        System.out.println("AAA");
        service.generateDoc(input1);
    }

    @PostMapping("/pdf")
    public ResponseEntity<byte[]> generateDoc(@RequestBody DocumentRequest request){
        return null;
    }

    public ResponseEntity<byte[]> generatePdf(@RequestBody DocumentRequest request){
        service.generatePdf(String.valueOf(request));
        return null;
    }

    @PostMapping("/logJson")
    public ResponseEntity<String> logJson(@RequestBody String jsonPayload) throws IOException {
        service.logJson(jsonPayload);
        return null;
    }
}