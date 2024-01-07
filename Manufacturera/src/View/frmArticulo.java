package View;
import Controller.ControlArticulo;
import Controller.ControlCategoria;
import Model.Articulo;
import Utilerias.interfacex;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author root4142
 */
public class frmArticulo extends javax.swing.JInternalFrame {
    private interfacex inter=new interfacex();
    private Vector<JTextField> txtCampos=new Vector<>();
    private boolean ins=true;
    private ControlArticulo control=new ControlArticulo();
    private ControlCategoria controlCat=new ControlCategoria();
    private Articulo articulo;
    /**
     * Creates new form frmArticulo
     */
    public frmArticulo() {
        initComponents();
        txtCampos.add(txtArticuloID);
        txtCampos.add(txtNombre);
        cboCombo.setModel(controlCat.comboModel());
        articulo=new Articulo();
        int auto = control.autoNumerico();
        txtArticuloID.setText(String.valueOf(auto));
        txtNombre.grabFocus();
    }
    private void Limpiar_Campos(){
        for (JTextField o : txtCampos) {
            o.setText("");
        }
        chkISV.setSelected(false);
        cboCombo.setSelectedIndex(0);cboTipo.setSelectedIndex(0);
        ins=true;
        int auto = control.autoNumerico();
        txtArticuloID.setText(String.valueOf(auto));
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

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkISV = new javax.swing.JCheckBox();
        txtArticuloID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cboCombo = new javax.swing.JComboBox();
        cboTipo = new javax.swing.JComboBox();

        setTitle("Formulario de Mantenimiento de la tabla Articulo.");
        setFrameIcon(null);
        setName("frmArticulo"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 260, -1));

        jLabel2.setText("ID Articulo :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        chkISV.setText("ISV");
        getContentPane().add(chkISV, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        txtArticuloID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArticuloID.setEnabled(false);
        txtArticuloID.setName("Codigo"); // NOI18N
        getContentPane().add(txtArticuloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 90, -1));

        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel7.setText("Categoria :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 80, -1));

        jButton2.setText("Recuperar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 100, -1));

        cboCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, -1));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Materia Prima", "Producto termina" }));
        getContentPane().add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-525)/2, (screenSize.height-310)/2, 525, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x=-1;
        try {
            x = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Ingrese Codigo del Articulo : ", "Ingrese", JOptionPane.INFORMATION_MESSAGE));
            articulo=control.seekArticulo(x);
            if(articulo!=null){
                txtArticuloID.setText(articulo.getArticuloID()+"");
                txtNombre.setText(articulo.getNombre());
                if(articulo.getTipo().equals("T")){
                    cboTipo.setSelectedIndex(0);
                }
                else{
                    cboTipo.setSelectedIndex(1);
                }
                if(articulo.getISV().equals("1")){
                    chkISV.setSelected(true);
                }
                else{
                    chkISV.setSelected(false);
                }
                cboCombo.setSelectedIndex(articulo.getCategoriaID()-1);
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
        if(a){
                String xx1="";
                if(cboTipo.getSelectedIndex()==0){
                    xx1="T";
                }
                else{
                    xx1="P";
                }
                String xx="";
                if(chkISV.isSelected()){
                    xx="1";
                }
                else{
                    xx="0";
                }
                articulo = new Articulo(inter.String_Int(txtArticuloID.getText()), txtNombre.getText().toUpperCase(),xx1,xx,cboCombo.getSelectedIndex()+1);
                if (ins) {
                    control.insArticulo(articulo);
                } else {
                    control.updArticulo(articulo);
                }
                Limpiar_Campos();
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!ins){
            int res = -1;
            res = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar este Registro?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (res == JOptionPane.YES_OPTION) {
                control.delArticulo(inter.String_Int(txtArticuloID.getText().trim()));
                Limpiar_Campos();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboCombo;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JCheckBox chkISV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtArticuloID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}