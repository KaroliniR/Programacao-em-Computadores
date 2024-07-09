import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacaoPoupanca1 extends JFrame {
    private JTextField txtValor;
    private JTextField txtJuros;
    private JTextField txtTempo;
    private JTextField txtResultado;
    private JButton btnCalcular;

    public AplicacaoPoupanca1() {
        setTitle("Calculadora de Poupança");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel lblValor = new JLabel("Valor Inicial:");
        txtValor = new JTextField();

        JLabel lblJuros = new JLabel("Taxa de Juros (%):");
        txtJuros = new JTextField();

        JLabel lblTempo = new JLabel("Período (anos):");
        txtTempo = new JTextField();

        JLabel lblResultado = new JLabel("Valor Futuro:");
        txtResultado = new JTextField();
        txtResultado.setEditable(false);

        btnCalcular = new JButton("Calcular");

        add(lblValor);
        add(txtValor);
        add(lblJuros);
        add(txtJuros);
        add(lblTempo);
        add(txtTempo);
        add(btnCalcular);
        add(new JLabel());
        add(lblResultado);
        add(txtResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {
        try {
            double valorInicial = Double.parseDouble(txtValor.getText());
            double taxaJuros = Double.parseDouble(txtJuros.getText()) / 100;
            int anos = Integer.parseInt(txtTempo.getText());
            double valorFuturo = valorInicial * Math.pow((1 + taxaJuros), anos);
            txtResultado.setText(String.format("%.2f", valorFuturo));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AplicacaoPoupanca().setVisible(true);
            }
        });
    }
}
