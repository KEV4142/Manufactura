package View;
import Controller.*;
import Model.Articulo;
import Model.PedidoCab;
import Model.Bodega;
import Model.Existencia;
import Model.OrdenCab;
import Model.OrdenDet;
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
public class frmOrdenActualiza extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private Vector<JLabel> lblLabels=new Vector<>();
    private Vector<OrdenDet> ordenDet=new Vector<>();
    private Vector titulos,data=new Vector();
    DefaultTableModel modelo;
    private boolean val=false,b=false,c=false,ins=true;
    private ControlOrdenCab controlordenCab=new ControlOrdenCab();
    private ControlOrdenDet controlordenDet=new ControlOrdenDet();
    private ControlPedidoCab controlPedido=new ControlPedidoCab();
    private ControlBodega controlBodega=new ControlBodega();
    private ControlArticulo controlArticulo=new ControlArticulo();
    private OrdenCab ordencab;
    private OrdenDet ordendet;
    private boolean c1=false;
    /**
     * Creates new form frmCompra
     */
    public frmOrdenActualiza() {
        titulos=new Vector();
        titulos.addElement("ID Articulo");titulos.addElement("Nombre del Articulo");titulos.addElement("Cantidad");
        initComponents();
        txtCampos.add(txtOrdenID);
        txtCampos.add(txtFecha);
        txtCampos.add(txtMateriaBodegaID);
        txtCampos.add(txtMateriaBodegaID1);
        txtCampos.add(txtObservacion);
        lblLabels.add(lblNombreBodegaMateria);
        lblLabels.add(lblNombreArticulo);
        lblLabels.add(lblNombreBodegaProcesado);
        modelo=(DefaultTableModel) Tabla.getModel();
        Tabla.setModel(modelo);
        ordencab=new OrdenCab();
        txtFecha.setText(controlordenCab.getFechaSistema());
        int auto = controlordenCab.autoNumerico();
        txtOrdenID.setText(String.valueOf(auto));
        txtMateriaBodegaID.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        for (JLabel o : lblLabels) {
            o.setText("");
        }
        txtFecha.setText(controlordenCab.getFechaSistema());
        cboEstado.setSelectedIndex(0);
        val=false;ins=true;
        b=false;c=false;c1=false;
        int auto = controlordenCab.autoNumerico();
        txtOrdenID.setText(String.valueOf(auto));
        txtMateriaBodegaID.grabFocus();
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
        txtOrdenID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMateriaBodegaID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblNombreBodegaProcesado = new javax.swing.JLabel();
        lblNombreBodegaMateria = new javax.swing.JLabel();
        valid = new javax.swing.JButton();
        cboEstado = new javax.swing.JComboBox();
        txtMateriaBodegaID1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
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
        txtPedidoID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setTitle("Formulario de orden de Produccion");
        setFrameIcon(null);
        setName("frmOrdenActualiza"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Encabezado de la Orden."));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. de Orden :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtOrdenID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOrdenID.setEnabled(false);
        txtOrdenID.setName("CompraID"); // NOI18N
        jPanel1.add(txtOrdenID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bodega de Terminado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtMateriaBodegaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMateriaBodegaID.setEnabled(false);
        txtMateriaBodegaID.setName("ProveedorID"); // NOI18N
        txtMateriaBodegaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMateriaBodegaIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtMateriaBodegaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre de la bodega");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Observaciones");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Año-Mes-Día");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setEnabled(false);
        txtFecha.setName("Fecha"); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Estado de la orden");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        lblNombreBodegaProcesado.setBackground(java.awt.Color.white);
        lblNombreBodegaProcesado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreBodegaProcesado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreBodegaProcesado.setName("Estado"); // NOI18N
        lblNombreBodegaProcesado.setOpaque(true);
        jPanel1.add(lblNombreBodegaProcesado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 270, 30));

        lblNombreBodegaMateria.setBackground(java.awt.Color.white);
        lblNombreBodegaMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreBodegaMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreBodegaMateria.setName("Estado"); // NOI18N
        lblNombreBodegaMateria.setOpaque(true);
        jPanel1.add(lblNombreBodegaMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, 30));

        valid.setText("Validadar");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 130, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espera", "Procesado", "Nulo" }));
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 150, -1));

        txtMateriaBodegaID1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMateriaBodegaID1.setEnabled(false);
        txtMateriaBodegaID1.setName("ProveedorID"); // NOI18N
        txtMateriaBodegaID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMateriaBodegaID1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtMateriaBodegaID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Bodega de Materia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtObservacion.setText("Ninguna");
        jPanel1.add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 270, 30));

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la Orden."));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setEnabled(false);
        txtArticuloID.setName("ArticuloID"); // NOI18N
        txtArticuloID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArticuloIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Codigo de Articulo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Nombre del Articulo");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantidad.setEnabled(false);
        txtCantidad.setName("Cantidad"); // NOI18N
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 100, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cantidad");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        lblNombreArticulo.setBackground(java.awt.Color.white);
        lblNombreArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblNombreArticulo.setOpaque(true);
        jPanel2.add(lblNombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, 30));

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
        Tabla.setEnabled(false);
        jScrollPane1.setViewportView(Tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 860, 160));

        btnQuitarLinea.setText("Quitar Linea");
        btnQuitarLinea.setEnabled(false);
        btnQuitarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnQuitarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 150, -1));

        btnAgregarLinea.setText("Agregar Linea");
        btnAgregarLinea.setEnabled(false);
        btnAgregarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLineaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 150, -1));

        txtPedidoID.setEditable(false);
        txtPedidoID.setBackground(new java.awt.Color(255, 255, 255));
        txtPedidoID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPedidoID.setName("ArticuloID"); // NOI18N
        txtPedidoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtPedidoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Codigo del Pedido");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Estado del Pedido");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lblEstado.setBackground(java.awt.Color.white);
        lblEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblEstado.setOpaque(true);
        jPanel2.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 890, 340));

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

    private void txtMateriaBodegaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMateriaBodegaIDActionPerformed
        Bodega bodega = new Bodega();
        int x=-1;
        try {
            x= Integer.parseInt(txtMateriaBodegaID.getText());
            bodega=controlBodega.seekBodega(x);
            if(bodega!=null){
                lblNombreBodegaMateria.setText(bodega.getNombre());
                txtMateriaBodegaID1.grabFocus();
                c = true;
            }
            else{
                c=false;
                txtMateriaBodegaID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtMateriaBodegaID.grabFocus();
        }
    }//GEN-LAST:event_txtMateriaBodegaIDActionPerformed

    private void txtArticuloIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArticuloIDActionPerformed
        if (val) {
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
            ordenDet.remove(x);
            modelo.removeRow(x);
            txtArticuloID.setText("");txtCantidad.setText("");
            lblNombreArticulo.setText("");
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_btnQuitarLineaActionPerformed

    private void btnAgregarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLineaActionPerformed
        if((txtArticuloID.getText().isEmpty()) || (txtCantidad.getText().isEmpty()|| (txtPedidoID.getText().isEmpty()))){
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

            c1 = inter.String_Int(txtOrdenID.getText());
            c2 = inter.String_Int(txtArticuloID.getText());
            c3 = Integer.valueOf(txtCantidad.getText());
            c4 = inter.String_Int(txtPedidoID.getText());

            ordendet = new OrdenDet(c1,c4, c2, c3);
            ordenDet.addElement(ordendet);
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
            JOptionPane.showMessageDialog(rootPane,"Campo Codigo de la Bodega de materia prima no esta validado","Error",JOptionPane.ERROR_MESSAGE);
            txtMateriaBodegaID.grabFocus();
        }
        if(!c1){
            JOptionPane.showMessageDialog(rootPane,"Campo Codigo de la Bodega de productos no esta validado","Error",JOptionPane.ERROR_MESSAGE);
            txtMateriaBodegaID1.grabFocus();
        }
        else{String qq="";
            if(cboEstado.getSelectedIndex()==0){
                qq="E";
            }else{qq="P";}
            ordencab=new OrdenCab(inter.String_Int(txtOrdenID.getText()),txtFecha.getText(),qq,inter.String_Int(txtMateriaBodegaID.getText()),inter.String_Int(txtMateriaBodegaID1.getText()),txtObservacion.getText());
            val=true;
            jButton3.grabFocus();
        }
    }//GEN-LAST:event_validActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!val){
            JOptionPane.showMessageDialog(rootPane,"El encabezado del Orden no esta validado aun!!!","Error",JOptionPane.ERROR_MESSAGE);
            valid.grabFocus();
        }
        else if(modelo.getRowCount()==0){
            JOptionPane.showMessageDialog(rootPane, "No se han ingresado Articulos en el detalle del Pedido");
            txtArticuloID.grabFocus();
        }
        else{
            int res=JOptionPane.showConfirmDialog(rootPane,"¿Desea GRABAR ESTE PEDIDO?","PREGUNTA",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                
                
                boolean y = false;
                boolean x = false;
                if (ins) {
                    y = controlordenCab.insOrdenCab(ordencab);
                    for (OrdenDet o : ordenDet) {
                        x = controlordenDet.insOrdenDet(o);
                        if (cboEstado.getSelectedIndex() == 1) {
                            ControlExistencia control = new ControlExistencia();
                            Existencia exis = new Existencia();
                            exis = control.seekExistencia1(ordencab.getMateriaBodegaID(), o.getArticuloID());
                            if (exis.getBodegaID() != -1) {
                                int cant = exis.getCantidad() - o.getCantidad();
                                exis.setCantidad(cant);
                                control.updExistencia(exis);
                            }
                        }
                        if (!x) {
                            break;
                        }
                    }
                    Vector<PedidoDet> ped = new Vector<>();
                    ped = new ControlPedidoDet().seekPedidoDetVector(inter.String_Int(txtPedidoID.getText()));
                    for (PedidoDet oo : ped) {
                        Existencia exis = new Existencia();
                        ControlExistencia control = new ControlExistencia();
                        exis = control.seekExistencia1(ordencab.getProductoBodegaID(), oo.getArticuloID());
                        if (exis.getBodegaID() != -1) {
                            int cant = exis.getCantidad() + oo.getCantidad();
                            exis.setCantidad(cant);
                            control.updExistencia(exis);
                        } else {
                            exis = new Existencia(ordencab.getProductoBodegaID(), oo.getArticuloID(), oo.getCantidad());
                            control.insExistencia(exis);
                        }
                    }
                }else{
                    y = controlordenCab.updOrdenCab(ordencab);
                    for (OrdenDet o : ordenDet) {
                        x = true;
                        if (cboEstado.getSelectedIndex() == 1) {
                            ControlExistencia control = new ControlExistencia();
                            Existencia exis = new Existencia();
                            exis = control.seekExistencia1(ordencab.getMateriaBodegaID(), o.getArticuloID());
                            if (exis.getBodegaID() != -1) {
                                int cant = exis.getCantidad() - o.getCantidad();
                                exis.setCantidad(cant);
                                control.updExistencia(exis);
                            }
                        }
                        if (!x) {
                            break;
                        }
                    }
                    Vector<PedidoDet> ped = new Vector<>();
                    ped = new ControlPedidoDet().seekPedidoDetVector(inter.String_Int(txtPedidoID.getText()));
                    for (PedidoDet oo : ped) {
                        Existencia exis = new Existencia();
                        ControlExistencia control = new ControlExistencia();
                        exis = control.seekExistencia1(ordencab.getProductoBodegaID(), oo.getArticuloID());
                        if (exis.getBodegaID() != -1) {
                            int cant = exis.getCantidad() + oo.getCantidad();
                            exis.setCantidad(cant);
                            control.updExistencia(exis);
                        } else {
                            exis = new Existencia(ordencab.getProductoBodegaID(), oo.getArticuloID(), oo.getCantidad());
                            control.insExistencia(exis);
                        }
                    }
                }
                
                if((y) && (x)){
                    JOptionPane.showMessageDialog(rootPane, "Orden GRABADADO CON EXITO");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "HUBO PROBLEMAS AL MOMENTO DE REGISTRAR la Orden");
                }
                txtArticuloID.setText("");
                txtCantidad.setText("");
                lblNombreArticulo.setText("");
                lblNombreBodegaProcesado.setText("");
                lblNombreBodegaMateria.setText("");
                txtPedidoID.setText("");
                ordenDet.clear();
                for(int e=modelo.getRowCount()-1;e>-1;e--){
                    modelo.removeRow(e);
                }
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMateriaBodegaID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMateriaBodegaID1ActionPerformed
        Bodega bodega = new Bodega();
        int x=-1;
        try {
            x= Integer.parseInt(txtMateriaBodegaID1.getText());
            bodega=controlBodega.seekBodega(x);
            if(bodega!=null){
                lblNombreBodegaProcesado.setText(bodega.getNombre());
                cboEstado.grabFocus();
                c1 = true;
            }
            else{
                c1=false;
                txtMateriaBodegaID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtMateriaBodegaID.grabFocus();
        }
    }//GEN-LAST:event_txtMateriaBodegaID1ActionPerformed

    private void txtPedidoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoIDActionPerformed
        PedidoCab pedido=new PedidoCab();
        int x=-1;
        try {
            x= Integer.parseInt(txtPedidoID.getText());
            pedido=controlPedido.seekPedidoCab(x);
            if(pedido!=null && pedido.getEstado().equals("E")){
                lblEstado.setText("EN ESPERA");
                txtArticuloID.grabFocus();
                c = true;
            }
            else{
                c=false;
                JOptionPane.showMessageDialog(rootPane, "Debe de ser un Pedido en espera", "Error", JOptionPane.ERROR_MESSAGE);
                txtPedidoID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtMateriaBodegaID.grabFocus();
        }
    }//GEN-LAST:event_txtPedidoIDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = -1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese No. de la Orden : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            ordencab = new OrdenCab();
            ordencab = controlordenCab.seekOrdenCab(x);
            if (ordencab != null && ordencab.getEstado().equals("E")) {
                txtOrdenID.setText(ordencab.getOrdenID() + "");
                txtFecha.setText(ordencab.getFecha() + "");
                txtMateriaBodegaID.setText(ordencab.getMateriaBodegaID() + "");
                txtMateriaBodegaIDActionPerformed(evt);
                txtMateriaBodegaID1.setText(ordencab.getProductoBodegaID() + "");
                txtMateriaBodegaID1ActionPerformed(evt);
                txtObservacion.setText(ordencab.getObservacion() + "");
                if (ordencab.getEstado().equals("E")) {
                    cboEstado.setSelectedIndex(0);
                }
                validActionPerformed(evt);
                Vector<OrdenDet> ordenDet1=new Vector<>();
                ordenDet.clear();
                ordenDet1 = controlordenDet.seekOrdenDetVector(x);
                if (!ordenDet1.isEmpty()) {
                    for (OrdenDet oo : ordenDet1) {
                        ordendet = new OrdenDet();
                        ordendet = oo;
                        txtPedidoID.setText(ordendet.getOrdenID() + "");
                        txtPedidoIDActionPerformed(evt);
                        txtArticuloID.setText(ordendet.getArticuloID() + "");
                        txtArticuloIDActionPerformed(evt);
                        txtCantidad.setText(ordendet.getCantidad() + "");
                        btnAgregarLineaActionPerformed(evt);
                    }
                }
                val = false;
                b = false;
                ins = false;
//                txtNombre.grabFocus();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Debe de ingresar solo Ordenes en Espera", "Error_RECOVERY", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un No. de Modelo Valido", "Error_RECOVERY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregarLinea;
    private javax.swing.JButton btnQuitarLinea;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombreArticulo;
    private javax.swing.JLabel lblNombreBodegaMateria;
    private javax.swing.JLabel lblNombreBodegaProcesado;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMateriaBodegaID;
    private javax.swing.JTextField txtMateriaBodegaID1;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtOrdenID;
    private javax.swing.JTextField txtPedidoID;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}
