package app;
public class Venta {
    public Venta() {
        super();
    }
    private static Descuento descuento = new Descuento();
    public static void main(String[] args) {
        Venta sistema = new Venta();
        //Obtener el monto de la compra
        Float montoCompra = new Float(60000f);
        //Pedir por teclado si paga con tarjeta
        boolean tarjeta = false;
        descuento.setTarjeta(tarjeta);
        Float montoCondescuento = descuento.getDescuento(montoCompra);
        System.out.println("Monto de la compra = " + montoCompra);
        System.out.println(" Paga con tarjeta = " + tarjeta);
        System.out.println("  Monto a pagar con descuento " + montoCondescuento);
    }
}
