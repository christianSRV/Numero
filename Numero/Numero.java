
import java.util.Scanner;
/**
 * Esta programa verifica si un número  es positivo,negativo o cero
 * @author: Sanchez Pablo Christian Viery
 */
public class Numero
{
    
     /**
     * Método que define si un numero en positivo,negativo o cero
     */
    
    public void comprobar(){
    System.out.println("Introduce un numero");/**Se solicita al usuario un numero */
    
    Scanner sc = new Scanner(System.in);/**Se instancia a partir de la clase Scanner */
    double numero = sc.nextDouble();/**Se almacena el valor dado por el usuario */
    
    if(numero==0)System.out.println("Es un numero neutro");/**Se imprime si el valor es cero */
    if(numero<0)System.out.println("Es negativo");/**Se imprime si el valor es negativo */
    if(numero>0)System.out.println("Es positivo");/**Se imprime si el valor es positivo */
    }
    
    
    
    public static void main(String [] args){
    Numero n = new Numero();/**Se crea una instancia apartir de la clase Numero */
    n.comprobar();/**Se ejecuta el metodo comprobar */
    
    }
}
