
package lab6p1_diegoalberto;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 50432
 */
public class Lab6P1_DiegoAlberto {
    static Scanner sc = new Scanner(System.in); 
    static Random ran = new Random();

    
    public static void main(String[] args) {
        System.out.println("1.¿Cuántos primos tienes?");
        System.out.println("2. Frecuencia de letras");
        System.out.println("3. Salir");
        int opcion = 0;
        opcion = sc.nextInt();
         while(opcion != 3){
             
             switch( opcion ){
                 
                 case 1:{
                     int tamaño = 0;
                     int liminf = 0;
                     int limsup = 0;
                     
                     System.out.println("Ingrese el tamaño del arreglo");
                     tamaño = sc.nextInt();
                     if(tamaño <= 1){
                         System.out.println("El tamaño debe ser mayor a 1");
                     }else {}
                     
                     System.out.println("Ingrese el limite inferior");
                     liminf = sc.nextInt();
                     
                     System.out.println("Ingrese el limite superior");
                     limsup = sc.nextInt();
                     
                     
                     if(liminf > limsup){
                         System.out.println("El limite inferior debe se menor que el limite superior");
                     }else{}
                     
                     
                     
                     
                     
                     
                     
                     int[] randArra = genRandArray( tamaño, liminf, limsup );
                     
                     
                     
                 
                 }
                 break;
                 
                 case 2:{ 
                 
                 }break;
                 case 3:{
                     System.out.println("Gracias");
                     
                 
                 }
                 default:
             
             
             
             
             
             }
         
         
         }
    }
    
    public static int[] genRandArray(  ){ 

        return null;

}
    
    public static boolean[] isPrime (){
        
       boolean pri = true;
       
    
    
    }
    
    public static int [] countPrimeFactors(){
    
    }
    
    
    
    
}
