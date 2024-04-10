package com.mycompany.trabajo_practico_obligatorio_6;

import java.util.TreeSet;

public class DeTodoSA extends javax.swing.JFrame {
    public static TreeSet<Producto> producto = new TreeSet<>();

    public DeTodoSA() {
        initComponents();
        cargarProductos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuRubro = new javax.swing.JMenuItem();
        jMenuNombre = new javax.swing.JMenuItem();
        jMenuPrecio = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuProductos.setText("Productos");
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuRubro.setText("Por Rubro");
        jMenuRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRubro);

        jMenuNombre.setText("Por Nombre");
        jMenuNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNombre);

        jMenuPrecio.setText("Por Precio");
        jMenuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNombreActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosNombre productosNombre = new ProductosNombre();
        productosNombre.setVisible(true);
        Escritorio.add(productosNombre);
        Escritorio.moveToFront(productosNombre);
    }//GEN-LAST:event_jMenuNombreActionPerformed

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.setVisible(true);
        Escritorio.add(gestionProductos);
        Escritorio.moveToFront(gestionProductos);
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrecioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosPrecio productosPrecio = new ProductosPrecio();
        productosPrecio.setVisible(true);
        Escritorio.add(productosPrecio);
        Escritorio.moveToFront(productosPrecio);
    }//GEN-LAST:event_jMenuPrecioActionPerformed

    private void jMenuRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRubroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ProductosRubro productosRubro = new ProductosRubro();
        productosRubro.setVisible(true);
        Escritorio.add(productosRubro);
        Escritorio.moveToFront(productosRubro);
    }//GEN-LAST:event_jMenuRubroActionPerformed
    
    public static void cargarProductos(){
        producto.add(new Producto(1,10,299.99,"Miel",new Categoria("Comestible")));
        producto.add(new Producto(2,5,999.99,"Oreo",new Categoria("Comestible")));
        producto.add(new Producto(3,1,1299.99,"Afeitadora",new Categoria("Limpieza")));
        producto.add(new Producto(4,76,786.99,"Cepillo de Dientes",new Categoria("Limpieza")));
        producto.add(new Producto(5,51,1999.99,"REXONA",new Categoria("Perfumería")));
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeTodoSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeTodoSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuNombre;
    private javax.swing.JMenuItem jMenuPrecio;
    private javax.swing.JMenuItem jMenuProductos;
    private javax.swing.JMenuItem jMenuRubro;
    // End of variables declaration//GEN-END:variables
}
