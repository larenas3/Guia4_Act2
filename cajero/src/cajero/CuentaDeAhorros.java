/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author Lida Heliana Arenas Mogollón
 */
public class CuentaDeAhorros {
    //Atributos
    private int numeroCuenta;
    private int clave;
    private String cliente;
    private double saldo;
    private double interes;
    
    public double obtenerSaldo(){
        return saldo;
    }
    
    public double obtenerInteres(){
        return interes;
    }
    
    public boolean hacerRetiro(double monto){
        if(monto <= saldo){
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    public void hacerDeposito(double monto){
        saldo += monto;
    }
    
    public void abonarInteres(){
        saldo += (saldo * (interes/12));
    }
    
    public void cambiarClave(int clave){
        this.clave = clave;
    }

    public CuentaDeAhorros(double saldo, double interes){
        this.saldo = saldo;
        this.interes = interes;
    }

    public CuentaDeAhorros(int numeroCuenta, int clave, String cliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.clave = clave;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String obtenerCliente() {
        return cliente;
    }
    
    public int obtenerClave(){
        return clave;
    }

    public int obtenerNumeroCuenta() {
        return numeroCuenta;
    }
}
