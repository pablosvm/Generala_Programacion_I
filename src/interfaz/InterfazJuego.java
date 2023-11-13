package interfaz;

import juego.Dados;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazJuego {

    private InterfazJugadores interfazJugadores;
    private InterfazDados interfazDados;

    public InterfazJuego() {
        JFrame frame = new JFrame("G E N E R A L A");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel labelCantidadJugadores = new JLabel("Cuantos van a Jugar:");
        panel.add(labelCantidadJugadores);

        JTextField textFieldCantidadJugadores = new JTextField(10);
        panel.add(textFieldCantidadJugadores);

        JButton buttonCrearJugadores = new JButton("Crear Jugadores");
        panel.add(buttonCrearJugadores);

        buttonCrearJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int cantidadJugadores = Integer.parseInt(textFieldCantidadJugadores.getText());
                    if (cantidadJugadores < 2 || cantidadJugadores > 5) {
                        JOptionPane.showMessageDialog(null, "La cantidad de jugadores debe ser entre 2 y 5.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {

                        interfazJugadores = new InterfazJugadores();

                        interfazDados = new InterfazDados(new Dados());

                        // Agregar lógica de tablero

                        frame.dispose();// Cierra la ventana actual
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un número entre 2 y 5 jugadores.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
