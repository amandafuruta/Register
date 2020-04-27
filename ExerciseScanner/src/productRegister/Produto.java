package productRegister;

public class Produto {
	private String descricao;
	private int quantidade;
	private double preco;
	private int codigo;
	
	
	public Produto() {
		
	}
	public Produto(String descricao, int quantidade, double preco, int codigo) {
		
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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
		return "Produto [descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + ", codigo="
				+ codigo + "]";
	}

}
