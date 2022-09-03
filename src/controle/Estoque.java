package controle;

public class Estoque {

	private String produto;
	private int id_produto;
	private int total;

	public boolean resultadoTotal() {
		if (total <= 10) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * ==================================== GET/SET INICIO	 * =================================
	 */
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public double getTotal() {
		return total;
	}

	public void setSaldo(int total) {
		this.total = total;
	}

	/*
	 * =================================================== GST/SRT FIM	 * ===============================================
	 */
	@Override
	public String toString() {
		return "Estoque [produto=" + produto + ", id_produto=" + id_produto + ", total=" + total + "]";
	}

	public Estoque(String produto, double id_produto) {
		super();
		this.produto = produto;
		this.id_produto = (int) id_produto;
	}
}