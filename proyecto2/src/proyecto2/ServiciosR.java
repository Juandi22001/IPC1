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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author JUAN DIEGO ALVARADO
 */
public class ServiciosR extends javax.swing.JFrame {

    /**
     * Creates new form ServiciosR
     */
    public ServiciosR() {
        initComponents();
                    Listas.ListaServiciosGeneral.setTabla(jTable2);
            Listas.ListaServiciosGeneral.Servicios2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", " Marca", "Modelo", "Precio", "Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Listas.ListaServiciosGeneral.Barras(jPanel1); 
        for (int i = 0; i < jTable2.getRowCount()-1; i++) {
            for (int j = 0; j < jTable2.getRowCount()-2; j++) {

          Object Precio1 = jTable2.getValueAt(j, 4);
          Object Precio2 = jTable2.getValueAt(j, 3);
          Object Precio3 = jTable2.getValueAt(j, 2);
          Object Precio4 = jTable2.getValueAt(j, 1);
          Object Precio5 = jTable2.getValueAt(j, 0);
                if (Double.parseDouble(jTable2.getValueAt(j+1, 4).toString())>Double.parseDouble(jTable2.getValueAt(j, 4).toString())) {
                
                    
     
                    
           
               
                    jTable2.setValueAt(jTable2.getValueAt(j+1, 4), j, 4);
               jTable2.setValueAt(Precio1, j+1, 4);
                 
                
                    jTable2.setValueAt(jTable2.getValueAt(j+1, 3), j, 3);
               jTable2.setValueAt(Precio2, j+1, 3);
                 
                    jTable2.setValueAt(jTable2.getValueAt(j+1, 2), j, 2);
               jTable2.setValueAt(Precio3, j+1, 2);
                 
                    jTable2.setValueAt(jTable2.getValueAt(j+1, 1), j, 1);
               jTable2.setValueAt(Precio4, j+1, 1);
               
               
                     jTable2.setValueAt(jTable2.getValueAt(j+1, 0), j, 0);
               jTable2.setValueAt(Precio5, j+1, 0);
               
               

                 }
                   }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
String P="";
        JFileChooser j1= new JFileChooser();
        j1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int a=j1.showSaveDialog(this);
        if (a==JFileChooser.APPROVE_OPTION) {
            j1.getSelectedFile().getPath();
        }
      Document d = new   Document();
        try     {
            PdfWriter.getInstance(d, new FileOutputStream(P+"abcd.pdf"));
            
           d.open();
           PdfPTable T = new PdfPTable(6);

           T.addCell("Nombre");
           
           
           T.addCell("Marca");T.addCell("Modelo");T.addCell("PRECIO");T.addCell("registro");
           
        for (int i = 0; i < jTable2.getRowCount(); i++) {
       
          Object Precio = jTable2.getValueAt(i, 5);
          Object Precio1 = jTable2.getValueAt(i, 4);
          Object Precio2 = jTable2.getValueAt(i, 3);
          Object Precio3 = jTable2.getValueAt(i, 2);
          Object Precio4 = jTable2.getValueAt(i, 1);
          Object Precio5 = jTable2.getValueAt(i, 0);
          T.addCell(Precio5.toString());
          T.addCell(Precio4.toString());
  
          T.addCell(Precio3.toString());
                  T.addCell(Precio2.toString());
                  T.addCell(Precio1.toString());
                  T.addCell(Precio.toString());
                 
            }
        d.add(T);
        }
        catch(FileNotFoundException ex){
            
        } catch (DocumentException ex) {
            Logger.getLogger(Repuestos2.class.getName()).log(Level.SEVERE, null, ex);
        }
d.close();



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ServiciosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiciosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiciosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiciosR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiciosR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
