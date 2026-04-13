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
    try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\PC GAMING\\Documents\\NetBeansProjects\\UD2\\src\\main\\java\\EJ2.java"))) {

        String linea;
        while ((linea = in.readLine()) != null) { 
            System.out.println(linea);
        }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
        }
    }
}