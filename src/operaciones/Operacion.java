
package operaciones;

import java.util.Scanner;


public class Operacion {
    
    public int[] arreglo= new int[10];
    public int opcion;
    
    //constructor
    public Operacion(){
        
        this.mostrarMenu();
        
    }
    
    //Muestre el menu en pantalla
    public void mostrarMenu(){
        
        System.out.println("Ecoja opcion\n" + "1. llenar array\n"
                + "2. Escribir array\n" + "3. Sumatoria\n"
                + "4. Productoria\n" + "5. Tamaño del array\n"+"6. Salir");
        
        Scanner lectura = new Scanner (System.in);
        opcion = lectura.nextInt();
        this.cargarOpcion(opcion);
        
    }
    
    //Lee arreglo
    public void leeArreglo(){
        
        System.out.println("la opcion escogida es Leer un arreglo");
    }
    
    //Escribe el arreglo
    public void escrbirArreglo(){
        
        System.out.println("la opcion escogida es escribir un arreglo");
        
    }
    
    //Generar sumatoria
    public void sumatoria(){
        
        System.out.println("la opcion escogida es una sumatoria");
        
    }
    
    //Generar productoria
    public void productoria(){
        
        System.out.println("la opcion escogida es un producto");
       
    }
    
    //cargar opcion
    public void cargarOpcion(int op){
        
       // System.out.println("la opcion escogida es:"+op);
        
        switch(op){
            
            case 1:
                this.leeArreglo();
                break;
            case 2:
                this.escrbirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4:    
                this.productoria();
                break;
            case 5:
               // System.out.println(this.arreglo.length);
                break;
    }
        
    }
}
