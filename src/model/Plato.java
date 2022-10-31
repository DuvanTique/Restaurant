package model;

/**
 *
 * @author Duvan
 */
public class Plato {
    private String nombre;
    private double precio;
    private int stock;

    public Plato(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    
}
