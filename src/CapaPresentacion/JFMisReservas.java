package CapaPresentacion;

import CapaComun.Cm_ClsComida;
import CapaComun.Cm_ClsReserva;
import CapaNegocio.Ng_ClsComida;
import CapaNegocio.Ng_ClsReserva;
import java.awt.Color;
import java.awt.GridLayout;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Dennis David
 */
public class JFMisReservas extends javax.swing.JFrame {

    List<Cm_ClsReserva> listaMisReserva;
    List<Cm_ClsComida> listaComidaXId;
    List<Cm_ClsComida> listaAllComida;
    Ng_ClsComida ng_comida;
    Ng_ClsReserva ng_reserva;
    int rowLista;
    boolean isReserveSelected = false;
    
    public JFMisReservas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JFMisReservas(List<Cm_ClsReserva> misReservas) {
        initComponents();
        ng_comida = new Ng_ClsComida();
        ng_reserva = new Ng_ClsReserva();
        listaMisReserva = misReservas;
        listaAllComida = ng_comida.mostrarComidaTabla();
        //listaComidaXId = ng_comida.mostrarComidaXId(2);
     
        mostrarDatosReserva();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMisReservas = new javax.swing.JTable();
        jBAceptar = new javax.swing.JButton();
        jBBorrarReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("MIS RESERVAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTablaMisReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Asiento", "Comida", "Acción"
            }
        ));
        jTablaMisReservas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTablaMisReservasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTablaMisReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMisReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaMisReservas);

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBBorrarReserva.setText("Eliminar Reservación");
        jBBorrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jBBorrarReserva)
                        .addGap(85, 85, 85)
                        .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jBBorrarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarDatosReserva() {
        DefaultTableModel model = (DefaultTableModel) jTablaMisReservas.getModel();
        Object rowData[] = new Object[4];
        model.setNumRows(0);
        for (int i = 0; i < listaMisReserva.size(); i++) {
            rowData[0] = listaMisReserva.get(i).getFecha();
            rowData[1] = listaMisReserva.get(i).getIdAsientoFk();
            System.out.println("listaMisReserva.get(i).getIdComidaFk(): "+listaMisReserva.get(i).getIdComidaFk());
            rowData[2] = listaAllComida.get(listaMisReserva.get(i).getIdComidaFk() - 1).getNombre();
            rowData[3] = "ELIMINAR";
            model.addRow(rowData);
        }
    }

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jTablaMisReservasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTablaMisReservasAncestorAdded

    }//GEN-LAST:event_jTablaMisReservasAncestorAdded

    private void jBBorrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarReservaActionPerformed
        // TODO add your handling code here:
       // 
       if(isReserveSelected){
        listaMisReserva.get(rowLista).getId();
        System.out.println("  listaMisReserva.get(rowLista).getId() : "+   listaMisReserva.get(rowLista).getId());
        ng_reserva.borrarReserva(listaMisReserva.get(rowLista).getId());
        JOptionPane.showMessageDialog(null, "Reserva Eliminada: "+ listaMisReserva.get(rowLista).getId());
        listaMisReserva = JFReserva.llenarTablaReservas();
        this.mostrarDatosReserva();
       }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una reserva para eliminar!");
       }
      
    }//GEN-LAST:event_jBBorrarReservaActionPerformed

    private void jTablaMisReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMisReservasMouseClicked
      // TODO add your handling code here:
         isReserveSelected = true;
        JTable source = (JTable)evt.getSource();
        rowLista = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint( evt.getPoint() );
        String s = source.getModel().getValueAt(rowLista, column)+"";
        //JOptionPane.showMessageDialog(null, "Value: "+ s + "Columna: " +column +"rowLista Fila: " +rowLista);
        
    }                                    

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {                                      
        System.out.println("testing ok ok pu color here ");
        //this.jTable2.setDefaultRenderer(Object.class,new MyCellRenderer());
    }//GEN-LAST:event_jTablaMisReservasMouseClicked

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
            java.util.logging.Logger.getLogger(JFMisReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMisReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMisReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMisReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMisReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBBorrarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMisReservas;
    // End of variables declaration//GEN-END:variables
}
