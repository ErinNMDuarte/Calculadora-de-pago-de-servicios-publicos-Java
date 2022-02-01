
package vista;

import controlador.CapturaDatos;
import java.util.Scanner;


public class VistaMenu {
    private int opc;
    private float valorbase;
    private int estrato;
    private int consumo;
    Scanner cap=new Scanner (System.in);
    
    public int vistamenu(){
        
        System.out.println("PAGO DE SERVICIOS PUBLICOS");
        System.out.println("Seleccione el servicio publico:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");
        
        System.out.println("Opcion:");
        opc=(int) cap.nextFloat();
        switch(opc){
            case 1:
                valorbase=6200;
                break;   
            case 2:
                valorbase=9256;
                break;
            case 3:
                valorbase=5234;
                break;
            case 4:
                System.out.println("Hasta pronto.");
                System.exit(0);
                break;
         }        
                return (int) valorbase;
                   
        }
    
    public int estratoinmueble(){
        System.out.println("Estrato del inmueble:");
        estrato=cap.nextInt();
        return estrato;
        }        
                
    public int consumoinmueble(){
        System.out.println("Consumo del inmueble:");
        consumo=cap.nextInt();
        return consumo;
        
                
    }
    
    public void mostrardatos(){
        CapturaDatos cd=new CapturaDatos();
        while (opc!=4){
            cd.capturadato();
    }
    }

   
    
}
