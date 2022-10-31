package viewModel;

import model.Plato;
import model.Menu;
import model.Menu;
import model.Plato;
import model.Restaurante;
import view.MenuPrincipal;

/**
 *
 * @author Duvan
 */
public class Main {

    public static void main(String[] args) {
        Restaurante pollosHermanos = new Restaurante("Pollos hermanos");
        
        /* Creo los menus */
        Menu familiar = new Menu("Familiar");
        Menu platosCarta = new Menu("Platos a la carta");
        Menu bebidas = new Menu("Bebidas");
        
        /*Creo los platos */
        Plato polloAsado = new Plato("Pollo asado", 25000, 20);
        Plato polloFrito = new Plato("Pollo frito", 26000, 20);
        Plato polloBroaster = new Plato("Pollo broaster", 28000, 20);
        
        Plato arrozPollo = new Plato("Arroz con pollo", 10000, 30);
        Plato mojara = new Plato("Mojarra", 12000, 15);
        Plato sopa = new Plato("sopa", 6000, 10);
        
        Plato limonada = new Plato("Limonada", 2500, 40);
        Plato gaseosa = new Plato("Gaseosa", 5500, 30);
        Plato agua = new Plato("agua", 1200, 40);
        
        /*Lleno los menus*/
        familiar.addPlato(polloAsado);
        familiar.addPlato(polloFrito);
        familiar.addPlato(polloBroaster);
        
        platosCarta.addPlato(arrozPollo);
        platosCarta.addPlato(mojara);
        platosCarta.addPlato(sopa);
        
        bebidas.addPlato(limonada);
        bebidas.addPlato(gaseosa);
        bebidas.addPlato(agua);
        
        /*Asigno los menus al restaurante*/
        pollosHermanos.addMenu(familiar);
        pollosHermanos.addMenu(platosCarta);
        pollosHermanos.addMenu(bebidas);
        
        MenuPrincipal m1 = new MenuPrincipal();
        m1.setVisible(true);
        m1.setLocationRelativeTo(null);
        
        Controlador c = new Controlador(m1, pollosHermanos);  
    }
    
}
