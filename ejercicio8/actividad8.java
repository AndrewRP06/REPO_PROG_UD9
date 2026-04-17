/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package actividades.mavenproject1;
import java.io.* ;
import java.util.Scanner;
/**
 *
 * @author ALUMNO
 */
public class actividad8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre de archivo a copiar");
    String copiar = sc.nextLine();
    String destino = "copia_de_" + copiar ;
    
        try(
            BufferedReader si_lee = new BufferedReader(new FileReader(copiar));
            BufferedWriter out = new BufferedWriter(new FileWriter(destino))){
        String linea ;
        while((linea = si_lee.readLine()) != null ){
                out.write(linea);
                out.newLine();
            }
        System.out.println("La copia se hizo correctamente");    
      
        
        }catch(IOException error){
            System.out.println("error " + error.getMessage());
        }
        
}
}


