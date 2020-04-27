package productRegister;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<Produto> estoque = new ArrayList();
	private int code=0;
	
	public Menu() {
		int op=1;
		while(op!=0) {
			op=menu();
			switch(op) {
			case 1:
					inserir();
					break;
			case 2:
					verificar();
					break;
			case 3:
					remover();
					break;
			case 4:
					alterar();
					break;
			case 0:
					System.out.println("Adios!");
					return;
			}
		}
	}
	
	public int menu() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---MENU---");
		System.out.println("1.Inserir");
		System.out.println("2.Verificar");
		System.out.println("3.Remover");
		System.out.println("4.Alterar");
		System.out.println("0.Sair");
		int op= teclado.nextInt();
		return op;
	}
	
	public void inserir() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---INSERIR---");
		System.out.println("Descrição:");
		String descricao= teclado.nextLine();
		System.out.println("Quantidade:");
		int quantidade= teclado.nextInt();
		System.out.println("Preço:");
		double preco= teclado.nextDouble();
		
		Produto p = new Produto();
		p.setDescricao(descricao);
		p.setPreco(preco);
		p.setQuantidade(quantidade);
		p.setCodigo(code);
		code++;
		
		estoque.add(p);
	}
	
	public void verificar() {
		System.out.println("---VERIFICAR---");
		for(int i=0; i<estoque.size(); i++) {
			System.out.println(estoque.get(i));
		}
	}
	
	public void remover() {
		Scanner teclado= new Scanner(System.in);
		System.out.println("---REMOVER---");	
		System.out.println("Digite o codigo:");
		int code= teclado.nextInt();
		for(int i=0; i<estoque.size();i++) {
			if(code==estoque.get(i).getCodigo()) {
				estoque.remove(i);
			}
		}
	}
	
	public void alterar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual codigo quer alterar:");
		int code = teclado.nextInt();
		teclado.nextLine();
		
		Produto p= new Produto();
		System.out.println("---ALTERAÇÃO---");
		System.out.println("Descrição");
		String descricao= teclado.nextLine();
		p.setDescricao(descricao);
		System.out.println("Quantidade:");
		int quantidade= teclado.nextInt();
		p.setQuantidade(quantidade);
		System.out.println("Preço:");
		double preco= teclado.nextDouble();
		p.setPreco(preco);
		
		for (int i=0; i<estoque.size();i++) {
			if(code==this.estoque.get(i).getCodigo()) {
				this.estoque.set(i, p);
				return;
			}
		}
		
		System.out.println("Produto não encontrado");
	}
	
	public static void main (String args[]) {
		Menu chamada= new Menu();
	}

}
