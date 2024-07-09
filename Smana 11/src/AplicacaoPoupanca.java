import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacaoPoupanca extends JFrame {
    private JTextField txtValor;
    private JTextField txtJuros;
    private JTextField txtTempo;
    private JTextField txtResultado;
    private JButton btnCalcular;

    public AplicacaoPoupanca() {
        setTitle("Calculadora de Poupança");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblValor = new JLabel("Valor Inicial:");
        lblValor.setBounds(10, 10, 100, 25);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(120, 10, 100, 25);
        add(txtValor);

        JLabel lblJuros = new JLabel("Taxa de Juros (%):");
        lblJuros.setBounds(10, 40, 100, 25);
        add(lblJuros);

        txtJuros = new JTextField();
        txtJuros.setBounds(120, 40, 100, 25);
        add(txtJuros);

        JLabel lblTempo = new JLabel("Período (anos):");
        lblTempo.setBounds(10, 70, 100, 25);
        add(lblTempo);

        txtTempo = new JTextField();
        txtTempo.setBounds(120, 70, 100, 25);
        add(txtTempo);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 100, 100, 25);
        add(btnCalcular);

        JLabel lblResultado = new JLabel("Valor Futuro:");
        lblResultado.setBounds(10, 130, 100, 25);
        add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(120, 130, 100, 25);
        txtResultado.setEditable(false);
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
