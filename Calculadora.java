package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

	JFrame janela; // Criando Janela
	JPanel painel; // Criando Painel
	JTextField campo1;
	JTextField campo2;
	JLabel labelResultado; // Criando a etiqueta ou o resultado
	JButton botaoSomar;
	JButton botaoSubtrair;
	JButton botaoMultiplicar;
	JButton botaoDividir;

	public Calculadora() { // Iniciar os Componentes

		inicializarComponentes();
	}

	private void inicializarComponentes() { // Método(ação)

		janela = new JFrame("Calculadora"); // "()" parâmetro é passar umas instrução
		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Atributos dos objetos
		janela.setLayout(new FlowLayout()); // expansão de tela, alinha e centraliza. JAVA AWT É O ANTECESSOR DO JAVA
											// SWING

		painel = new JPanel();
		painel.setLayout(new FlowLayout());

		campo1 = new JTextField(10);
		campo2 = new JTextField(10);
		labelResultado = new JLabel("Resultado");

		botaoSomar = new JButton("+");
		botaoSomar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(campo1.getText());
				int valor2 = Integer.parseInt(campo2.getText());
				int resultado = valor1 + valor2;
				labelResultado.setText("Resultado: " + resultado);
			}
		});

		botaoSubtrair = new JButton("-");
		botaoSubtrair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(campo1.getText());
				int valor2 = Integer.parseInt(campo2.getText());
				int resultado = valor1 - valor2;
				labelResultado.setText("Resultado: " + resultado);
			}
		});

		botaoMultiplicar = new JButton("*");
		botaoMultiplicar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(campo1.getText());
				int valor2 = Integer.parseInt(campo2.getText());
				int resultado = valor1 * valor2;
				labelResultado.setText("Resultado: " + resultado);
			}
		});

		botaoDividir = new JButton("/");
		botaoDividir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int valor1 = Integer.parseInt(campo1.getText());
				int valor2 = Integer.parseInt(campo2.getText());
				double resultado = valor1 / valor2;
				labelResultado.setText("Resultado: " + resultado);
			}
		});

		painel.add(botaoSomar);
		painel.add(botaoSubtrair);
		painel.add(botaoMultiplicar);
		painel.add(botaoDividir);
		painel.add(campo1);
		painel.add(campo2);
		painel.add(labelResultado);

		janela.add(painel);

		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new Calculadora();
	}
}