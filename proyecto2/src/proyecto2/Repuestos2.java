/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;

import javax.swing.JFileChooser;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class Repuestos2 extends javax.swing.JFrame {

    /**
     * Creates new form Repuestos2
     */
    public Repuestos2() {
        initComponents();        System.out.println("hola");
      System.out.println("hola");
        Listas.ListaRepuestosGeneral.setTabla(jTable1);
                Listas.ListaRepuestosGeneral.LlenarTabla();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDRepuestos", "NombreRepuestos", "Marca", "Modelo", "Existencias ", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HTML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(75, 75, 75)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(47, 47, 47)
                        .addComponent(jButton3)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        Listas.ListaRepuestosGeneral.Barras(jPanel1); 
        for (int i = 0; i < jTable1.getRowCount()-1; i++) {
            for (int j = 0; j < jTable1.getRowCount()-2; j++) {
          Object Precio = jTable1.getValueAt(j, 5);
          Object Precio1 = jTable1.getValueAt(j, 4);
          Object Precio2 = jTable1.getValueAt(j, 3);
          Object Precio3 = jTable1.getValueAt(j, 2);
          Object Precio4 = jTable1.getValueAt(j, 1);
          Object Precio5 = jTable1.getValueAt(j, 0);
          
                if (Double.parseDouble(jTable1.getValueAt(j+1, 5).toString())>Double.parseDouble(jTable1.getValueAt(j, 5).toString())) {
                    jTable1.setValueAt(jTable1.getValueAt(j+1, 5), j, 5);
               jTable1.setValueAt(Precio, j+1, 5);
               
                    jTable1.setValueAt(jTable1.getValueAt(j+1, 4), j, 4);
               jTable1.setValueAt(Precio1, j+1, 4);
                 
                
                    jTable1.setValueAt(jTable1.getValueAt(j+1, 3), j, 3);
               jTable1.setValueAt(Precio2, j+1, 3);
                 
                    jTable1.setValueAt(jTable1.getValueAt(j+1, 2), j, 2);
               jTable1.setValueAt(Precio3, j+1, 2);
                 
                    jTable1.setValueAt(jTable1.getValueAt(j+1, 1), j, 1);
               jTable1.setValueAt(Precio4, j+1, 1);
               
               
                     jTable1.setValueAt(jTable1.getValueAt(j+1, 0), j, 0);
               jTable1.setValueAt(Precio5, j+1, 0);
               
                 }
                   }
        }


// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
            try {
            // TODO add your handling code here:
            Listas.ListaRepuestosGeneral.GuardarReporteRepuestos("html");
        } catch (IOException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:











// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
public void GenerarReporteRepuestos(JEditorPane _ContenedorHTML) {
        NodoRepuestos InicioAux = Listas.ListaRepuestosGeneral.getInicio();
        String FilaTabla = "";
        String HTML = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "    <head>\n"
                + "        <title>Reporte Repuestos</title>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "    <center>\n"
                + "        <h1 class=\"h\"> Reporte Repuestos</h1>\n"
                + "        <table class=\"blueTable\" style=\"width: 80%\" border=\"\">\n"
                + "            <thead>\n"
                  + "                <tr>\n"
                + "                    <td>DPI</td>\n"
                + "                    <td>Nombre</td>\n"
                + "                    <td>MARCA</td>\n"
                + "                    <td>MODELO</td>\n"    
                +"                       <td>EXISTENCIAS</td>\n"
                 +"                       <td>PRECIO</td>\n"
                + "                          </tr> \n"
                + "            </thead>\n"
                + "ContenidoTabla\n"//Todas las filas de la tabla 
                + "        </table>   \n"
                + "    </center>\n"
                + "</body>\n"
                + "</html>";
        
        
    for (int i = 0;  i< jTable1.getRowCount(); i++) {
        
            System.out.println(InicioAux.getNombreRepuesto());
            FilaTabla += " <tr>\n"
                    + "    <td>" + jTable1.getValueAt(i, 0)+ "</td>\n"
                    + "    <td>" +  jTable1.getValueAt(i, 1)+ "</td>\n"
                    + "    <td>" +  jTable1.getValueAt(i, 2)+ "</td>\n"
                    + "    <td>" +  jTable1.getValueAt(i, 3)+ "</td>\n"
                    + "    <td>" +  jTable1.getValueAt(i, 4)+ "</td>\n"
                    + "    <td>" +  jTable1.getValueAt(i, 5)+ "</td>\n"
                    + "   "
                   + "  </tr>\n";
        
    }
  
         
        //Agregamos el contenido de la tabla al html
        String ReporteHTML = HTML.replace("ContenidoTabla", FilaTabla);
        _ContenedorHTML.setContentType("text/html");
        _ContenedorHTML.setText("");
        HTMLEditorKit kit = new HTMLEditorKit();
        StyleSheet styleSheet = kit.getStyleSheet();
        //Reglas CSS
        styleSheet.addRule("body{background: #FE9A2E;}");

        javax.swing.text.Document doc = kit.createDefaultDocument();
        _ContenedorHTML.setEditable(false);
        _ContenedorHTML.setDocument(doc);
        _ContenedorHTML.setText(ReporteHTML);

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Repuestos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Repuestos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Repuestos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Repuestos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Repuestos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}