/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgeworth
 */
public class Sistema_cajero {
    public static double saldo_actual;
    
    public Sistema_cajero(){
        saldo_actual=0;
    }
    
    public void depositar(double deposito){
        saldo_actual+=deposito;
    }
    
    public void retirar(double retiro){
        if(saldo_actual >=retiro){
            saldo_actual-=retiro;
        }
        else{
            JOptionPane.showMessageDialog(null, "[Error]- Saldo Insuficiente");
        }
    }
    
    public double obtener_saldo(){
        return saldo_actual;
    }
    
    
}
