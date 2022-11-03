package model;

/**
 *
 * @author Duvan
 */
public class Reserva {
    private String nombreCliente;
    private String producto;
    private double valor;

    public Reserva(String nombreCliente, String producto, double valor) {
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.valor = valor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public double getValor() {
        return valor;
    }
    
    
}
