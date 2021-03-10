 
package CapaPresentacion;

import CapaComun.Cm_ClsAsiento;
import CapaComun.Cm_ClsClase;
import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsComboItem;
import CapaComun.Cm_ClsComida;
import CapaComun.Cm_ClsPais;
import CapaComun.Cm_ClsReserva;
import CapaNegocio.Ng_ClsAsiento;
import CapaNegocio.Ng_ClsClase;
import CapaNegocio.Ng_ClsCliente;
import CapaNegocio.Ng_ClsComida;
import CapaNegocio.Ng_ClsReserva;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author Dennis David
 */
public class JFReserva extends javax.swing.JFrame implements MouseListener {

    Ng_ClsComida ng_comida;
    Ng_ClsAsiento ng_asiento;
    Ng_ClsClase ng_clase;
    List<Cm_ClsAsiento> listaAsiento;
    List<Cm_ClsComida> listaComida;
    List<Cm_ClsClase> listaClase;
    static Ng_ClsReserva dt_reserva;
    JFActualizarDatos jfactualizarDatos;
    static Cm_ClsCliente cm_cliente;
    Cm_ClsAsiento cm_asiento;
    
   // Ng_ClsReserva ng_reserva;
    static List<Cm_ClsReserva> listaReserva;
    
    public static JButton btnAsientos[];
    ArrayList<Integer> listAsientosOcupados;
    ArrayList<Integer> listAsientosSelect;
    JPanel panel;
    int contadorAsiento = 0;
    int idAsientoSelect = 0;
    
    public JFReserva() {
        initComponents();
        System.out.println("JFReserva public static void main(String args[]) Initialized");
        cm_cliente = new Cm_ClsCliente();
        cm_asiento = new Cm_ClsAsiento();
        this.setLocationRelativeTo(null);
        
    }

