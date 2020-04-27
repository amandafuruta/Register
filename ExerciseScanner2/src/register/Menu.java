package register;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Produto>listaProduto=new ArrayList(); //LISTA DE PRODUTO
	private ArrayList<Cliente>listaCliente= new ArrayList();//LISTA DE CLIENTE
	private ArrayList<Item>listaItem=new ArrayList();
	private ArrayList<Pedido>listaPedido= new ArrayList(); //LISTA PEDIDO- DATA
	
	int codigoProduto=0;
	int codigoCliente=0;
	int codigoItem=0;
	int codigoPedido=0;
	
	
	public Menu() {
		menu();
	}

	public void menu() {
		System.out.println("---MENU---");
		System.out.println("1.Produto");
		System.out.println("2.Cliente");
		System.out.println("3.Pedido");
		Scanner teclado = new Scanner(System.in);
		int op= teclado.nextInt();
		
		switch(op) {
		case 1: System.out.println("---PRODUTO---");
				System.out.println("1.Inserir");
				System.out.println("2.Consultar");
				System.out.println("3.Alterar");
				System.out.println("4.Remover");
				System.out.println("0.Voltar");
				int opcao=teclado.nextInt();
				
				switch (opcao) {
				case 1:
					inserirProduto();
					menu();
					break;
				case 2: 
					consultarProduto();
					menu();
					break;
				case 3: 
					alterarProduto();
					menu();
					break;
				case 4:
					removerProduto();
					menu();
					break;
				case 0:
					menu();
					break;
				}
		break;
		case 2: System.out.println("---CLIENTE---");
				System.out.println("1.Inserir");
				System.out.println("2.Consultar");
				System.out.println("3.Alterar");
				System.out.println("4.Remover");
				System.out.println("0.Voltar");
				int opcao2=teclado.nextInt();
				switch(opcao2) {
				case 1:
					inserirCliente();
					menu();
					break;
				case 2: 
					consultarCliente();
					menu();
					break;
				case 3: 
					alterarCliente();
					menu();
					break;
				case 4:
					removerCliente();
					menu();
					break;
				case 0:
					menu();
					break;
				}
		break;
		case 3:System.out.println("---PEDIDO---");
				System.out.println("1.Fazer Pedido");
				System.out.println("2.Ver Pedido");
				int op3= teclado.nextInt();
				switch(op3) {
				case 1:
					fazerPedido();
					menu();
					break;
				case 2:
					verPedido();
					menu();
					break;
				}
		break;
		}
	}

	public void inserirProduto() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---INSERIR---");
		System.out.println("Descrição: ");
		String descricao= teclado.nextLine();
		System.out.println("Preço unidade:");
		double preco= teclado.nextDouble();
		
		Produto produto= new Produto();
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		produto.setCodigo(this.codigoProduto);
		this.codigoProduto++;
		
		listaProduto.add(produto);
	}
	public void consultarProduto() {
		System.out.println("---CONSULTAR---");
		for (int i=0; i<listaProduto.size(); i++) {
			System.out.println(listaProduto.get(i));
		}
	}
	public void alterarProduto() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---ALTERAR---");
		System.out.println("Digite o codigo");
		int codigoProduto=teclado.nextInt();
		teclado.nextLine();
		
		Produto produto= new Produto();
		System.out.println("Descrição:");
		String descricao= teclado.nextLine();
		produto.setDescricao(descricao);
		System.out.println("Preço:R$");
		double preco= teclado.nextDouble();
		produto.setPreco(preco);
		produto.setCodigo(codigoProduto);
		
		for(int i=0; i<listaProduto.size();i++) {
			if(codigoProduto==listaProduto.get(i).getCodigo()) {
				listaProduto.set(i, produto);
			}
		}
		System.out.println("Produto não encontrado");	
	}
	public void removerProduto() {
		Scanner teclado= new Scanner (System.in);
		System.out.println("---REMOVER---");
		System.out.println("Digite o código:");
		int codigoProduto= teclado.nextInt();
		for(int i=0; i<listaProduto.size();i++) {
			if(codigoProduto==listaProduto.get(i).getCodigo()) {
				listaProduto.remove(i);
			}
		}
	}
	
	public static void main(String args[]) {
		Menu teste= new Menu();
	}
	
	public void inserirCliente() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---CLIENTE---");
		System.out.println("Nome: ");
		String nome= teclado.nextLine();
		
		Cliente cliente= new Cliente();
		cliente.setNome(nome);
		cliente.setCodigo(codigoCliente);
		codigoCliente++;
		
		listaCliente.add(cliente);	
	}
	public void consultarCliente() {
		System.out.println("---CONSULTAR CLIENTE---");
		for(int i=0; i<listaCliente.size();i++) {
			System.out.println(listaCliente.get(i));
		}
	}
	public void alterarCliente() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---ALTERAR DADOS DO CLIENTE---");
		System.out.println("Digite o codigo");
		int codigoCliente= teclado.nextInt();
		teclado.nextLine();
		
		Cliente cliente = new Cliente();
		System.out.println("Nome:");
		String nome=teclado.nextLine();
		cliente.setNome(nome);
		cliente.setCodigo(codigoCliente);
		
		for(int i= 0; i<listaCliente.size();i++) {
			if(codigoCliente==listaCliente.get(i).getCodigo()) {
				listaCliente.set(i, cliente);
			}
		}
	}
	public void removerCliente() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---REMOVER CLIENTE---");
		System.out.println("Digite o codigo");
		int codigoCliente= teclado.nextInt();
		for(int i=0; i<listaCliente.size();i++) {
			if(codigoCliente==listaCliente.get(i).getCodigo()) {
				listaCliente.remove(i);
			}
		}
	}
	public void fazerPedido() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---ESCOLHER CLIENTE---");
		System.out.println("Data:");
		String dia= teclado.nextLine();
		System.out.println("Digite o codigo do cliente");
		int codigo= teclado.nextInt();
		
		
		for(int i=0; i<listaCliente.size();i++) {
			if(codigo==listaCliente.get(i).getCodigo()) {
				System.out.println(listaCliente.get(i));
			}
		}
		
		
		System.out.println("---INSERIR ITEM---");
		System.out.println("Digite o Codigo do produto:");
		int codigoP= teclado.nextInt();
		for(int i=0; i<listaProduto.size(); i++) {
			if(codigoP==listaProduto.get(i).getCodigo()) {
				System.out.println(listaProduto.get(i));
			}
		}
		System.out.println("Quantidade:");
		int qnt= teclado.nextInt();
		
		Item item = new Item();
		item.setQuantidade(qnt);
		item.setProduto(listaProduto.get(codigo));
		
		Pedido p = new Pedido();
		p.setCode(codigoPedido);
		p.setC(listaCliente.get(codigo));
		p.setData(dia);
		p.setItem(item);
		codigoPedido++;
		
		listaPedido.add(p);
		
	}
	
	public void verPedido() {
		System.out.println("---LISTA DE PEDIDOS---");
		for(int i=0; i<listaPedido.size();i++) {
			System.out.println(listaPedido.get(i));
		}
		if (listaPedido == null) {
			System.out.println("It's empty");
		}
		
	}


}
