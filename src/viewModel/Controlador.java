package viewModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Plato;
import model.Reserva;
import model.Restaurante;
import view.MenuPrincipal;

/**
 *
 * @author Familia
 */
public class Controlador implements ActionListener {
    
    private MenuPrincipal vistaMenu;
    private Restaurante restaurante;
    private int actualMenu = -1;
    private String platos = "";
    private double precio;

    public Controlador(MenuPrincipal vistaMenu, Restaurante restaurante) {
        this.vistaMenu = vistaMenu;
        this.restaurante = restaurante;
        this.agregarListeners();
    }
    
    private void agregarListeners(){
        this.vistaMenu.ButtonAddDisk.addActionListener(this);
        this.vistaMenu.ButtonBebidas.addActionListener(this);
        this.vistaMenu.ButtonCarta.addActionListener(this);
        this.vistaMenu.ButtonFamiliar.addActionListener(this);
        this.vistaMenu.ButtonReserve.addActionListener(this);
        this.vistaMenu.ButtonShowReserve.addActionListener(this);
        this.vistaMenu.TextFieldAmout.addActionListener(this);
        this.vistaMenu.TextFieldDisk.addActionListener(this);
        this.vistaMenu.TextFieldPrice.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getSource() == vistaMenu.ButtonFamiliar){
            actualMenu = 0;
            vistaMenu.TextAreaMenu.setText(restaurante.getMenu(0).getNombreMenu() + "\n " + restaurante.listarPlatos(actualMenu));            
        }
        else if(e1.getSource() == vistaMenu.ButtonCarta){
            actualMenu = 1;
            vistaMenu.TextAreaMenu.setText(restaurante.getMenu(1).getNombreMenu()+"\n " + restaurante.listarPlatos(actualMenu));
        }
        else if(e1.getSource() == vistaMenu.ButtonBebidas){
            actualMenu = 2;
            vistaMenu.TextAreaMenu.setText(restaurante.getMenu(2).getNombreMenu()+"\n " + restaurante.listarPlatos(actualMenu));
        }
        else if(e1.getSource() == vistaMenu.ButtonAddDisk){
            try{
                Plato p = restaurante.getMenu(actualMenu).getPlato(Integer.parseInt(vistaMenu.TextFieldDisk.getText())-1);
                platos += "   -" + p.getNombre() +" Cantidad: "+vistaMenu.TextFieldAmout.getText() + "\n";
                precio += p.getPrecio()*Integer.parseInt(vistaMenu.TextFieldAmout.getText());
                vistaMenu.TextAreaReserva.setText(platos);
                vistaMenu.TextFieldPrice.setText(String.valueOf(precio) +"$");
                vistaMenu.TextFieldDisk.setText("");
                vistaMenu.TextFieldAmout.setText("");
                }
            catch (Exception ex) {
                vistaMenu.TextAreaReserva.setText("Valores incorrectos");
            }        
        }
        else if(e1.getSource() == vistaMenu.ButtonReserve){
            Reserva r = new Reserva("Juan",platos, precio);
            restaurante.addReserva(r);
            vistaMenu.TextAreaReserva.setText("");
            platos = "";
            precio = 0;
            vistaMenu.TextFieldPrice.setText("");        
        }
        else if(e1.getSource() == vistaMenu.ButtonShowReserve){
            vistaMenu.TextAreaMenu.setText(restaurante.listarReservas());
        }
    }

    
}
