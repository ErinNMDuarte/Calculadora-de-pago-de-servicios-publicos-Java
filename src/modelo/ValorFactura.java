
package modelo;


public class ValorFactura {

private float valorbase;    
private int estrato;
private int consumo;
private double costotal;
private double desobre;
private double impuesto;
private double totalf;

public ValorFactura(int valorbase, int estrato, int consumo){
    this.valorbase=valorbase;
    this.consumo=consumo;
    this.estrato=estrato;
    
    
}
public void calculoestrato (){
    if (estrato==1 || estrato==2){
        costotal=valorbase*consumo;
        desobre=costotal*0.5*-1;
        impuesto=costotal*0.01;
        totalf=(costotal+desobre)+impuesto;   
    }
    else
        if (estrato==3 || estrato==4){
            costotal=valorbase*consumo;
            desobre=costotal*0.1*-1;
            impuesto=costotal*0.01;
            totalf=(costotal+desobre)+impuesto;
    }
    else
            if (estrato==5 || estrato==6){
                costotal=valorbase*consumo;
                desobre=costotal*0.25;
                impuesto=costotal*0.01;
                totalf=(costotal+desobre)+impuesto;
    } 
     
    System.out.println("El consumo fue: " + consumo);
    System.out.println("Valor unidad: " + valorbase);
    System.out.println("Estrato del inmueble: " + estrato); 
    System.out.println("Costo total: " + costotal);
    System.out.println("Descuento o sobrecosto: " + desobre);
    System.out.println("Impuesto por infraestructura: " + impuesto);
    System.out.println("TOTAL A PAGAR " + totalf);
    
}


}

