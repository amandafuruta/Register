package register;

public class Item {
	
	Produto produto;
	private int quantidade;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double subTotal() {
		return produto.getPreco()*getQuantidade();
	}
	@Override
	public String toString() {
		return  produto + "| quantidade= " + quantidade+ "| Subtotal= R$ "+ subTotal() ;
	}

}
