package interfaz;

import juego.Dados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazDados {

    private Dados dados;
    private boolean[] seleccionados;

    public InterfazDados(Dados dados) {
        this.dados = dados;
        this.seleccionados = new boolean[5]; // Inicialmente ningún dado seleccionado

        JFrame frame = new JFrame("G E N E R A L A - Dados");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel labelResultados = new JLabel("Resultados de los Dados:");
        panel.add(labelResultados);

        JTextArea textAreaResultados = new JTextArea(5, 20);
        panel.add(new JScrollPane(textAreaResultados));

        JCheckBox[] checkboxesDados = new JCheckBox[5];
        for (int i = 0; i < 5; i++) {
            checkboxesDados[i] = new JCheckBox("Dado " + (i + 1));
            final int index = i;
            checkboxesDados[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seleccionados[index] = !seleccionados[index];
                }
            });
            panel.add(checkboxesDados[i]);
        }

        JButton buttonLanzarDados = new JButton("Lanzar Dados");
        panel.add(buttonLanzarDados);

        JButton buttonFinalizarTurno = new JButton("Finalizar Turno");
        panel.add(buttonFinalizarTurno);

        buttonLanzarDados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dados.tirarSeleccionados(seleccionados);

                int[] valores = dados.getValores();
                StringBuilder resultados = new StringBuilder("Valores de los Dados:\n");

                for (int valor : valores) {
                    resultados.append(valor).append("\n");
                }

                textAreaResultados.setText(resultados.toString());
            }
        });

        buttonFinalizarTurno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí podrías agregar lógica para finalizar el turno
                // Puedes llamar a métodos en las clases del juego correspondientes
            }
        });

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void mostrarInterfaz() {

    }

    public boolean[] getSeleccionados() {
        return seleccionados;
    }
}
