/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.engine;

import com.itextpdf.text.Chapter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Lucci
 */
public class MangaEngine {

    private static int cap;
    
    public static void engine(String pathManga, String pathPDF, String namePDF) {

        try {
            File f = new File(pathManga);
            cap=0;
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            String output = pathPDF + "//" + namePDF + ".pdf";
            FileOutputStream fos = new FileOutputStream(output);
            PdfWriter writer = PdfWriter.getInstance(document, fos);
            writer.open();
            document.open();
            scorriAlbero(f, document, true);
            document.addAuthor("Francesco Lucci");
            document.addTitle(namePDF);
            document.addCreationDate();
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void scorriAlbero(File f, Document document, boolean isFirst) {
        File[] lista = f.listFiles();
        try {
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].isDirectory()) {
                    if (ImageIO.read(lista[i]) != null) {
                        if (isFirst) {
                            cap=cap+1;
                            
                            Paragraph title = new Paragraph("This is Chapter 2", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLDITALIC, new Color(0, 0, 255)));
                            Chapter chapter = new Chapter(title, cap);    
                            //Chapter chapter = new Chapter(" " + lista[i].getPath().split("\\\\")[lista[i].getPath().split("\\\\").length - 2], 1);
                            //System.out.println("----------------CAPITOLO: " + cap + " - " +lista[i].getPath().split("\\\\")[lista[i].getPath().split("\\\\").length - 2] + "----------------------");
                            
                            document.add(chapter);
                            isFirst = false;
                        }
                        //System.out.println(lista[i].getPath());
                        Image image = Image.getInstance(lista[i].getPath());
                        image.scaleAbsolute(550f, 770f);
                        document.add(image);
                    }
                } else {
                    //System.out.println(lista[i].getPath());
                    scorriAlbero(lista[i], document, !isFirst);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
