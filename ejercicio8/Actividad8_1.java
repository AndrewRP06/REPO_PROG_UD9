/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades.mavenproject1;
import java.io.*;
/**
 *
 * @author ALUMNO
 */
public class Actividad8_1 {
   public static void main(String[] args){
   try(BufferedWriter escribido = new BufferedWriter(new FileWriter("Texto.txt"));){
      String linea1 = "En un lugar de La Mancha" ; 
                    for (int i = 0; i < linea1.length(); i++) {
                escribido.write(linea1.charAt(i));
            }

   }catch(IOException e){
       System.out.print("Error:" + e.getMessage());
   }
   
      try(BufferedWriter escribido = new BufferedWriter(new FileWriter("Texto.txt" , true));){
      String linea2 = " cuyo nombre no quiero acordarme" ; 
            escribido.newLine();
                    for (int i = 0; i < linea2.length(); i++) {
                escribido.write(linea2.charAt(i));
            }

   }catch(IOException e){
       System.out.print("Error:" + e.getMessage());
   }
   
   
   }
}
