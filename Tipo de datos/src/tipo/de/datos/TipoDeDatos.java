/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo.de.datos;

/**
 *
 * @author usuario
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    // enteros -32768 a 32767
    int nuemroEntero  = 0;
    double numeroDoble = 0.0;
    char letraChar = 'A';
    String cadena = "A";
    boolean VoF = false;
    // VoF = true;
    boolean VoF1 = true;
    
  
    
    public static void main(String[] args) {
        // TODO code application logic here
    imprimirNombre (); 
    suma2Numeros(8,2);
    System.out.println(suma2Numeros(8,2));
    }
   
  public static void imprimirNombre (){
    System.out.println("Michael");
  
}  
  public static int suma2Numeros (int num1, int num2){
      int suma = num1 + num2;
      return suma;
  }
}


// comentario de una linea
/*
comentario 
de 
un 
parrafo
*/

