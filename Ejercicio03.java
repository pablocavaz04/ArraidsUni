/*
3) Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[10];

        for(int i=0;i<10;i++){
            System.out.println("Introduzca un numero: ");
            numero [i] = sc.nextInt();

        }
        for(int i=9;i>=0;i--){
            System.out.println(numero[i]);
        }
    }
}
