package restaurante;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class Restaurante {
    private String nombre;
    private ArrayList<Menu> menus;
    private ArrayList<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.menus = new ArrayList<Menu>();
        this.reservas = new ArrayList<Reserva>();
    }
    
    public String listarPlatos (int index){
        String platosMenu = "";
        ArrayList<Plato> m1 = menus.get(index).getPlatos();
        int i = 0;
        for (Plato plato : m1) {
            i += 1;
            platosMenu += i + "."+ plato.getNombre() + " " + plato.getPrecio() + "$\n";
        }
        return platosMenu;
    }
    
    public String listarReservas (){
        String reservaRestaurante = "Listado de Reservas \n";
        int i = 0;
        for (Reserva r : reservas) {
            i += 1;
            reservaRestaurante +="Reserva no: " + i + "\n Nombre del Cliente: "+ r.getNombreCliente()+ "\n " + r.getPlatos() + "\n PecioTotal:" + r.getValor() +"$\n";
        }
        return reservaRestaurante;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Menu getMenu(int index) {
        return menus.get(index);
    }

    public boolean addMenu(Menu e) {
        return menus.add(e);
    }

    public Reserva getReserva(int index) {
        return reservas.get(index);
    }

    public boolean addReserva(Reserva e) {
        return reservas.add(e);
    }
    
    
    
}
