/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ejecicio2;
import java.io.* ;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {
        try (FileReader frbro = new FileReader("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\UD4_Tablas\\src\\main\\java\\a01\\A01.java")) {
                int carac;
             while ((carac = frbro.read()) != -1) {
                System.out.print((char) carac);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
