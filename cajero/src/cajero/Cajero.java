/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * @author La Estrella
 */
public class Cajero extends javax.swing.JFrame {

    //instancia de la clase CuentaDeAhorros
    private CuentaDeAhorros cuenta = null;
    
    // Operaciones con la BD
    private static Connection con = null;
    
    /**
     * Metodo que permite conectarse a la base de datos.
     */
    private void conectarBD() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\La Estrella\\Documents\\NetBeansProjects\\cajero\\cajero.accdb");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible conectarse a la BD");
            e.printStackTrace();
        }
    }
    /**
     * Creates new form Cajero
     */
    public Cajero() {
        initComponents();
        conectarBD();
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
        btnRetiro = new javax.swing.JButton();
        btnConsigno = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnClave = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        btnRecarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAJERO AUTOMATICO");

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuenta de Ahorros BAN-EAN");

        btnRetiro.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnRetiro.setText("RETIRAR");
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnConsigno.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnConsigno.setText("CONSIGNAR");
        btnConsigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignoActionPerformed(evt);
            }
        });

        btnSaldo.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        btnSaldo.setText("CONSULTAR SALDO");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnClave.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnClave.setText("CAMBIAR CLAVE");
        btnClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaveActionPerformed(evt);
            }
        });

        btnTransferir.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnTransferir.setText("TRANSFERIR A OTRA CUENTA");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        btnRecarga.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnRecarga.setText("RECARGAR TU CELULAR");
        btnRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsigno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClave, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetiro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnConsigno)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaldo)
                    .addComponent(btnClave))
                .addGap(18, 18, 18)
                .addComponent(btnTransferir)
                .addGap(18, 18, 18)
                .addComponent(btnRecarga)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que captura el evento del boton RETIRAR
     * @param evt Evento capturado
     */
    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        // TODO add your handling code here:
        int retiro;
        cuenta = cargarCuenta("Ingrese su número de cuenta");
        if(cuenta != null){
            retiro = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Cuanto desea retirar?",
                    "Usuario: " + cuenta.obtenerCliente(),
                    JOptionPane.QUESTION_MESSAGE));
            if(claveValida(cuenta.obtenerClave())){
                if(cuenta.hacerRetiro(retiro)){
                    cambiarSaldo(cuenta);
                    JOptionPane.showMessageDialog(this,
                            "Transacción exitosa.\n\nNuevo saldo " + cuenta.obtenerSaldo(),
                            "Usuario: " + cuenta.obtenerCliente(),
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this,
                            "Transacción fallida.\n\nSaldo insuficiente.",
                            "Usuario: " + cuenta.obtenerCliente(),
                            JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRetiroActionPerformed

    /**
     * Método que captura el evento del botón CONSIGNAR
     * @param evt Evento capturado
     */
    private void btnConsignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignoActionPerformed
        // TODO add your handling code here:
        int abono;
        cuenta = cargarCuenta("Ingrese su número de cuenta");
        if(cuenta != null){
            abono = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Cuanto desea consignar?",
                    "Usuario: " + cuenta.obtenerCliente(),
                    JOptionPane.QUESTION_MESSAGE));
            if(claveValida(cuenta.obtenerClave())){
                cuenta.hacerDeposito(abono);
                cambiarSaldo(cuenta);
                JOptionPane.showMessageDialog(this,
                        "Transacción exitosa.\n\nNuevo saldo " + cuenta.obtenerSaldo(),
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsignoActionPerformed

    /**
     * Método que permite capturar el evento del botón CONSULTAR SALDO
     * @param evt Evento capturado
     */
    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        // TODO add your handling code here:
        cuenta = cargarCuenta("Ingrese su número de cuenta");
        if(cuenta != null){
            if(claveValida(cuenta.obtenerClave())){
                JOptionPane.showMessageDialog(this,
                        "Su saldo es: " + cuenta.obtenerSaldo(),
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaldoActionPerformed

    /**
     * Método que permite capturar el evento del botón CAMBIAR CLAVE
     * @param evt Evento capturado
     */
    private void btnClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaveActionPerformed
        // TODO add your handling code here:
        int nuevaClave;
        cuenta = cargarCuenta("Ingrese su número de cuenta");
        if(cuenta != null){
            if(claveValida(cuenta.obtenerClave())){
                nuevaClave = Integer.parseInt(JOptionPane.showInputDialog(this,
                        "Cuál es la nueva clave?",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.QUESTION_MESSAGE));
                cuenta.cambiarClave(nuevaClave);
                cambiarClave(cuenta);
                JOptionPane.showMessageDialog(this,
                        "La clave ha sido cambiada con éxito",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClaveActionPerformed

    /**
     * Método que permite capturar el evento del botón TRANSFERIR A OTRA CUENTA
     * @param evt Evento capturado
     */
    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
        int monto;
        CuentaDeAhorros cuentaOrigen = cargarCuenta("Cuenta desde donde va a transferir.");
        CuentaDeAhorros cuentaDestino;
        if(cuentaOrigen != null){
            monto = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Cuanto desea transferir?",
                    "Usuario: " + cuenta.obtenerCliente(),
                    JOptionPane.QUESTION_MESSAGE));
            cuentaDestino = cargarCuenta("Cuenta hacia donde va a transferir.");
            if(cuentaDestino != null){
                if(claveValida(cuentaOrigen.obtenerClave())){
                    if(cuentaOrigen.hacerRetiro(monto)){
                        cuentaDestino.hacerDeposito(monto);
                        cambiarSaldo(cuentaOrigen);
                        cambiarSaldo(cuentaDestino);
                        JOptionPane.showMessageDialog(this,
                                "Transacción exitosa.\n\nNuevo saldo " + cuentaOrigen.obtenerSaldo(),
                                "Usuario: " + cuentaOrigen.obtenerCliente(),
                                JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,
                                "Transacción fallida.\n\nSaldo insuficiente.",
                                "Usuario: " + cuentaOrigen.obtenerCliente(),
                                JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Clave incorrecta",
                            "Usuario: " + cuentaOrigen.obtenerCliente(),
                            JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "La cuenta no existe",
                        "BAN-EAN",
                        JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    /**
     * Método que permite capturar el evento del botón RECARGAR TU CELULAR
     * @param evt Evento capturado
     */
    private void btnRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargaActionPerformed
        // TODO add your handling code here:
        int monto;
        cuenta = cargarCuenta("Ingrese su número de cuenta");
        if(cuenta != null){
            monto = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Cuanto desea recargar?",
                    "Usuario: " + cuenta.obtenerCliente(),
                    JOptionPane.QUESTION_MESSAGE));
            JOptionPane.showInputDialog(this,
                    "Cual es el número del celular que desea recargar?",
                    "Usuario: " + cuenta.obtenerCliente(),
                    JOptionPane.QUESTION_MESSAGE);
            if(claveValida(cuenta.obtenerClave())){
                if(cuenta.hacerRetiro(monto)){
                    cambiarSaldo(cuenta);
                    JOptionPane.showMessageDialog(this,
                            "Transacción exitosa.\n\nNuevo saldo " + cuenta.obtenerSaldo(),
                            "Usuario: " + cuenta.obtenerCliente(),
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this,
                            "Transacción fallida.\n\nSaldo insuficiente.",
                            "Usuario: " + cuenta.obtenerCliente(),
                            JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta",
                        "Usuario: " + cuenta.obtenerCliente(),
                        JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La cuenta no existe",
                    "BAN-EAN",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRecargaActionPerformed

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
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClave;
    private javax.swing.JButton btnConsigno;
    private javax.swing.JButton btnRecarga;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que carga la información de una cuenta desde la base de datos
     * @param mensaje Para indicar al cliente que cuenta es la que se requiere
     * @return instancia de la clase CuentaDeAhorros con la información de la
     * cuenta sobre la cual se va a realizar una transacción. null si la cuenta
     * no existe.
     */
    public CuentaDeAhorros cargarCuenta(String mensaje){
        int numCuenta = Integer.parseInt(JOptionPane.showInputDialog(this,
                mensaje,
                "BAN-EAN",
                JOptionPane.PLAIN_MESSAGE));
        int clave;
        String cliente;
        double saldo;
        
        CuentaDeAhorros cuentaTMP = null;
        
        try {
            String sql = "SELECT * FROM cuentas WHERE numCuenta = ?";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1, numCuenta);
            
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                clave = rs.getInt("contrasena");
                cliente = rs.getString("titular");
                saldo = rs.getDouble("saldo");
                cuentaTMP = new CuentaDeAhorros(numCuenta, clave, cliente, saldo);
            }else{
                JOptionPane.showMessageDialog(this, "Número de cuenta inválido",
                        "BAN-EAN", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error grave: " + e.getMessage());
        }
        
        return cuentaTMP;
    }

    /**
     * Verifica si la clave ingresada corresponde a la de la cuenta que sobre la
     * cual se va a realizar una transacción.
     * @param claveOriginal Clave original de la cuenta
     * @return true si es correcta y false en caso contrario.
     */
    private boolean claveValida(int claveOriginal) {
        int clave;
        clave = Integer.parseInt(JOptionPane.showInputDialog(this,
                "Por favor ingrese su clave",
                "BAN-EAN",
                JOptionPane.PLAIN_MESSAGE));
        return claveOriginal == clave;
    }

    /**
     * Carga en la base de datos el nuevo saldo de una cuenta.
     * @param cta Cuenta sobre la cual se hizo la transacción.
     */
    private void cambiarSaldo(CuentaDeAhorros cta) {
        try {
            String sql = "UPDATE cuentas SET saldo = ? WHERE (numCuenta = ?);";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setDouble(1, cta.obtenerSaldo());
            st.setInt(2, cta.obtenerNumeroCuenta());
            
            st.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error grave: " + e.getMessage());
        }
    }

    /**
     * Cambia la clave de una cuenta.
     * @param cta Cuenta a la cual se le va a cambiar la clave.
     */
    private void cambiarClave(CuentaDeAhorros cta) {
        try {
            String sql = "UPDATE cuentas SET contrasena = ? WHERE (numCuenta = ?);";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1, cta.obtenerClave());
            st.setInt(2, cta.obtenerNumeroCuenta());
            
            st.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error grave: " + e.getMessage());
        }
    }
}
