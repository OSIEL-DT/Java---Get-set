package controle;

import javax.swing.JOptionPane;

public class Principal1 {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Digite o Produto:");
		double k = Double.parseDouble(JOptionPane.showInputDialog("Digite o Id do produto:"));

		Estoque a1 = new Estoque(x, k);

		if (a1.resultadoTotal()) {
			JOptionPane.showMessageDialog(null,
					"Produto: " + a1.getProduto() + "Total: " + a1.getTotal(), "Verde",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,
					"Produto: " + a1.getProduto() + "Total: " + a1.getTotal(), "Vermelho",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
