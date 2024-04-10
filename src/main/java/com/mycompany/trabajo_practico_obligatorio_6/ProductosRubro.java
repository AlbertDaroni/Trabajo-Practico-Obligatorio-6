package com.mycompany.trabajo_practico_obligatorio_6;

import javax.swing.table.DefaultTableModel;

public class ProductosRubro extends javax.swing.JInternalFrame {
    private final DefaultTableModel modelo = new DefaultTableModel();
    
    public ProductosRubro() {
        initComponents();
        llenarComboBox();
        armarCabecera();
        //DeTodoSA.cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcProductos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel2.setText("Elegir rubro:");

        jcProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductosActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductosActionPerformed
        int filas = modelo.getRowCount() - 1;
        while (filas > -1) {
            modelo.removeRow(filas);
            filas--;
        }
        switch (jcProductos.getSelectedIndex()) {
            case 0 -> {
                for (Producto i : DeTodoSA.producto) {
                    if(i.getRubro().getCategoria().equals("Comestible")){
                        modelo.addRow(new Object[]{i.getCodigo(),i.getDescripcion(),i.getPrecio(),i.getStock()});
                    }
                }
            }
            case 1 -> {
                for (Producto i : DeTodoSA.producto) {
                    if(i.getRubro().getCategoria().equals("Limpieza")){
                        modelo.addRow(new Object[]{i.getCodigo(),i.getDescripcion(),i.getPrecio(),i.getStock()});
                    }
                }
            }
            case 2 -> {
                for (Producto i : DeTodoSA.producto) {
                    if(i.getRubro().getCategoria().equals("Perfumería")){
                        modelo.addRow(new Object[]{i.getCodigo(),i.getDescripcion(),i.getPrecio(),i.getStock()});
                    }
                }
            }
            default -> {}
        }
    }//GEN-LAST:event_jcProductosActionPerformed
    private void llenarComboBox(){
        jcProductos.addItem(new Categoria("Comestible"));
        jcProductos.addItem(new Categoria("Limpieza"));
        jcProductos.addItem(new Categoria("Perfumería"));
    }
    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio ($)");
        modelo.addColumn("Stock");
        jTabla.setModel(modelo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Categoria> jcProductos;
    // End of variables declaration//GEN-END:variables
}
