package register;

public class Pedido {
	Cliente c;
	Item item;
	private String data;
	private int code;
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido(Cliente c, Item item, String data, int code) {
		super();
		this.c = c;
		this.item = item;
		this.data = data;
		this.code = code;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Pedido#"+code +   c + "|" + item + "| data=" + data ;
	}	

}
