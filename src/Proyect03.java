
import java.util.Scanner;


public class Proyect03 {

    
    public static void main(String[] args) {
        
        String vendedor;
  double venta1,venta2,venta3,promedio,total;
  //Crear  un objeto de lectura de datos
  Scanner lectura =new Scanner(System.in);
  //Entrada de datos 
  
    System.out.print("Ingrese nombre del vendedor : ");
    vendedor = lectura.next();
    System.out.print("ingrso venta1 : ");
    venta1 = lectura.nextDouble();
     System.out.print("ingrso venta2 : ");
    venta2 = lectura.nextDouble();
     System.out.print("ingrso venta3 : ");
    venta3 = lectura.nextDouble();
    total = venta1+venta2+venta3;
    promedio = (venta1+venta2+venta3) /3;
    System.out.println("El Total de las ventas es: " + total);
    System.out.println("El Promedio de las ventas es: " + promedio);
        
        
    }
    
}
