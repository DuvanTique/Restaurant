package model;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class Menu {
    private String nombreMenu;
    private ArrayList<Plato> platos;

    public Menu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
        this.platos = new ArrayList<Plato>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }
    
    public boolean addPlato(Plato e) {
        return platos.add(e);
    }

    public Plato getPlato(int index) {
        return platos.get(index);
    }

    public String getNombreMenu() {
        return nombreMenu;
    }
    
    
}
