package com.mycompany.trabajo_practico_obligatorio_6;

import javax.swing.JOptionPane;

public class GestionProductos extends javax.swing.JInternalFrame {
    
    public GestionProductos() {
        initComponents();
        llenarComboBox();
        //DeTodoSA.cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jDescripcion = new javax.swing.JTextField();
        jPrecio = new javax.swing.JTextField();
        jcProductos = new javax.swing.JComboBox<>();
        jStock = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Código:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:         $");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        jcProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductosActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBuscar))
                                    .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNuevo)
                    .addComponent(jGuardar)
                    .addComponent(jEliminar)
                    .addComponent(jSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
        
    }//GEN-LAST:event_jcProductosActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        jCodigo.setText("");
        jDescripcion.setText("");
        jPrecio.setText("");
        jcProductos.setSelectedIndex(-1);
        jStock.setText("");
        jCodigo.requestFocus();
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        int codigo, stock; double precio;
        String descripcion = jDescripcion.getText();
        try{
            codigo = Integer.parseInt(jCodigo.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número entero");
            jCodigo.setText("");
            jCodigo.requestFocus();
            return;
        }
        try{
            stock = Integer.parseInt(jStock.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número entero");
            jStock.setText("");
            jStock.requestFocus();
            return;
        }
        try{
            precio = Double.parseDouble(jPrecio.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número");
            jPrecio.setText("");
            jPrecio.requestFocus();
            return;
        }
        
        Categoria categoria = (Categoria)jcProductos.getSelectedItem();
        Producto productoNuevo = new Producto(codigo,stock,precio,descripcion,categoria);
        
        if(DeTodoSA.producto.add(productoNuevo)){
            JOptionPane.showMessageDialog(this, "Producto guardado");
        }else{
            JOptionPane.showMessageDialog(this, "Este producto ya existe");
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        jCodigo.requestFocus();
        int codigo;
        boolean encontrado = false;
        try{
            codigo = Integer.parseInt(jCodigo.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número entero");
            jCodigo.setText("");
            jCodigo.requestFocus();
            return;
        }
        for (Producto i : DeTodoSA.producto) {
            if(i.getCodigo() == codigo){
                jDescripcion.setText(i.getDescripcion());
                jStock.setText(i.getStock()+"");
                jPrecio.setText(i.getPrecio()+"");
                jcProductos.setSelectedItem(i.getRubro());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        int codigo;
        boolean encontrado = false;
        try{
            codigo = Integer.parseInt(jCodigo.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número entero");
            jCodigo.setText("");
            jCodigo.requestFocus();
            return;
        }
        for (Producto i : DeTodoSA.producto) {
            if(i.getCodigo() == codigo){
                DeTodoSA.producto.remove(i);
                encontrado = true;
                JOptionPane.showMessageDialog(this, "Producto eliminado");
                break;
            }
        }
        if(!encontrado){
            JOptionPane.showMessageDialog(this, "Este producto no existe");
        }
    }//GEN-LAST:event_jEliminarActionPerformed
    private void llenarComboBox(){
        jcProductos.addItem(new Categoria("Comestible"));
        jcProductos.addItem(new Categoria("Limpieza"));
        jcProductos.addItem(new Categoria("Perfumería"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jNuevo;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jStock;
    private javax.swing.JComboBox<Categoria> jcProductos;
    // End of variables declaration//GEN-END:variables
}
