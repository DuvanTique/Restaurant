package Igu;

import restaurante.Plato;
import restaurante.Reserva;
import restaurante.Restaurante;

/**
 *
 * @author Duvan
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private Restaurante restaurant;
    private int actualMenu = -1;
    private String platos = "";
    private double precio;

    public MenuPrincipal(Restaurante res) {
        this.restaurant = res;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMenu = new javax.swing.JTextArea();
        ButtonFamiliar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonCarta = new javax.swing.JButton();
        ButtonBebidas = new javax.swing.JButton();
        TextFieldDisk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldAmout = new javax.swing.JTextField();
        ButtonAddDisk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaReserva = new javax.swing.JTextArea();
        ButtonReserve = new javax.swing.JButton();
        TextFieldPrice = new javax.swing.JTextField();
        ButtonShowReserve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menu de reservas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        TextAreaMenu.setEditable(false);
        TextAreaMenu.setBackground(new java.awt.Color(204, 204, 204));
        TextAreaMenu.setColumns(20);
        TextAreaMenu.setRows(5);
        jScrollPane1.setViewportView(TextAreaMenu);

        ButtonFamiliar.setBackground(new java.awt.Color(51, 102, 255));
        ButtonFamiliar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonFamiliar.setText("Familiar");
        ButtonFamiliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonFamiliarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Menus");

        ButtonCarta.setBackground(new java.awt.Color(51, 102, 255));
        ButtonCarta.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCarta.setText("Platos a la carta");
        ButtonCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCartaMouseClicked(evt);
            }
        });

        ButtonBebidas.setBackground(new java.awt.Color(51, 102, 255));
        ButtonBebidas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBebidas.setText("Bebidas");
        ButtonBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBebidasMouseClicked(evt);
            }
        });

        TextFieldDisk.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldDisk.setText("#");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Escoja un plato");

        TextFieldAmout.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldAmout.setText("#");

        ButtonAddDisk.setBackground(new java.awt.Color(51, 102, 255));
        ButtonAddDisk.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddDisk.setText("Añadir");
        ButtonAddDisk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAddDiskMouseClicked(evt);
            }
        });

        TextAreaReserva.setEditable(false);
        TextAreaReserva.setBackground(new java.awt.Color(204, 204, 204));
        TextAreaReserva.setColumns(20);
        TextAreaReserva.setLineWrap(true);
        TextAreaReserva.setRows(5);
        jScrollPane2.setViewportView(TextAreaReserva);

        ButtonReserve.setBackground(new java.awt.Color(51, 102, 255));
        ButtonReserve.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReserve.setText("Reservar");
        ButtonReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonReserveMouseClicked(evt);
            }
        });

        TextFieldPrice.setBackground(new java.awt.Color(204, 255, 255));
        TextFieldPrice.setText("Total");

        ButtonShowReserve.setBackground(new java.awt.Color(51, 102, 255));
        ButtonShowReserve.setForeground(new java.awt.Color(255, 255, 255));
        ButtonShowReserve.setText("Ver Reservas");
        ButtonShowReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonShowReserveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldPrice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButtonCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(TextFieldDisk, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(TextFieldAmout))
                            .addComponent(ButtonFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonAddDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonShowReserve, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(ButtonFamiliar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonCarta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonBebidas)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldDisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldAmout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAddDisk)
                            .addComponent(ButtonShowReserve))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonReserve)
                            .addComponent(TextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonFamiliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFamiliarMouseClicked
        actualMenu = 0;
        TextAreaMenu.setText(restaurant.getMenu(0).getNombreMenu() + "\n " + restaurant.listarPlatos(actualMenu));
    }//GEN-LAST:event_ButtonFamiliarMouseClicked

    private void ButtonCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCartaMouseClicked
        actualMenu = 1;
        TextAreaMenu.setText(restaurant.getMenu(1).getNombreMenu()+"\n " + restaurant.listarPlatos(actualMenu));
    }//GEN-LAST:event_ButtonCartaMouseClicked

    private void ButtonBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBebidasMouseClicked
        actualMenu = 2;
        TextAreaMenu.setText(restaurant.getMenu(2).getNombreMenu()+"\n " + restaurant.listarPlatos(actualMenu));
    }//GEN-LAST:event_ButtonBebidasMouseClicked

    private void ButtonAddDiskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAddDiskMouseClicked
        try{
        Plato p = restaurant.getMenu(actualMenu).getPlato(Integer.parseInt(TextFieldDisk.getText())-1);
        platos += "   -" + p.getNombre() +" Cantidad: "+TextFieldAmout.getText() + "\n";
        precio += p.getPrecio()*Integer.parseInt(TextFieldAmout.getText());
        TextAreaReserva.setText(platos);
        TextFieldPrice.setText(String.valueOf(precio) +"$");
        TextFieldDisk.setText("");
        TextFieldAmout.setText("");
        }
        catch (Exception ex) {
            TextAreaReserva.setText("Valores incorrectos");
        }
    }//GEN-LAST:event_ButtonAddDiskMouseClicked

    private void ButtonReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonReserveMouseClicked
        Reserva r = new Reserva("Juan",platos, precio);
        restaurant.addReserva(r);
        TextAreaReserva.setText("");
        platos = "";
        precio = 0;
        TextFieldPrice.setText("");
    }//GEN-LAST:event_ButtonReserveMouseClicked

    private void ButtonShowReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonShowReserveMouseClicked
        TextAreaMenu.setText(restaurant.listarReservas());
    }//GEN-LAST:event_ButtonShowReserveMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddDisk;
    private javax.swing.JButton ButtonBebidas;
    private javax.swing.JButton ButtonCarta;
    private javax.swing.JButton ButtonFamiliar;
    private javax.swing.JButton ButtonReserve;
    private javax.swing.JButton ButtonShowReserve;
    private javax.swing.JTextArea TextAreaMenu;
    private javax.swing.JTextArea TextAreaReserva;
    private javax.swing.JTextField TextFieldAmout;
    private javax.swing.JTextField TextFieldDisk;
    private javax.swing.JTextField TextFieldPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
