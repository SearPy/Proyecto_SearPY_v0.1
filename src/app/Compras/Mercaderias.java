/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Compras;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Models.Producto;
import DAO.Producto_daoimpl;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.Exporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.view.JasperViewer;
import net.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */
public class Mercaderias extends javax.swing.JDialog {

    /**
     * Creates new form ProductosApp
     */
    public Mercaderias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        arranque();
        setLocationRelativeTo(null);
    }
    
    Session st = HibernateUtil.getSessionFactory().openSession();
    private final Producto_daoimpl dao = new Producto_daoimpl(st);
    private DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Informe = new javax.swing.JDialog();
        comboinfo = new javax.swing.JComboBox<>();
        imprimir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboinfo2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        informe = new javax.swing.JButton();
        txtdescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboiva = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combotipo1 = new javax.swing.JComboBox<>();
        txtid1 = new javax.swing.JTextField();

        Informe.setMinimumSize(new java.awt.Dimension(620, 160));

        comboinfo.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        comboinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Producto", "Insumo" }));

        imprimir.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel5.setText("IVA");

        comboinfo2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        comboinfo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "10%", "5%" }));

        javax.swing.GroupLayout InformeLayout = new javax.swing.GroupLayout(Informe.getContentPane());
        Informe.getContentPane().setLayout(InformeLayout);
        InformeLayout.setHorizontalGroup(
            InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboinfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        InformeLayout.setVerticalGroup(
            InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboinfo2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 650));
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Mercaderias");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 18, 220, 40));

        tab.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIPCION", "PRECIO", "TIPO", "IVA"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 760, 210));

        informe.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        informe.setText("Informe");
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });
        getContentPane().add(informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, 40));

        txtdescripcion.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 300, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setText("DESCRIPCION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, 30));

        txtid.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 40, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, 30));

        comboiva.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        comboiva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "5%", "0" }));
        getContentPane().add(comboiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 70, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel10.setText("IVA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 30));

        combotipo.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto", "Servicio" }));
        getContentPane().add(combotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 120, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setText("TIPO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 50, 30));

        salir.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        salir.setText("SALIR");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 102, 44));

        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 102, 44));

        eliminar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 91, 44));

        editar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        editar.setText("EDITAR");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 92, 44));

        guardar.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 94, 44));

        nuevo.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 93, 44));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel7.setText("EMBALAJE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel9.setText("ESTADO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 50, 30));

        combotipo1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        combotipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(combotipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 120, 30));

        txtid1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        txtid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseClicked
        nuevo();
    }//GEN-LAST:event_nuevoMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        guardar();
    }//GEN-LAST:event_guardarMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        editar();
    }//GEN-LAST:event_editarMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_eliminarMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        arranque();
    }//GEN-LAST:event_cancelarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        selecTable();
    }//GEN-LAST:event_tabMouseClicked

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
        informe();// TODO add your handling code here:
    }//GEN-LAST:event_informeActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        try {
            imprimir(); // TODO add your handling code here:
        } catch (JRException ex) {
            Logger.getLogger(Mercaderias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void txtid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mercaderias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mercaderias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mercaderias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mercaderias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mercaderias dialog = new Mercaderias(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Informe;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> comboinfo;
    private javax.swing.JComboBox<String> comboinfo2;
    private javax.swing.JComboBox<String> comboiva;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JComboBox<String> combotipo1;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tab;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    // End of variables declaration//GEN-END:variables
   
    
    private void arranque(){
    //campos
    txtid.setEnabled(false);
    txtid.setText(null);
    txtdescripcion.setEnabled(false);
    txtdescripcion.setText(null);
    combotipo.setEnabled(false);
    combotipo.setSelectedIndex(-1);
    comboiva.setSelectedIndex(-1);
    comboiva.setEnabled(false);
    txtprecio.setText(null);
    txtprecio.setEnabled(false);
    //botones
    nuevo.setEnabled(true);
    guardar.setEnabled(false);
    guardar.setText("Guardar");
    editar.setEnabled(false);
    eliminar.setEnabled(false);
    tableModel();
    tab.setEnabled(true);
    }
    
    private void tableModel(){
        tab.getColumnModel().getColumn(0).setPreferredWidth(80);
        tab.getColumnModel().getColumn(1).setPreferredWidth(180);
        tab.getColumnModel().getColumn(2).setPreferredWidth(180);
        tab.getColumnModel().getColumn(3).setPreferredWidth(180);
        tab.getColumnModel().getColumn(4).setPreferredWidth(180);
        model = (DefaultTableModel)tab.getModel();
        model.setNumRows(0);
        List<Producto> list = dao.list();
        for (Producto l : list){
            model.addRow(new Object[]{
                l.getId_prod(), l.getDescripcion(), l.getPrecio(), l.getTipo(), l.getIva()
            });
        }
    }
    
    private void nuevo(){
     //campos
    txtdescripcion.setEnabled(true);
    txtdescripcion.setText(null);
    tab.setEnabled(false);
    combotipo.setEnabled(true);
    txtprecio.setText(null);
    txtprecio.setEnabled(true);
    comboiva.setEnabled(true);
    //botones
    nuevo.setEnabled(false);
    guardar.setEnabled(true);
    guardar.setText("Guardar");
    editar.setEnabled(false);
    eliminar.setEnabled(false);
    }
    String tipo =null;
    String iva =null;
    private void guardar(){
        
        if(!txtdescripcion.getText().isEmpty() && !txtprecio.getText().isEmpty() && combotipo.getSelectedIndex()>-1 && comboiva.getSelectedIndex()>-1){
            
            if(guardar.getText().equals("Guardar")){
                Producto p = new Producto(txtdescripcion.getText(),combotipo.getSelectedItem().toString()
                        ,Integer.parseInt(txtprecio.getText()),comboiva.getSelectedItem().toString(),0);
                dao.guardar(p);
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                arranque();
            }else{
                Producto p = dao.buscarPorId(Integer.parseInt(txtid.getText()));
                p.setDescripcion(txtdescripcion.getText());
                p.setTipo(combotipo.getSelectedItem().toString());
                p.setPrecio(Integer.parseInt(txtprecio.getText()));
                p.setIva(comboiva.getSelectedItem().toString());
                dao.actualizar(p);
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                arranque();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo vacio");
        }
    }
    
    private void selecTable(){
        if(tab.getRowCount()> 0){
            if(tab.isEnabled()){
                if(tab.getSelectedRow()> -1){
                   Producto p = dao.buscarPorId(Integer.parseInt(model.getValueAt(tab.getSelectedRow(),0).toString()));
                   txtid.setText(String.valueOf(p.getId_prod()));
                   txtdescripcion.setText(p.getDescripcion());
                   combotipo.setSelectedItem(p.getTipo());
                   txtprecio.setText(String.valueOf(p.getPrecio()));
                   comboiva.setSelectedItem(p.getIva());
                   editar.setEnabled(true);
                   eliminar.setEnabled(true);
                   nuevo.setEnabled(false);
                }
            }
        }
    }
    
    private void editar(){
         txtdescripcion.setEnabled(true);
         combotipo.setEnabled(true);
         txtprecio.setEnabled(true);
         comboiva.setEnabled(true);
         
         nuevo.setEnabled(false);
         guardar.setText("Actualizar");
         guardar.setEnabled(true);
         editar.setEnabled(false);
         eliminar.setEnabled(false);
    }
    
    private void eliminar(){
        if(JOptionPane.showConfirmDialog(null, "Desea Eliminar el registro","Mensaje del Sistema..",JOptionPane.YES_NO_OPTION )==0){
            dao.eliminar(Integer.parseInt(txtid.getText().toString()));
            JOptionPane.showMessageDialog(null, "Registo Eliminado");
            arranque();
        }else{
            JOptionPane.showMessageDialog(null, "Eliminacion cancelada");
        }
    }
    
    private void informe(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        Informe.setModal(true);
        Informe.setLocation(x,y);
        Informe.setLocationRelativeTo(null);
        Informe.setVisible(true);
    }
    
    private void imprimir() throws JRException{
        LinkedList<Producto> info = new LinkedList();
        List<Producto> list = dao.list();
        for (Producto l : list){
            
            if(comboinfo.getSelectedItem().equals("Todos") && comboinfo2.getSelectedItem().equals("Todos")){
                info.add(l);
            }else{
                if(l.getTipo().equals(comboinfo.getSelectedItem().toString()) && comboinfo2.getSelectedItem().equals("Todos")){
                    info.add(l);
                }else{
                    if(l.getTipo().equals(comboinfo.getSelectedItem().toString()) && l.getIva().equals(comboinfo2.getSelectedItem().toString())){
                        info.add(l);
                    }else{
                        if(comboinfo.getSelectedItem().equals("Todos") && l.getIva().equals(comboinfo2.getSelectedItem().toString())){
                            info.add(l);
                        }
                    }
                }
            }
            
        }
         try {
            JasperReport reportes = (JasperReport) JRLoader.loadObject(new File ("src/Reportes/Productos.jasper"));

            JasperPrint jasperPrint = JasperFillManager.fillReport(reportes, null, new JRBeanCollectionDataSource(info));
            
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
                    jviewer.setVisible(true);
                    

//            Exporter exporter = new JRPdfExporter();
//
//            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
//
//            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("ListaPorductos.pdf"));
//
//            exporter.exportReport(); 
         }
         catch(JRException e)
         {
             JOptionPane.showMessageDialog(null, "Error cargando reporte."+e);
         }
        
         Informe.dispose();
        
    }
    
}
