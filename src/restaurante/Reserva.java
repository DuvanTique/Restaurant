package restaurante;

/**
 *
 * @author Duvan
 */
public class Reserva {
    private String nombreCliente;
    private String platos;
    private double valor;

    public Reserva(String nombreCliente, String platos, double valor) {
        this.nombreCliente = nombreCliente;
        this.platos = platos;
        this.valor = valor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlatos() {
        return platos;
    }

    public double getValor() {
        return valor;
    }
    
    
}
