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
    BufferedWriter escribido = null;
        try{
                escribido = new BufferedWriter(new FileWriter("Texto.txt"));
                
                //esto se puede poner mejor pero para eso tiene que haber 2 tarjetas rojas en el partido 
                String linea = "En un lugar de La Mancha,";
                for (int i = 0; i < linea.length(); i++) {
                             escribido.write(linea.charAt(i));
                            }
                escribido.close();

                //apartado 2
                  escribido = new BufferedWriter(new FileWriter("Texto.txt", true));

                String linea2 = "de cuyo nombre no quiero acordarme";
                escribido.newLine();
                escribido.write(linea2);
                
                
                
        }catch(IOException error){
            System.out.print("Error" + error.getMessage());
        
        }finally{
            if(escribido != null){
                try{
                            escribido.close();
                        }catch(IOException error){
                            System.out.println(error);
                            }
                        }
                }
    }
}