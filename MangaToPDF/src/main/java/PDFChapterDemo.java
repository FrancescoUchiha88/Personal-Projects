
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDFChapterDemo {
    public static void main(String[] args) throws BadElementException, IOException {
        // Creates a new document
        Document document = new Document();
        try {
            // Prepare PDF writer and open the document.
            PdfWriter.getInstance(document,
                    new FileOutputStream("C:\\Users\\Administrator\\Desktop\\PDFChapterDemo.pdf"));
            document.open();

            // Creates a new Chapter object
            Chapter chapter = new Chapter("Chapter One",1);
            Image image = Image.getInstance("C:\\Users\\Administrator\\Desktop\\02.jpg");
            image.scaleAbsolute(550f, 770f);
           
            document.add(image);
            document.add(chapter);
            
            
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}