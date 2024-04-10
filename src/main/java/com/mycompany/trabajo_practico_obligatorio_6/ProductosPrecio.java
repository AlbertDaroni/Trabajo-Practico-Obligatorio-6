package com.mycompany.trabajo_practico_obligatorio_6;

import javax.swing.table.DefaultTableModel;

public class ProductosPrecio extends javax.swing.JInternalFrame {
    private final DefaultTableModel modelo = new DefaultTableModel();

    public ProductosPrecio() {
        initComponents();
        armarCabecera();
        //DeTodoSA.cargarProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTexto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTexto2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado por Precio");

        jLabel2.setText("Entre: $");

        jTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexto1ActionPerformed(evt);
            }
        });
        jTexto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto1KeyReleased(evt);
            }
        });

        jLabel3.setText("y");

        jTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexto2ActionPerformed(evt);
            }
        });
        jTexto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTexto2KeyReleased(evt);
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
        jScrollPane1.setViewportView(jTabla);

        jLabel4.setText("(Valor mínimo)");

        jLabel5.setText("(Valor máximo)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(160, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(210, 210, 210)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTexto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto1KeyReleased
        double precio1 = Double.parseDouble(jTexto1.getText());
        double precio2 = Double.parseDouble(jTexto2.getText());
        borrarFilas();
        for (Producto i : DeTodoSA.producto) {
            if(i.getPrecio() >= precio1 && i.getPrecio() <= precio2){
                modelo.addRow(new Object[]{i.getCodigo(),i.getDescripcion(),i.getPrecio(),i.getStock(),i.getRubro()});
            }
        }
    }//GEN-LAST:event_jTexto1KeyReleased

    private void jTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexto2ActionPerformed
    }//GEN-LAST:event_jTexto2ActionPerformed

    private void jTexto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTexto2KeyReleased
        double precio1 = Double.parseDouble(jTexto1.getText());
        double precio2 = Double.parseDouble(jTexto2.getText());
        borrarFilas();
        for (Producto i : DeTodoSA.producto) {
            if(i.getPrecio() >= precio1 && i.getPrecio() <= precio2){
                modelo.addRow(new Object[]{i.getCodigo(),i.getDescripcion(),i.getPrecio(),i.getStock(),i.getRubro()});
            }
        }
    }//GEN-LAST:event_jTexto2KeyReleased

    private void jTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexto1ActionPerformed
    private void armarCabecera(){
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jTabla.setModel(modelo);
    }
    private void borrarFilas(){
        int filas = jTabla.getRowCount();
        while (filas > 0) {
            modelo.removeRow(filas - 1);
            filas--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTexto1;
    private javax.swing.JTextField jTexto2;
    // End of variables declaration//GEN-END:variables
}
