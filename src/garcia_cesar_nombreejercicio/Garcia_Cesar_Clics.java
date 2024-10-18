
 package garcia_cesar_nombreejercicio;

import java.util.Scanner;


public class Garcia_Cesar_Clics{
       public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de clics de 0.25%");
        int clics1=entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de clics de 0.30%");
        int clics2=entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de clics de 0.80%");
        int clics3=entrada.nextInt();
        
        double costo1 =clics1*0.25;
        double costo2 =clics2*0.30;
        double costo3 =clics3*0.80;
        double costot=costo1+costo2+costo3;
        double tclics = clics1 + clics2 + clics3;
        double isv=costot * 0.16;
        double totalConISV = costot + isv;

        System.out.println("Su total sera de: $"+costot+" y el total con ISV $"+totalConISV);
       
    }
}
       