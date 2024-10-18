
package garcia_cesar_nombreejercicio;

import java.util.Scanner;


public class Garcia_Cesar_PlanilladeTrabajo{

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nombre;
        int hora;
        double tarifa;
        double salario;
        
        System.out.println("Favor ingrese el nombre completo del empleado");
        Nombre= entrada.nextLine();
        
        System.out.println("Favor ingrese las horas de trabajo mensual del empleado");
        hora= entrada.nextInt();
        
        System.out.println("Favor ingrese la tarifa por hora del empleado");
        tarifa= entrada.nextDouble();
        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: "+Nombre);
        System.out.println("Hora de trabajo Mensual: "+hora);
        System.out.println("La tarifa por hora es de: "+tarifa+"Lps");
        double semanal=hora/4;
        salario=(semanal*tarifa);
        System.out.println("Su salario sera de: "+salario+"Lps semanales");
       
    }
    
}
