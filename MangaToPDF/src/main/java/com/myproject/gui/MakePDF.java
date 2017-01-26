/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.gui;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Lucci
 */
public class MakePDF extends javax.swing.JFrame {

    /**
     * Creates new form MakePDF
     */
    public MakePDF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        TextFieldPDF = new javax.swing.JTextField();
        ButtonMangaDirectory = new javax.swing.JButton();
        TextFieldManga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ButtonPDFDirectory = new javax.swing.JButton();
        TextFieldPDFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ButtonGeneratePDF = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        LogArea = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Manga directory");

        TextFieldPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPDFActionPerformed(evt);
            }
        });

        ButtonMangaDirectory.setText("Sfoglia");
        ButtonMangaDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMangaDirectoryActionPerformed(evt);
            }
        });

        TextFieldManga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMangaActionPerformed(evt);
            }
        });

        jLabel2.setText("PDF directory");

        ButtonPDFDirectory.setText("Sfoglia");
        ButtonPDFDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPDFDirectoryActionPerformed(evt);
            }
        });

        TextFieldPDFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPDFNameActionPerformed(evt);
            }
        });

        jLabel3.setText("PDF name");

        ButtonGeneratePDF.setText("Generate PDF");
        ButtonGeneratePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGeneratePDFActionPerformed(evt);
            }
        });

        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        LogArea.setEditable(false);
        LogArea.setBackground(new java.awt.Color(0, 0, 0));
        LogArea.setColumns(20);
        LogArea.setForeground(new java.awt.Color(0, 153, 0));
        LogArea.setRows(5);
        jScrollPane2.setViewportView(LogArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextFieldPDFName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(TextFieldPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonPDFDirectory))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(242, 242, 242))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonMangaDirectory))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ButtonReset)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonGeneratePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(TextFieldManga, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(532, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(ButtonMangaDirectory))
                        .addGap(12, 12, 12)
                        .addComponent(TextFieldPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ButtonPDFDirectory))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldPDFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonGeneratePDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonReset, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(TextFieldManga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMangaDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMangaDirectoryActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            TextFieldManga.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_ButtonMangaDirectoryActionPerformed

    private void TextFieldPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPDFActionPerformed

    private void TextFieldMangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMangaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMangaActionPerformed

    private void ButtonPDFDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPDFDirectoryActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            TextFieldPDF.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_ButtonPDFDirectoryActionPerformed

    private void TextFieldPDFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPDFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPDFNameActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
        TextFieldManga.setText(null);
        TextFieldPDF.setText(null);
        TextFieldPDFName.setText(null);
        LogArea.setText(null);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void ButtonGeneratePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGeneratePDFActionPerformed
        // TODO add your handling code here:
        if (!TextFieldManga.getText().isEmpty() & !TextFieldPDF.getText().isEmpty() & !TextFieldPDFName.getText().isEmpty()) {
            LogArea.setText("Scan directory...\n");
            LogArea.update(LogArea.getGraphics());
            try {
                File f = new File(TextFieldManga.getText());
                cap = 0;
                Document document = new Document(PageSize.A4, 50, 50, 50, 50);
                String output = TextFieldPDF.getText() + "//" + TextFieldPDFName.getText() + ".pdf";
                FileOutputStream fos = new FileOutputStream(output);
                PdfWriter writer = PdfWriter.getInstance(document, fos);
                writer.open();
                document.open();
                scorriAlbero(f, document, true);
                document.addAuthor("Francesco Lucci");
                document.addTitle(TextFieldPDFName.getText());
                document.addCreationDate();
                document.close();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            LogArea.setText("Information missing...\n");
        }
    }//GEN-LAST:event_ButtonGeneratePDFActionPerformed

    private void scorriAlbero(File f, Document document, boolean isFirst) {
        File[] lista = f.listFiles();
        try {
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].isDirectory()) {
                    if (ImageIO.read(lista[i]) != null) {
                        if (isFirst) {
                            cap = cap + 1;
                            Paragraph title = new Paragraph("\nCapitolo: " + lista[i].getPath().split("\\\\")[lista[i].getPath().split("\\\\").length - 2], FontFactory.getFont(FontFactory.HELVETICA, 18));
                            Chapter chapter = new Chapter(title, cap);
                            document.add(chapter);
                            isFirst = false;
                        }
                        LogArea.append(lista[i].getPath());
                        
                        Image image = Image.getInstance(lista[i].getPath());
                        image.scaleAbsolute(550f, 770f);
                        document.add(image);
                    }
                } else {
                    LogArea.append("\n" + lista[i].getPath());
                    LogArea.update(LogArea.getGraphics());
                    scorriAlbero(lista[i], document, !isFirst);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MakePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakePDF().setVisible(true);
            }
        });
    }
    private int cap;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGeneratePDF;
    private javax.swing.JButton ButtonMangaDirectory;
    private javax.swing.JButton ButtonPDFDirectory;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JTextArea LogArea;
    private javax.swing.JTextField TextFieldManga;
    private javax.swing.JTextField TextFieldPDF;
    private javax.swing.JTextField TextFieldPDFName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
