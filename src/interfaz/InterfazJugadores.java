package interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazJugadores {

    private String[] nombresJugadores;
    private int cantidadJugadores;

    public InterfazJugadores() {
        obtenerCantidadJugadores();
        obtenerNombresJugadores();

        // Mostrar los nombres de los jugadores (puedes modificar esto según tus necesidades)
        JOptionPane.showMessageDialog(null, "Jugadores: " + String.join(", ", nombresJugadores));
    }

    private void obtenerCantidadJugadores() {
        JFrame frame = new JFrame("J U G A D O R E S");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel labelCantidadJugadores = new JLabel("Ingrese la cantidad de jugadores:");
        panel.add(labelCantidadJugadores);

        JTextField textFieldCantidadJugadores = new JTextField(10);
        panel.add(textFieldCantidadJugadores);

        JButton buttonAceptar = new JButton("Aceptar");
        panel.add(buttonAceptar);

        buttonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadJugadores = Integer.parseInt(textFieldCantidadJugadores.getText());
                nombresJugadores = new String[cantidadJugadores];
                frame.dispose();  // Cerrar la ventana después de recoger la cantidad
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void obtenerNombresJugadores() {
        for (int i = 0; i < cantidadJugadores; i++) {
            nombresJugadores[i] = JOptionPane.showInputDialog("Nombre del Jugador " + (i + 1));
        }
    }

    public String[] getNombresJugadores() {
        return nombresJugadores;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }
}
