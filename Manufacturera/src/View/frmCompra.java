package View;
import Controller.*;
import Model.*;
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
public class frmCompra extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Vector<JLabel> lblLabels=new Vector<>();
    private Vector<CompraDet> compraDet=new Vector<>();
    private Vector titulos,data=new Vector();
    DefaultTableModel modelo;
    private boolean ins=false,b=false,c=false;
    private ControlCompraCab controlcompraCab=new ControlCompraCab();
    private ControlCompraDet controlcompraDet=new ControlCompraDet();
    private ControlProveedor controlProveedor=new ControlProveedor();
    private ControlArticulo controlArticulo=new ControlArticulo();
    private CompraCab compracab;
    private CompraDet compradet;
    /**
     * Creates new form frmCompra
     */
    public frmCompra() {
        titulos=new Vector();
        titulos.addElement("ID Articulo");titulos.addElement("Nombre del Articulo");titulos.addElement("Cantidad");
        initComponents();
        txtCampos.add(txtCompraID);
        txtCampos.add(txtFecha);
        txtCampos.add(txtProveedorID);
        txtCampos.add(txtRequisicionID);
        lblLabels.add(lblNombreArticulo);
        lblLabels.add(lblNombreProveedor);
        modelo=(DefaultTableModel) Tabla.getModel();
        Tabla.setModel(modelo);
        compracab=new CompraCab();
        txtFecha.setText(controlcompraCab.getFechaSistema());
        int auto = controlcompraCab.autoNumerico();
        txtCompraID.setText(String.valueOf(auto));
        txtProveedorID.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        for (JLabel o : lblLabels) {
            o.setText("");
        }
        txtFecha.setText(controlcompraCab.getFechaSistema());
        ins=false;
        b=false;c=false;
        int auto = controlcompraCab.autoNumerico();
        txtCompraID.setText(String.valueOf(auto));
        txtProveedorID.grabFocus();
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
        txtCompraID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProveedorID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        valid = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        lblNombreProveedor = new javax.swing.JLabel();
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
        txtRequisicionID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setTitle("Formulario de Compras");
        setFrameIcon(null);
        setName("frmCompra"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Encabezado de Compras"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. de Compras :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtCompraID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCompraID.setEnabled(false);
        txtCompraID.setName("CompraID"); // NOI18N
        jPanel1.add(txtCompraID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Codigo del Proveedor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtProveedorID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtProveedorID.setName("ProveedorID"); // NOI18N
        txtProveedorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtProveedorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Año-Mes-Día");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setEnabled(false);
        txtFecha.setName("Fecha"); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estado ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        valid.setText("Validadar");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 130, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pendiente", "Surtido" }));
        cboEstado.setEnabled(false);
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre del Proveedor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        lblNombreProveedor.setBackground(java.awt.Color.white);
        lblNombreProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreProveedor.setName("Estado"); // NOI18N
        lblNombreProveedor.setOpaque(true);
        jPanel1.add(lblNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 180));

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la Compra."));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setName("ArticuloID"); // NOI18N
        txtArticuloID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Codigo de Articulo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nombre del Articulo");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setName("Cantidad"); // NOI18N
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cantidad");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        lblNombreArticulo.setBackground(java.awt.Color.white);
        lblNombreArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreArticulo.setOpaque(true);
        jPanel2.add(lblNombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, 30));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 750, 140));

        btnQuitarLinea.setText("Quitar Linea");
        btnQuitarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuitarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 120, -1));

        btnAgregarLinea.setText("Agregar Linea");
        btnAgregarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 120, -1));

        txtRequisicionID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRequisicionID.setName("ArticuloID"); // NOI18N
        txtRequisicionID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequisicionIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtRequisicionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Codigo de la Requisicion");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 770, 270));

        jButton3.setText("Grabar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 100, 50));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-934)/2, (screenSize.height-518)/2, 934, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Limpiar_Campos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtProveedorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorIDActionPerformed
        Proveedor proveedor = new Proveedor();
        int x=-1;
        try {
            x= Integer.parseInt(txtProveedorID.getText());
            proveedor=controlProveedor.seekProveedor(x);
            if(proveedor!=null){
//                cboEstado.grabFocus();
                lblNombreProveedor.setText(proveedor.getNombre());
                valid.grabFocus();
                c = true;
            }
            else{
                c=false;
                txtProveedorID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtProveedorID.grabFocus();
        }
    }//GEN-LAST:event_txtProveedorIDActionPerformed

    private void txtArticuloIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIDActionPerformed
        if (ins) {
            if (!txtArticuloID.getText().isEmpty()) {
                Articulo articulo = new Articulo();
                int x = -1;
                try {
                    x = Integer.parseInt(txtArticuloID.getText());
                    articulo = controlArticulo.seekArticulo(x);
                    if (articulo != null && articulo.getTipo().equals("T")) {
                        lblNombreArticulo.setText(articulo.getNombre());
                        txtCantidad.grabFocus();
                        b=true;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Debe de ser un Articulo de Materia Prima", "Error", JOptionPane.ERROR_MESSAGE);
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
            compraDet.remove(x);
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

            int c1 = -1, c2 = -1, c3 = -1,c4=-1;

            c1 = inter.String_Int(txtCompraID.getText());
            c4 = inter.String_Int(txtRequisicionID.getText());
            c2 = inter.String_Int(txtArticuloID.getText());
            c3 = Integer.valueOf(txtCantidad.getText());

            compradet = new CompraDet(c1,c4, c2, c3);
            compraDet.addElement(compradet);
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
            JOptionPane.showMessageDialog(rootPane,"Campo Codigo del Proveedor no esta validado","Error",JOptionPane.ERROR_MESSAGE);
            txtProveedorID.grabFocus();
        }
        else{
            String qq="";
            if(cboEstado.getSelectedIndex()==0){
                qq="P";
            }
            compracab=new CompraCab(inter.String_Int(txtCompraID.getText()),txtFecha.getText(),inter.String_Int(txtProveedorID.getText()),qq);
            ins=true;
            txtRequisicionID.grabFocus();
        }
    }//GEN-LAST:event_validActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!ins){
            JOptionPane.showMessageDialog(rootPane,"El encabezado del compra no esta validado aun!!!","Error",JOptionPane.ERROR_MESSAGE);
            valid.grabFocus();
        }
        else if(modelo.getRowCount()==0){
            JOptionPane.showMessageDialog(rootPane, "No se han ingresado Articulos en el detalle del Pedido");
            txtArticuloID.grabFocus();
        }
        else{
            int res=JOptionPane.showConfirmDialog(rootPane,"¿Desea GRABAR ESTA COMPRA?","PREGUNTA",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                boolean y=controlcompraCab.insCompraCab(compracab);
                boolean x=false;
                for(CompraDet o:compraDet){
                    x=controlcompraDet.insCompraDet(o);
                    if(!x){
                        break;
                    }
                }
                if((y) && (x)){
                    JOptionPane.showMessageDialog(rootPane, "COMPRA GRABADADO CON EXITO");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "HUBO PROBLEMAS AL MOMENTO DE REGISTRAR EL REQUISICION");
                }
                txtArticuloID.setText("");
                txtCantidad.setText("");
                lblNombreArticulo.setText("");
                compraDet.clear();
                for(int e=modelo.getRowCount()-1;e>-1;e--){
                    modelo.removeRow(e);
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtRequisicionIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequisicionIDActionPerformed
        RequisicionCab requisicioncab=new RequisicionCab();
        int x=-1;
        try {
            x= Integer.parseInt(txtRequisicionID.getText());
            ControlRequisicionCab control=new ControlRequisicionCab();
            requisicioncab=control.seekRequisicionCab(x);
            if(requisicioncab!=null && requisicioncab.getEstado().equals("E")){
                txtArticuloID.grabFocus();
                c = true;
            }
            else{
                c=false;
                JOptionPane.showMessageDialog(rootPane, "Debe de ser una Requisicion en espera", "Error", JOptionPane.ERROR_MESSAGE);
                txtRequisicionID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_txtRequisicionIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregarLinea;
    private javax.swing.JButton btnQuitarLinea;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreArticulo;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCompraID;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtProveedorID;
    private javax.swing.JTextField txtRequisicionID;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}
