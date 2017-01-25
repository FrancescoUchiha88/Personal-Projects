/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.engine;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chapter;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Arrays.stream;
import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;

/**
 *
 * @author Lucci
 */
public class MangaEngine {

    public static void  engine(String pathManga,String pathPDF, String namePDF) {

        try {
            File f = new File(pathManga);
            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            String output =  pathPDF + "//" +  namePDF + ".pdf";
            FileOutputStream fos = new FileOutputStream(output);
            PdfWriter writer = PdfWriter.getInstance(document, fos);
            writer.open();
            document.open();
       //     Chapter chapter=new Chapter();
            scorriAlbero(f, document);
            document.addAuthor("Francesco Lucci");
            document.addTitle(namePDF);
            document.addCreationDate();
            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void scorriAlbero(File f, Document document) {
        File[] lista = f.listFiles();
        try {
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].isDirectory()) {
                    if ( ImageIO.read(lista[i]) != null) {
                        System.out.println(lista[i].getPath());
                        Image image = Image.getInstance(lista[i].getPath());
                        image.scaleAbsolute(550f, 770f);
                        document.add(image);
                    }
                } else {
                    System.out.println(lista[i].getPath());
                    scorriAlbero(lista[i], document);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    
    
    
}
