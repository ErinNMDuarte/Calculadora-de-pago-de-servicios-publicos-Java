
package controlador;

import modelo.ValorFactura;
import vista.VistaMenu;


public class CapturaDatos {
    
    private float valorbase;
    private int estrato;
    private int consumo;

    public void capturadato(){
        VistaMenu vm=new VistaMenu();
        valorbase=vm.vistamenu();
        estrato=vm.estratoinmueble();
        consumo=vm.consumoinmueble();
      
        ValorFactura vf=new ValorFactura((int) valorbase, estrato, consumo);
        vf.calculoestrato();
    }
}


