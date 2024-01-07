package View;
import Controller.ControlProveedor;
import Model.Proveedor;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmProveedor extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private boolean ins=true;
    private ControlProveedor control=new ControlProveedor();
    private Proveedor proveedor;
    
    public frmProveedor() {
        initComponents();
        txtCampos.add(txtProveedorID);
        txtCampos.add(txtNombre);
        txtCampos.add(txtContacto);
        txtCampos.add(txtTelefono);
        txtCampos.add(txtLimite);
        txtCampos.add(txtSaldo);
        proveedor=new Proveedor();
        int auto = control.autoNumerico();
        txtProveedorID.setText(String.valueOf(auto));
        txtSaldo.setText("0");
        txtNombre.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        txtSaldo.setText("0");
        ins=true;
        int auto = control.autoNumerico();
        txtProveedorID.setText(String.valueOf(auto));
        txtNombre.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtProveedorID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLimite = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Formulario de Mantenimiento de la tabla Proveedor.");
        setToolTipText("");
        setFrameIcon(null);
        setName("frmProveedor"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 260, -1));

        jLabel2.setText("ID Proveedor :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtSaldo.setEditable(false);
        txtSaldo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaldo.setName("Dias"); // NOI18N
        getContentPane().add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 90, -1));

        txtProveedorID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtProveedorID.setEnabled(false);
        txtProveedorID.setName("Codigo"); // NOI18N
        getContentPane().add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setText("Contacto :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtContacto.setName("Contacto"); // NOI18N
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        getContentPane().add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 260, -1));

        jLabel7.setText("Telefono :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtTelefono.setName("Telefono"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, -1));

        jLabel8.setText("Saldo :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        txtLimite.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLimite.setName("Limite"); // NOI18N
        getContentPane().add(txtLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, -1));

        jLabel9.setText("Limite :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 80, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 100, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 100, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-489)/2, (screenSize.height-375)/2, 489, 375);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=-1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese Codigo del Proveedor : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            proveedor=new Proveedor();
            proveedor=control.seekProveedor(x);
            if(proveedor!=null){
                txtProveedorID.setText(proveedor.getProveedorID()+"");
                txtNombre.setText(proveedor.getNombre());
                txtContacto.setText(proveedor.getContacto());
                txtTelefono.setText(proveedor.getTelefono());
                txtLimite.setText(inter.FormatoSimple(proveedor.getLimite()));
                txtSaldo.setText(inter.FormatoSimple(proveedor.getSaldo()));
                txtNombre.grabFocus();
                ins = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico, pulse de nuevo el boton Recuperar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean a=false;
        for(JTextField o:txtCampos){
            if(o.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Campo "+o.getName()+" se encuentra Vacio","Error",JOptionPane.ERROR_MESSAGE);
                o.grabFocus();
                a=false;
                break;
            }
            else{
                a=true;
            }
        }
        if (a) {
            proveedor = new Proveedor(inter.String_Int(txtProveedorID.getText()), txtNombre.getText().toUpperCase(),txtContacto.getText().toUpperCase(),txtTelefono.getText(), inter.String_Float(txtLimite.getText()), inter.String_Float(txtSaldo.getText()));
            if (ins) {
                control.insProveedor(proveedor);
            } else {
                control.updProveedor(proveedor);
            }
            Limpiar_Campos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                control.delProveedor(inter.String_Int(txtProveedorID.getText().trim()));
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        if(txtContacto.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if(txtTelefono.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtLimite;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProveedorID;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}