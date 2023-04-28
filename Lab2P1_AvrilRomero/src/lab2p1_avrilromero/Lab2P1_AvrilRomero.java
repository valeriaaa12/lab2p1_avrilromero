/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_avrilromero;

import java.util.Scanner;

public class Lab2P1_AvrilRomero {

    ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Clasificando Numeros.");
            System.out.println("2.Aproximado.");
            System.out.println("3.MCD.");
            System.out.println("4.Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion = Leer.nextInt();
            switch (opcion) {
                case 1:{
                    System.out.println("Ingrese un numero: ");
                    int num = Leer.nextInt();
                    if (num <= 0) {
                        System.out.println("Su numero debe de ser positivo.Intente de nuevo.");
                    }
                    boolean par = true;
                    if (num % 2 != 0) {
                        par = false;
                    } 
                    boolean primo = true;
                    int cont=1;
                    int acum=0;
                    int resultado;
                    while (cont<=num){
                        resultado=num%cont;
                    if (resultado==0){
                        acum=acum+1;
                    }
                    cont=cont+1;
                    }
                    if (acum != 2){
                        primo = false;
                    }
                    if(par == true && primo == false){
                        System.out.println("El numero ingresado es par. ");
                    }else if (par==false && primo == false){
                        System.out.println("El numero ingresado es impar.");
                    } else if (primo==true && par==true){
                       System.out.println("El numero ingresado es par y primo.");
                    }else if (par==false && primo==true){
                      System.out.println("El numero ingresado es impar y primo.");
                    }else if (primo==true){
                         System.out.println("El numero ingresado es primo . ");
                }
                }
                    break;
                case 2:{
                    System.out.println("Ingrese un numero: ");
                    int n = Leer.nextInt();
                    if (n <= 0) {
                        System.out.println("Su numero debe de ser positivo.Intente de nuevo.");
                    }
                    double sumatoria = 1;
                    double cont = 1;
                    while (cont<=(double)n){
                        double exponente= Math.pow(cont,2);
                        double auxiliar=4*exponente; 
                        double fraccion= auxiliar/(auxiliar-1);
                        cont++;
                        sumatoria=fraccion*sumatoria;
                    }
                    System.out.println("PI: "+sumatoria*2);
                    
                } 
                break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    int num1 = Leer.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = Leer.nextInt();
                    if ((num1<=0)||(num2<=0)){             
                    System.out.println("Ambos numeros deben ser mayor a 0. ");
                    }
                    int resta;
                    while (num1!=num2){
                        if (num1<num2){
                            num2=num2-num1;
                            
                  
                        }else {
                            num1=num1-num2;
                        }
                    }
                    System.out.println("El MCD es: "+num1);
                   
                break;
                case 4:
                  seguir=false;  
                 break;
                default:
                    System.out.println("Opcion Incorrecta");
                break;
            }

        }
    }
    
}
