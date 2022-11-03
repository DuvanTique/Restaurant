package model;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class TipoProducto {
    private String tipoProducto;
    private ArrayList<Productos> producto;

    public TipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
        this.Productos = new ArrayList<Productos>();
    }

    public ArrayList<Productos> getProductos() {
        return Productos;
    }
    
    public boolean addPlato(Productos e) {
        return Productos.add(e);
    }

    public Plato getProductos(int index) {
        return Productos.get(index);
    }

    public String getTipoProducto() {
        return tipoProducto;
    }
    
    
}
