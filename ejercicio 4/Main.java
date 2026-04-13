/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.* ; 
/**
 *
 * @author PC GAMING
 */
public class Main {
public static void main(String[] args) {
    try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\PC GAMING\\Downloads\\NumerosReales.txt"))) {
        String linea;
        double suma = 0;
        int cantidad = 0;

        while ((linea = in.readLine()) != null) { 
            String[] partes = linea.split(" ");
                for (String parte : partes) {
                    double numero = Double.parseDouble(parte);
                        suma += numero ; 
                        cantidad++;
                }
        }
        double media = suma / cantidad;
        System.out.println("Suma:   " + String.valueOf(suma));
         System.out.println("Media:  " + String.valueOf(media));


        //Acistumbrado al CRTL+ALT+DOWN para quitar los espaciados 
        
        
        
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}