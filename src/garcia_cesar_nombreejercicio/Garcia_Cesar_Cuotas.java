package garcia_cesar_nombreejercicio;

import java.util.Scanner;

public class Garcia_Cesar_Cuotas {
       public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    
    System.out.println("Favor ingrese el valor del prestamo");
    double prestamo=entrada.nextDouble();
    
    System.out.println("Favor ingrese el plazo de pago establecido en meses");
    double plazopago=entrada.nextDouble();
    
    System.out.println("Favor ingrese el interes mensual aplicado al prestamo");
    double interes=entrada.nextDouble();
    
    System.out.println("Favor ingrese la comision por cuota");
    double comision=entrada.nextDouble();
    
    System.out.println("Favor ingrese el porcentaje seguro mensual aplicado a la cuota");
    double seguro=entrada.nextDouble();    

    double cmensual=prestamo/plazopago;
    double porcentaje=interes/100;
    double prein= prestamo*porcentaje;
    double interesm=prein/plazopago;
    double tpago=cmensual+interesm;
    double sm=(seguro/100)*(comision);
    double tpagof=tpago+comision+sm;
    double tpagoa=tpagof*plazopago;
    System.out.println("**** CUOTAS MENSUALES *******"); 
    System.out.println("Cuota de Pago Mensual: HNL"+tpagof);
    System.out.println("Total a Pagar: HNL"+tpagoa);
   
}
}
       
