package com.example.evistoriador.service;

import java.io.FileOutputStream;
import java.io.IOException;

import com.example.evistoriador.model.DocumentRequest;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class DOCXGen {
    public DOCXGen(DocumentRequest documentRequest){
        try (XWPFDocument document = new XWPFDocument()) {
            // Create a paragraph
            // createParagraph(XWPFDocument document, String text, int fontSize, boolean bold, String fontFamily)
            createParagraph(document, "Relatório de Vistoria de " + documentRequest.getDataInput().getTipoDeVistoria(), 20, true, "Arial");

            addNewlines(document, 2);

            createParagraph(document, "Dados do Cliente", 14, true, "Arial");

            addNewlines(document, 1);

            XWPFParagraph paragraph = document.createParagraph();

            cMFP(document, paragraph, "Código: ", "5868", "Arial", 2);

            cMFP(document, paragraph, "Data: ", "30/10/2023", "Arial", 2);

            cMFP(document, paragraph, "Vistoriador: ", "Rita Bitencourt", "Arial", 0);

            addNewlines(document, 4);

            createParagraph(document, "Dados do Imóvel", 14, true, "Arial");

            addNewlines(document, 1);

            cMFP(document, "Endereço", documentRequest.getDataInput().getEndereco(), "Arial");

            addNewlines(document, 4);

            createParagraph(document, "Características do Imóvel", 14, true, "Arial");

            XWPFParagraph paragraph1 = document.createParagraph();

            cMFP(document, paragraph1, "Dorm: ", documentRequest.getDataInput().getNQuartos(), "Arial", 2);

            cMFP(document, paragraph1, "Banheiros: ", documentRequest.getDataInput().getNBanheiros(), "Arial", 2);

            cMFP(document, paragraph1,  "Vagas de Garagem: ", "2", "Arial", 2);

            for (XWPFParagraph para : document.getParagraphs()) {
                for (XWPFRun run : para.getRuns()) {
                    run.setFontFamily("Arial");
                }
            }

            // Write the document to a file
            try (FileOutputStream out = new FileOutputStream("Example.docx")) {
                document.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createParagraph(XWPFDocument document, String text, int fontSize, boolean bold, String fontFamily) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(text);
        run.setFontSize(fontSize);
        run.setBold(bold);
        run.setFontFamily(fontFamily);
    }

    private void addNewlines(XWPFDocument document, int count) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        for (int i = 0; i < count; i++) {
            run.addCarriageReturn();
        }
    }

    private void cMFP(XWPFDocument document, String boldText, String regularText, String fontFamily) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run1 = paragraph.createRun();
        run1.setText(boldText);
        run1.setBold(true);
        run1.setFontFamily(fontFamily);

        XWPFRun run2 = paragraph.createRun();
        run2.setText(regularText);
        run2.setFontFamily(fontFamily);
    }

    private void cMFP(XWPFDocument document, XWPFParagraph oParagraph, String boldText, String regularText, String fontFamily, int tabbing) {
        XWPFParagraph paragraph = oParagraph;
        XWPFRun run1 = paragraph.createRun();
        run1.setText(boldText);
        run1.setBold(true);
        run1.setFontFamily(fontFamily);

        XWPFRun run2 = paragraph.createRun();
        run2.setText(regularText);
        run2.setFontFamily(fontFamily);
        for (int i = 0; i < tabbing; i++) {
            run2.addTab();
        }
    }
}