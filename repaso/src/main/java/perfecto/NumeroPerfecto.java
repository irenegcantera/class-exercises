
package perfecto;
import java.util.Scanner;

/**
 * Ejercicio48 Dado un número visualizar un mensaje que indique si el número es perfecto
 * @author Irene González Cantera
 */
public class NumeroPerfecto {
    
    public static void main(String[] args) {
        
        /*Declaración e inicialización de las variables*/
        int numero;
        int suma = 0;
        
        /*Introducción de un número por teclado*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        
        /*Bucle while que se repite hasta que el número introducido del usuario
        sea positivo*/
        while(numero <= 0){
            System.out.println("El número debe ser POSITIVO. \nIntroduce de nuevo.");
            numero = teclado.nextInt();
        }
        
        /*Bucle for que inicializa el contador a 1 y termina hasta que llegue al
        número, en cada contador hay una estructura condicional que si el resto 
        es igual a cero se sumará el contador actual a la variable suma*/ 
        for(int i=1; i < numero; i++){
            if (numero % i == 0){
                suma += i;
            }
        }
        /*Estructura condicional que si el numero del usuario es igual a la suma 
        obtenida del bucle anterior se visualizará un mensaje y en el caso 
        contrario también*/
        if(numero == suma){
            System.out.println("El número es perfecto.");
        }else{
            System.out.println("El número NO es perfecto.");
        }
    }
}
