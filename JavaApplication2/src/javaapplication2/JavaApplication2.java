/// \u001B[31m    | Eso es para las negrtias en System.out.print (no me funcionó)
package javaapplication2;
import java.util.*;
import java.io.*;
///estos paquetes encerrados en comentarios para los colores de los cuadros del JOption que agregaré
import javax.swing.*;
import java.awt.*;
/// ------------------------------------------------------------------------------------------------

public class JavaApplication2 { 
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        ///JOption label
        JLabel login = new JLabel("<html><font color='red'><b>Login</b></font></html>");
        JLabel regis = new JLabel("<html><font color='red'><b>Register</b></font></html>");
        ///Joption label
        
        
        ///login credenciales
        String user = null;
        String psw = null;
        ///------------------
        
        while(true){
        System.out.println("Este es mi primer menu\n\n"
        + "1.Calculadora\n"
        + "2.Login\n"
        + "3.Register\n"
        + "4.Salir\n\n");
        
        System.out.print("Ingresa una opción: ");
        int opc = menu.nextInt();
        
        switch(opc){
            case 1:
                
                    Scanner calc = new Scanner(System.in);
                    System.out.print("\n\nCalculadora!\nIngresa el primer numero: ");
                    int num1 = calc.nextInt();
                    System.out.print("Ingresa el segundo numero: ");
                    int num2 = calc.nextInt();
                    Scanner calc2 = new Scanner(System.in);
                    System.out.println("\n\n1.Suma\n"
                            + "2.Resta\n"
                            + "3.Multiplicación\n"
                            + "4.División\n");
                    System.out.print("Selecciona el tipo de calculo que deseas realizar: ");
                    int opc_calc = calc2.nextInt();
                    
                    switch(opc_calc){
                            case 1:
                                int sum = num1 + num2;
                                System.out.println("El resultado de la suma es: "+sum);
                            break;
                            
                            case 2:
                                int rest = num1 - num2;
                                System.out.println("El resultado de la resta es: "+rest);
                            break;
                            
                            case 3:
                                int mult = num1 * num2;
                                System.out.println("El resultado de la multiplicación es: "+mult);
                            break;
                            
                            case 4:
                                int div = num1 / num2;
                                System.out.println("El resultado de la división es: "+div);
                            break;
                    }
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,login,"Ventana de login", JOptionPane.INFORMATION_MESSAGE);
                String user_log = JOptionPane.showInputDialog("Ingresa tu nombre de usuario: ");
                if (user_log.equals(user)){
                    JOptionPane.showMessageDialog(null,"Tu usuario es correcto!");
                    String psw_log = JOptionPane.showInputDialog("Ingresa tu contraseña: ");
                    
                    if(psw_log.equals(psw)){
                        JOptionPane.showMessageDialog(null,"Tu contraseña es correcta, has ingresado!");
                    }else{
                        JOptionPane.showMessageDialog(null,"La contraseña que ingresaste no coincide con la del usuario "+user_log +"!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El nombre de usuario que ingresaste no corresponde con la base de datos");
                }
                
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null,regis,"Ventana de register", JOptionPane.INFORMATION_MESSAGE);
                String user_reg = JOptionPane.showInputDialog("Ingresa un nuevo nombre de usuario: ");
                user = null;
                user = user_reg;
                String psw_reg = JOptionPane.showInputDialog("Ingresa una nueva contraseña: ");
                psw = null;
                psw = psw_reg;
                
                break;
            
            case 4:
                System.exit(0);
                break;
                
            default:
                ///esto no era necesario pero bueno..
                System.out.println("La opción que elegíste no existe... solo hay 4 opciónes");
                break;
        }
        int lnblanco = 5;
        for (int esp = 0; esp < lnblanco; esp++) {
            System.out.println();
        }
        }
    }
    
}

///bloque de codigo creado por Txndem
///
