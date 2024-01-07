package View;
import Controller.*;
import Model.*;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmPrecio extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private boolean bod=false,art=false, ins=true;
    private Vector<JTextField> txtCampos=new Vector<>();
    private ControlLista controlLista=new ControlLista();
    private ControlArticulo controlArticulo=new ControlArticulo();
    private ControlPrecio controlPrecio=new ControlPrecio();
    private Lista lista;
    private Articulo articulo;
    private Precio precio;
    
    public frmPrecio() {
        initComponents();
        txtCampos.add(txtListaID);
        txtCampos.add(txtNombreAticulo);
        txtCampos.add(txtArticuloID);
        txtCampos.add(txtNombreLista);
        txtCampos.add(txtPrecio);
        txtListaID.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        bod=false;art=false;ins=true;
        txtArticuloID.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreAticulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtListaID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSelArt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNombreLista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtArticuloID = new javax.swing.JTextField();
        btnSelBod = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Formulario de Asignacion de Precios a Articulos.");
        setToolTipText("");
        setFrameIcon(null);
        setName("frmPrecio"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreAticulo.setEditable(false);
        txtNombreAticulo.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreAticulo.setName("NombreArticulo"); // NOI18N
        getContentPane().add(txtNombreAticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, -1));

        jLabel2.setText("ID De Lista :");
        jLabel2.setName(""); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtListaID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtListaID.setName("ListaID"); // NOI18N
        getContentPane().add(txtListaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, -1));

        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setName("Precio"); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 90, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 110, -1));

        btnSelArt.setText("Seleccionar");
        btnSelArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelArtActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 110, -1));

        jLabel10.setText("Precio :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtNombreLista.setEditable(false);
        txtNombreLista.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreLista.setName("NombreLista"); // NOI18N
        getContentPane().add(txtNombreLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 260, -1));

        jLabel6.setText("Nombre :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setText("ID Del Articulo :");
        jLabel3.setName(""); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setName("ArticuloID"); // NOI18N
        getContentPane().add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, -1));

        btnSelBod.setText("Seleccionar");
        btnSelBod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelBodActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelBod, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-647)/2, (screenSize.height-336)/2, 647, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSelArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelArtActionPerformed
        int x=-1;
        try {
            x = Integer.parseInt(txtArticuloID.getText());
            articulo=new Articulo();
            articulo=controlArticulo.seekArticulo(x);
            if(articulo!=null && articulo.getTipo().equals("P")){
                txtNombreAticulo.setText(articulo.getNombre());
                txtListaID.grabFocus();
                art = true;
            }
            else{
                art=false;
                JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un Producto procesado", "Error", JOptionPane.ERROR_MESSAGE);
                txtArticuloID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtArticuloID.grabFocus();
        }
    }//GEN-LAST:event_btnSelArtActionPerformed

    private void btnSelBodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelBodActionPerformed
        int x=-1;
        try {
            x= Integer.parseInt(txtListaID.getText());
            lista=new Lista();
            lista=controlLista.getLista(x);
            if(lista!=null){
                txtNombreLista.setText(lista.getNombre());
                txtPrecio.grabFocus();
                bod = true;
            }
            else{
                bod=false;
                txtListaID.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe de ingresar un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            txtListaID.grabFocus();
        }
    }//GEN-LAST:event_btnSelBodActionPerformed

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
        if(a && art && bod){
            precio = new Precio(inter.String_Int(txtArticuloID.getText()), inter.String_Int(txtListaID.getText()), inter.String_Float(txtPrecio.getText()));
            if (ins) {
                Precio precio1 = new Precio();
                precio1 = controlPrecio.seekPrecio1(inter.String_Int(txtArticuloID.getText()), inter.String_Int(txtListaID.getText()));
                if (precio1 == null) {
                    controlPrecio.insPrecio(precio);
                }
            } else {
                controlPrecio.updPrecio(precio);
            }
            Limpiar_Campos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (bod && art) {
            precio = new Precio();
            precio = controlPrecio.seekPrecio(inter.String_Int(txtArticuloID.getText()), inter.String_Int(txtListaID.getText()));
            if (precio != null) {
                txtPrecio.setText(precio.getPrecio() + "");
                txtPrecio.grabFocus();
                ins = false;
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes validar los campos de codigo de Articulo y Lista primero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                controlPrecio.delPrecio(inter.String_Int(txtArticuloID.getText()),inter.String_Int(txtListaID.getText()));
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelArt;
    private javax.swing.JButton btnSelBod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtListaID;
    private javax.swing.JTextField txtNombreAticulo;
    private javax.swing.JTextField txtNombreLista;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}