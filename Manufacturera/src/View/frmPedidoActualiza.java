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
public class frmPedidoActualiza extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Vector<JLabel> lblLabels=new Vector<>();
    private Vector<PedidoDet> pedidoDet=new Vector<>();
    private Vector titulos,data=new Vector();
    DefaultTableModel modelo;
    private boolean val=false,b=false,c=false;
    private ControlPedidoCab controlpedidoCab=new ControlPedidoCab();
    private ControlPedidoDet controlpedidoDet=new ControlPedidoDet();
    private ControlCliente controlCliente=new ControlCliente();
    private ControlArticulo controlArticulo=new ControlArticulo();
    private PedidoCab pedidocab;
    private PedidoDet pedidodet;
    /**
     * Creates new form frmCompra
     */
    public frmPedidoActualiza() {
        titulos=new Vector();
        titulos.addElement("ID Articulo");titulos.addElement("Nombre del Articulo");titulos.addElement("Cantidad");
        initComponents();
        txtCampos.add(txtPedidoID);
        txtCampos.add(txtFecha);
        txtCampos.add(txtClienteID);
        lblLabels.add(lblNombreCliente);
        lblLabels.add(lblDireccionCliente);
        pedidocab=new PedidoCab();
        txtFecha.setText(controlpedidoCab.getFechaSistema());
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
        val=false;
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
        lblNombreCliente = new javax.swing.JLabel();
        valid = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Formulario de Pedidos.");
        setFrameIcon(null);
        setName("frmPedidoActualiza"); // NOI18N
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
        txtClienteID.setEnabled(false);
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
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblDireccionCliente.setBackground(java.awt.Color.white);
        lblDireccionCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDireccionCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDireccionCliente.setName("Estado"); // NOI18N
        lblDireccionCliente.setOpaque(true);
        jPanel1.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 270, 30));

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
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 130, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espera", "Procesado", "Nulo" }));
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, -1));

        jButton4.setText("Recuperar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 240));

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

        jButton3.setText("Grabar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 100, 50));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-926)/2, (screenSize.height-296)/2, 926, 296);
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

    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        if(!c){
            JOptionPane.showMessageDialog(rootPane,"Campo Codigo del Cliente no esta validado","Error",JOptionPane.ERROR_MESSAGE);
            txtClienteID.grabFocus();
        }
        else{
            String qq="";
            if(cboEstado.getSelectedIndex()==0){
                qq="E";
            }else if(cboEstado.getSelectedIndex()==1){
                qq="P";
            }
            pedidocab=new PedidoCab(inter.String_Int(txtPedidoID.getText()),txtFecha.getText(),inter.String_Int(txtClienteID.getText()),qq);
            val=true;
            jButton3.grabFocus();
        }
    }//GEN-LAST:event_validActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!val){
            JOptionPane.showMessageDialog(rootPane,"El encabezado del Pedido no esta validado aun!!!","Error",JOptionPane.ERROR_MESSAGE);
            valid.grabFocus();
        }
        else{
            int res=JOptionPane.showConfirmDialog(rootPane,"¿Desea GRABAR ESTE PEDIDO?","PREGUNTA",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                boolean y=controlpedidoCab.updPedidoCab(pedidocab);
                if((y)){
                    JOptionPane.showMessageDialog(rootPane, "PEDIDO GRABADADO CON EXITO");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "HUBO PROBLEMAS AL MOMENTO DE REGISTRAR EL PEDIDO");
                }
                lblDireccionCliente.setText("");
                lblNombreCliente.setText("");
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = -1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese No. del Pedido : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            pedidocab = new PedidoCab();
            pedidocab = controlpedidoCab.seekPedidoCab(x);
            if (pedidocab != null && pedidocab.getEstado().equals("E")) {
                txtPedidoID.setText(pedidocab.getPedidoID() + "");
                txtFecha.setText(pedidocab.getFecha() + "");
                txtClienteID.setText(pedidocab.getClienteID() + "");
                txtClienteIDActionPerformed(evt);
                cboEstado.setSelectedIndex(0);
                validActionPerformed(evt);
                val = false;
                b = false;
                //                txtNombre.grabFocus();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Debe de ingresar solo Pedidos en Espera", "Error_RECOVERY", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un No. de Pedido Valido", "Error_RECOVERY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPedidoID;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}