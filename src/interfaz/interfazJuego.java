package interfaz;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfazJuego {

    public interfazJuego() {
        JFrame frame = new JFrame("Juego de la Generala");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel labelCantidadJugadores = new JLabel("Cantidad de jugadores:");
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
                        JOptionPane.showMessageDialog(null, "La cantidad de jugadores debe estar entre 2 y 5.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String[] jugadores = new String[cantidadJugadores];

                        for (int i = 0; i < cantidadJugadores; i++) {
                            String nombre = JOptionPane.showInputDialog("Nombre del Jugador " + (i + 1));
                            jugadores[i] = nombre;
                        }

                        String mensaje = "Jugadores creados:\n";
                        for (String jugador : jugadores) {
                            mensaje += jugador + "\n";
                        }

                        JOptionPane.showMessageDialog(null, mensaje, "Jugadores Creados", JOptionPane.INFORMATION_MESSAGE);
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
