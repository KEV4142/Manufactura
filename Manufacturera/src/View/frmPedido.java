package View;
import Controller.*;
import Model.Articulo;
import Model.Cliente;
import Model.PedidoCab;
import Model.PedidoDet;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author root4142
 */
public class frmPedido extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Vector<JLabel> lblLabels=new Vector<>();
    private Vector<PedidoDet> pedidoDet=new Vector<>();
    private Vector titulos,data=new Vector();
    DefaultTableModel modelo;
    private boolean ins=false,b=false,c=false;
    private ControlPedidoCab controlpedidoCab=new ControlPedidoCab();
    private ControlPedidoDet controlpedidoDet=new ControlPedidoDet();
    private ControlCliente controlCliente=new ControlCliente();
    private ControlArticulo controlArticulo=new ControlArticulo();
    private PedidoCab pedidocab;
    private PedidoDet pedidodet;
    /**
     * Creates new form frmCompra
     */
    public frmPedido() {
        titulos=new Vector();
        titulos.addElement("ID Articulo");titulos.addElement("Nombre del Articulo");titulos.addElement("Cantidad");
        initComponents();
        txtCampos.add(txtPedidoID);
        txtCampos.add(txtFecha);
        txtCampos.add(txtClienteID);
        lblLabels.add(lblNombreCliente);
        lblLabels.add(lblNombreArticulo);
        lblLabels.add(lblDireccionCliente);
        lblLabels.add(lblEstado);
        modelo=(DefaultTableModel) Tabla.getModel();
        Tabla.setModel(modelo);
        pedidocab=new PedidoCab();
        txtFecha.setText(controlpedidoCab.getFechaSistema());
        lblEstado.setText("ESPERA");
        int auto = controlpedidoCab.autoNumerico();
        txtPedidoID.setText(String.valueOf(auto));
        txtClienteID.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        for (JLabel o : lblLabels) {
            o.setText("");
        }
        txtFecha.setText(controlpedidoCab.getFechaSistema());
        lblEstado.setText("ESPERA");
        ins=false;
        b=false;c=false;
        int auto = controlpedidoCab.autoNumerico();
        txtPedidoID.setText(String.valueOf(auto));
        txtClienteID.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPedidoID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClienteID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        valid = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtArticuloID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblNombreArticulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnQuitarLinea = new javax.swing.JButton();
        btnAgregarLinea = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Formulario de Pedidos.");
        setFrameIcon(null);
        setName("frmPedido"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Encabezado del Pedido."));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. de Pedido :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtPedidoID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPedidoID.setEnabled(false);
        txtPedidoID.setName("CompraID"); // NOI18N
        jPanel1.add(txtPedidoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Codigo del Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtClienteID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtClienteID.setName("ProveedorID"); // NOI18N
        txtClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtClienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre del Cliente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Dirección del Cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Año-Mes-Día");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setEnabled(false);
        txtFecha.setName("Fecha"); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estado del Pedido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblDireccionCliente.setBackground(java.awt.Color.white);
        lblDireccionCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDireccionCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDireccionCliente.setName("Estado"); // NOI18N
        lblDireccionCliente.setOpaque(true);
        jPanel1.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 270, 30));

        lblEstado.setBackground(java.awt.Color.white);
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("ESPERA");
        lblEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblEstado.setName("Estado"); // NOI18N
        lblEstado.setOpaque(true);
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        lblNombreCliente.setBackground(java.awt.Color.white);
        lblNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreCliente.setName("Estado"); // NOI18N
        lblNombreCliente.setOpaque(true);
        jPanel1.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, 30));

        valid.setText("Validadar");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 200));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 100, 50));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 100, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del Pedido."));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setName("ArticuloID"); // NOI18N
        txtArticuloID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Codigo de Articulo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nombre del Articulo");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setName("Cantidad"); // NOI18N
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cantidad");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        lblNombreArticulo.setBackground(java.awt.Color.white);
        lblNombreArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreArticulo.setOpaque(true);
        jPanel2.add(lblNombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, 30));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(data,titulos)
            {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            }
        );
        jScrollPane1.setViewportView(Tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 860, 160));

        btnQuitarLinea.setText("Quitar Linea");
        btnQuitarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuitarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, -1));

        btnAgregarLinea.setText("Agregar Linea");
        btnAgregarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 890, 310));

        jButton3.setText("Grabar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 100, 50));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-926)/2, (screenSize.height-639)/2, 926, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar_Campos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIDActionPerformed
        Cliente cliente = new Cliente();
        int x=-1;
        try {
            x= Integer.parseInt(txtClienteID.getText());
            cliente=controlCliente.getCliente(x);
            if(cliente!=null){
                lblNombreCliente.setText(cliente.getNombre());
                lblDireccionCliente.setText(cliente.getDireccion());
                valid.grabFocus();
                c = true;
            }
            else{
                c=false;
                txtClienteID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtClienteID.grabFocus();
        }
    }//GEN-LAST:event_txtClienteIDActionPerformed

    private void txtArticuloIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIDActionPerformed
        if (ins) {
            if (!txtArticuloID.getText().isEmpty()) {
                Articulo articulo = new Articulo();
                int x = -1;
                try {
                    x = Integer.parseInt(txtArticuloID.getText());
                    articulo = controlArticulo.seekArticulo(x);
                    if (articulo != null && articulo.getTipo().equals("P")) {
                        lblNombreArticulo.setText(articulo.getNombre());
                        txtCantidad.grabFocus();
                        b=true;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Debe de ser un Articulo de Producto Procesado", "Error", JOptionPane.ERROR_MESSAGE);
                        txtArticuloID.grabFocus();
                        b=false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
                    txtArticuloID.grabFocus();
                    b=false;
                }
            }
            else{
                JOptionPane.showMessageDialog(rootPane,"El Campo Articulo ID esta Vacio","Error",JOptionPane.ERROR_MESSAGE);
                txtArticuloID.grabFocus();
                b=false;
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"El encabezado del Pedido no esta validado aun!!!","Error",JOptionPane.ERROR_MESSAGE);
            valid.grabFocus();
        }
    }//GEN-LAST:event_txtArticuloIDActionPerformed

    private void btnQuitarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarLineaActionPerformed
        int x=-1;
        x=Tabla.getSelectedRow();
        if(x<0){
            JOptionPane.showMessageDialog(rootPane, "No se puede debes de seleccionar una linea de la tabla");
        }
        else{
            pedidoDet.remove(x);
            modelo.removeRow(x);
            txtArticuloID.setText("");txtCantidad.setText("");
            lblNombreArticulo.setText("");
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_btnQuitarLineaActionPerformed

    private void btnAgregarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLineaActionPerformed
        if((txtArticuloID.getText().isEmpty()) || (txtCantidad.getText().isEmpty())){
            JOptionPane.showMessageDialog(rootPane, "No se puede ingresar linea con campos vacios");
        }
        else if(b==false){
            JOptionPane.showMessageDialog(rootPane, "No se puede ingresar linea con campo Articulo sin validar");
            txtArticuloID.grabFocus();
        }
        else{
            Vector rou = new Vector();
            rou.addElement(txtArticuloID.getText().toUpperCase());
            rou.addElement(lblNombreArticulo.getText().toUpperCase());
            rou.addElement(txtCantidad.getText());

            int c1 = -1, c2 = -1, c3 = -1;

            c1 = inter.String_Int(txtPedidoID.getText());
            c2 = inter.String_Int(txtArticuloID.getText());
            c3 = Integer.valueOf(txtCantidad.getText());

            pedidodet = new PedidoDet(c1, c2, c3);
            pedidoDet.addElement(pedidodet);
            modelo.addRow(rou);

            txtArticuloID.setText("");
            txtCantidad.setText("");
            lblNombreArticulo.setText("");
            txtArticuloID.grabFocus();
            b=false;
        }
    }//GEN-LAST:event_btnAgregarLineaActionPerformed

    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        if(!c){
            JOptionPane.showMessageDialog(rootPane,"Campo Codigo del Cliente no esta validado","Error",JOptionPane.ERROR_MESSAGE);
            txtClienteID.grabFocus();
        }
        else{
            pedidocab=new PedidoCab(inter.String_Int(txtPedidoID.getText()),txtFecha.getText(),inter.String_Int(txtClienteID.getText()),"E");
            ins=true;
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_validActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!ins){
            JOptionPane.showMessageDialog(rootPane,"El encabezado del Pedido no esta validado aun!!!","Error",JOptionPane.ERROR_MESSAGE);
            valid.grabFocus();
        }
        else if(modelo.getRowCount()==0){
            JOptionPane.showMessageDialog(rootPane, "No se han ingresado Articulos en el detalle del Pedido");
            txtArticuloID.grabFocus();
        }
        else{
            int res=JOptionPane.showConfirmDialog(rootPane,"¿Desea GRABAR ESTE PEDIDO?","PREGUNTA",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                boolean y=controlpedidoCab.insPedidoCab(pedidocab);
                boolean x=false;
                for(PedidoDet o:pedidoDet){
                    x=controlpedidoDet.insPedidoDet(o);
                    if(!x){
                        break;
                    }
                }
                if((y) && (x)){
                    JOptionPane.showMessageDialog(rootPane, "PEDIDO GRABADADO CON EXITO");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "HUBO PROBLEMAS AL MOMENTO DE REGISTRAR EL PEDIDO");
                }
                txtArticuloID.setText("");
                txtCantidad.setText("");
                lblNombreArticulo.setText("");
                lblDireccionCliente.setText("");
                lblNombreCliente.setText("");
                pedidoDet.clear();
                for(int e=modelo.getRowCount()-1;e>-1;e--){
                    modelo.removeRow(e);
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregarLinea;
    private javax.swing.JButton btnQuitarLinea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombreArticulo;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPedidoID;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}
