package app;
public class Descuento {
    public Descuento() {
        super();
    }
    private boolean a = false; //regla de negocio 1 - más de $5000
    private boolean b = false; //regla de negocio 2 - más de $10000
    private boolean c = false; //regla de negocio 3 - si paga con tarjeta
    public float getDescuento(Float montoCompra) { 

      this.a = false;
      if(montoCompra.intValue() >= 5000) this.a = true;
      this.b = false;
      if(montoCompra.intValue() >= 10000) this.b = true;     
      
      Float montoConDescuento = montoCompra; 
      
        //Para fila 5: S1 = a.~b.~c 
          if(a==true && b==false && c==false) { 
            return montoConDescuento - (montoConDescuento * (float)0.03);
          }

          //Para fila 7: S2 = a.b.~c 
          if(a==true && b==true && c==false)    { 
            return montoConDescuento - (montoConDescuento * (float)0.05);  
          } 

          //Para el resto de las filas no descuento 
          return montoConDescuento;  
    }

    public void setTarjeta(boolean tarjeta) {
        this.c = tarjeta;
    }
}