    public JFReserva(Cm_ClsCliente clienteLogueado) {
        initComponents();
        System.out.println("JFReserva Initialized Con Param");
        ng_comida = new Ng_ClsComida();
        ng_asiento = new Ng_ClsAsiento();
        ng_clase = new Ng_ClsClase();
        dt_reserva = new Ng_ClsReserva();
        listaClase = ng_clase.mostrarClaseAll(jCBClase);
        listaComida = ng_comida.mostrarComidaAll(jCBReservaComida);
        
        cm_cliente = clienteLogueado;
        lblUsuario.setText(cm_cliente.getNombre() + " " + cm_cliente.getApellido());
        
        System.out.println("Cliente logueado es: " + cm_cliente.getNombre() + " " + cm_cliente.getApellido());
        listaReserva = dt_reserva.mostrarReservasXIdCliente(cm_cliente.getId());
        System.out.println("listaReserva: " + listaReserva.size());
        this.setLocationRelativeTo(null);
        
        listAsientosSelect = new ArrayList<>();
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBActualizarUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBReservaComida = new javax.swing.JComboBox<>();
        jBReservar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jCBClase = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jBMisReservas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reserve su viaje:");

        jBActualizarUsuario.setText("Actualizar Usuario");
        jBActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione su comida:");

        jBReservar.setText("Reservar");
        jBReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReservarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCBClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClaseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido"));

        lblUsuario.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUsuario.getAccessibleContext().setAccessibleName("");

        jBMisReservas.setText("Mis Reservas");
        jBMisReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMisReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jBSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBReservar)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addGap(23, 23, 23)
                        .addComponent(jCBReservaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBActualizarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBMisReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBActualizarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jBMisReservas)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBReservaComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBReservar)
                    .addComponent(jBSalir))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        JFLogin login;
        login = new JFLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReservarActionPerformed

        if(listAsientosSelect.size() == 0 ) {
                System.out.println("Seleccione un asiento");
                 JOptionPane.showMessageDialog(null, "Seleccione un asiento");
            }
        
        for (int i = 0; i < listAsientosSelect.size(); i++) {
            System.out.println("Arraylist contains:" + listAsientosSelect.get(i));
            System.out.println("listaAsiento.get(i).getId()" + listaAsiento.get(i).getId());
            System.out.println("listaAsiento.get(i).getId_clse_FK()" + listaAsiento.get(i).getId_clse_FK());
            
            System.out.println("idAsientoSelect es: " + idAsientoSelect);
            
            if(idAsientoSelect == 0 ) {
                System.out.println("Seleccione un asiento");
                 JOptionPane.showMessageDialog(null, "Seleccione un asiento");
            } else{
                int resultado = ng_asiento.actualizarEstadoAsiento(idAsientoSelect,
                    "Ocupado");
                System.out.println("luego resultado");
                if (resultado > 0) {

                    Object item = jCBReservaComida.getSelectedItem();
                    String value = ((Cm_ClsComboItem) item).getValue();
                    int resultado2 = dt_reserva.insertarReserva(cm_cliente.getId(), idAsientoSelect, Integer.parseInt(value));

                   
                     if(resultado2 > 0) {
                        
                        JFMostrarReserva jfMostrarReserva = new JFMostrarReserva(new Cm_ClsReserva());
                        jfMostrarReserva.setVisible(true);
                         System.out.println("idAsientoSelect " + idAsientoSelect);
                       
                         btnAsientos[idAsientoSelect-1].setBackground(Color.RED);
                         listaAsiento.get(idAsientoSelect - 1).setEstado("Ocupado");
                         listAsientosSelect.remove(0);
                                                  
                     } else {
                         JOptionPane.showMessageDialog(null, "Fail Ingreso Reserva");
                     }
                } else {
                    JOptionPane.showMessageDialog(null, "Fallo Asiento");
                }
            }
           
        }
         
    }//GEN-LAST:event_jBReservarActionPerformed

    private void jCBClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClaseActionPerformed

        System.out.println("SElected item index es: " + jCBClase.getSelectedIndex());

        if (jCBClase.getItemCount() > 1) {
            Object item = jCBClase.getSelectedItem();
            
            if(item instanceof Cm_ClsComboItem ) {
                String idClaseFk = ((Cm_ClsComboItem) item).getValue();
                System.out.println("idClaseFk: " + idClaseFk);
                listaAsiento = ng_asiento.mostrarAsientoXClase(Integer.parseInt(idClaseFk));
               
                createButtoms();
                reviewStatusAsiento();
            } else {
                //limpiar
                panel.setVisible(false);
                
            }
            
            
        }
         
    }//GEN-LAST:event_jCBClaseActionPerformed

    //Create buttom dinamically 
        public void createButtoms() {
              
        btnAsientos = new JButton[listaAsiento.size()];
        panel = new JPanel(new GridLayout(0, 5, 10, 10));
        for (int i = 0; i < btnAsientos.length; i++) {
            btnAsientos[i] = new JButton(String.valueOf(listaAsiento.get(i).getId()));
            btnAsientos[i].setText("No. " + (i+1));
            btnAsientos[i].setBackground(Color.GREEN);
            //btnAsientos[i].
            add(btnAsientos[i]);
            panel.add(btnAsientos[i]);
            setVisible(true);
            btnAsientos[i].addMouseListener(this);
        }
        scrollPane1.add(panel);
    }
    
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
   
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < listaAsiento.size(); i++) {
            if ((btnAsientos[i] == (JButton) e.getSource())) {              
                int idxSelected = listAsientosSelect.lastIndexOf(i) > -1 ? listAsientosSelect.get(listAsientosSelect.lastIndexOf(i)) : -1;
                
                System.out.println("listAsientosSelect.lastIndexOf(i) es: " + listAsientosSelect.lastIndexOf(i));
                System.out.println("idxSelected es: " + idxSelected);
                System.out.println("i es: " + i);
                System.out.println(idxSelected == i);
                
                if(listaAsiento.get(i).getEstado().equals("Ocupado")) {
                    System.out.println("No hace nada :(");
                    idAsientoSelect =  0;
                } else {
                    if (idxSelected == i ) {
                    listAsientosSelect.remove(listAsientosSelect.lastIndexOf(i));
                    btnAsientos[i].setBackground(Color.GREEN);
                    idAsientoSelect =  0;
                    
                    //System.out.println("Double Click" + (i + 1));
                   // System.out.println("listAsientosSelect.size() es: " + listAsientosSelect.size());
                    //System.out.println("listaAsiento.get(i) es: " + listaAsiento.get(i).getId());
                    //System.out.println("listAsientosSelect.lastIndexOf(i) es: " + listAsientosSelect.lastIndexOf(i));
                    
                   // System.out.println("listAsientosSelect.size() es: " + listAsientosSelect.size());
                } else {
                    // JOptionPane.showMessageDialog(null, "Este es el id: " + i );
                    listAsientosSelect.add(i);
                    idAsientoSelect =  listaAsiento.get(i).getId();
                    btnAsientos[i].setBackground(Color.ORANGE);
                    
                    if(listAsientosSelect.size() >= 2) {
                        btnAsientos[listAsientosSelect.get(0)].setBackground(Color.GREEN);
                        listAsientosSelect.remove(0);
                    } 
                }
                }
            }
        }
    }
     
    public void reviewStatusAsiento() {
         System.out.println("reviewStatusAsiento");
        listAsientosOcupados = new ArrayList<>();
        for (int i = 0; i < listaAsiento.size(); i++) {
            if (listaAsiento.get(i).getEstado().equals("Ocupado")) {
                listAsientosOcupados.add(i);
                 System.out.println("\n reviewStatusAsiento: " + i);
            }
        }
        displaydata(listAsientosOcupados);
    }
    
       public static void displaydata(ArrayList l) {
        for (int i = 0; i < l.size(); i++) {
            int indice = (int) l.get(i);
            //btnAsientos[indice].setEnabled(false);
            btnAsientos[indice].setText("Ocupado");
            btnAsientos[indice].setBackground(Color.RED);
           // btnAsientos[indice].setBorder(BorderFactory.createLineBorder(Color.RED, 4));
        }
    }
    /*
    public void actionPerformed(ActionEvent e) {
        ArrayList<Asiento> list = ListUsers();
        if (e.getSource() instanceof JButton) {
            String text = ((JButton) e.getSource()).getText();
            ///  JOptionPane.showMessageDialog(null, "Número de reserva es: " +text);
            String position = ((JButton) e.getSource()).getName();

            for (int i = 0; i < list.size(); i++) {
                if ((btn[i] == (JButton) e.getSource())) {
                    btn[i].setBackground(Color.RED);
                    System.out.println("PINTO ORANGE:!! =D");
                }
            }
        }
        this.revalidate();
        this.repaint();
    }

    */
    private void jBActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarUsuarioActionPerformed
        System.out.println(cm_cliente);
        jfactualizarDatos = new JFActualizarDatos(cm_cliente);
        jfactualizarDatos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBActualizarUsuarioActionPerformed

    private void jBMisReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMisReservasActionPerformed
        listaReserva = dt_reserva.mostrarReservasXIdCliente(cm_cliente.getId());
        JFMisReservas jfMisReservas = new JFMisReservas(listaReserva);
        jfMisReservas.setVisible(true);
        this.jCBClase.setSelectedIndex(0);
    }//GEN-LAST:event_jBMisReservasActionPerformed

    public static List<Cm_ClsReserva> llenarTablaReservas(){
        listaReserva = dt_reserva.mostrarReservasXIdCliente(cm_cliente.getId());
        return listaReserva;
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarUsuario;
    private javax.swing.JButton jBMisReservas;
    private javax.swing.JButton jBReservar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBClase;
    private javax.swing.JComboBox<String> jCBReservaComida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}