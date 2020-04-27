package register;

public class Produto {

	private String descricao;
	private double preco;
	private int codigo;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(String descricao, double preco, int codigo) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.codigo=codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Produto descrição= " + descricao + " | preço=R$ " + preco + " | codigoProduto= " + codigo ;
	}
}
