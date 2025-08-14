/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desafio3_Radmon;

import java.util.Random; // se importa la clase radom

/**
 *
 * @author maria
 */
public class Desafio_3 {

    public static void main(String[] args) {
        Random unRandom = new Random();
        int suma=0;
        
        while (suma <=25){
            int unNumero= unRandom.nextInt(11);
            System.out.println("Número Random generado: " + unNumero);
            if (unNumero % 2 == 0){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
                suma +=unNumero; // Esto equivale a suma = suma + unNumero 
                
            }
            
        }
        
        System.out.println("la suma total de los número impares es: " + suma);
   
    }
}
