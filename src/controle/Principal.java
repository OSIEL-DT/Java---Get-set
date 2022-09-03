package controle;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Digite o produto:");
		double id_produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o ID_produto: "));

		double total = id_produto;

		if (total >= 7) {
			JOptionPane.showMessageDialog(null, "Produto: " + produto + " " + "Total: " + total,
					"Cheio", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Produto: " + produto + " " + "Total: " + total,
					" Estoque Baixo", JOptionPane.ERROR_MESSAGE);
		}		
		

	}

}
