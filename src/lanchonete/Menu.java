package lanchonete;

import java.util.Scanner;

public class Menu {
	
	static Scanner teclado = new Scanner(System.in);
	
	public void pedirMenu() {
		System.out.println("Digite a opcão desejada: ");
		System.out.println("[1] Sanduiche, [2] Massa, [3] Bolo");
		int opcaoMenu = teclado.nextInt();
		
		if(opcaoMenu == 1) {
			menuSanduiche();
		}else if(opcaoMenu == 2) {
			System.out.println("Digite a opcao desejada: ");
			System.out.println("[1] Macarrão,[2] Pizza ,[3] Lasanha");
			int opcaoMassa = teclado.nextInt();
			menuMassa(opcaoMassa);
		}else if(opcaoMenu == 3) {
			menuBolo();;
		}
	}
	
	public void menuSanduiche() {
		Sanduiche sanduiche = new Sanduiche(10);
		String ingredientes[] = new String[10];
		String ingrediente = teclado.nextLine();
		int i = 0;
		
		System.out.println("Você escolheu nosso Super Sanduíche");
		System.out.println("Agora você pode escolher 10 ingredientes. Digite 0 para finalizar sua escolha");
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		sanduiche.setIngredientes(ingredientes);
		
		fecharPedido(sanduiche);
	}
	
	public void menuBolo() {
		Bolo bolo = new Bolo(17);
		teclado.nextLine();
		
		System.out.println("Selecione a massa: ");
		String massa = teclado.nextLine();
		System.out.println("Selecione o recheio: ");
		String recheio = teclado.nextLine();
		System.out.println("Selecione a cobertura");
		String cobertura = teclado.nextLine();
		
		bolo.setMassa(massa);
		bolo.setRecheio(recheio);
		bolo.setCobertura(cobertura);
		
		fecharPedido(bolo);
		
		}
	
	public void menuMassa(int opcaoMassa) {
		
		Massa massa = new Massa(35);
		String molho = teclado.nextLine();
		
		if(opcaoMassa == 1) {
			massa.setMassa("Macarrão");
			System.out.println("Selecione o molho");
			molho = teclado.nextLine();
		}else if(opcaoMassa == 2) {
			massa.setMassa("Pizza");
			System.out.println("Selecione o molho");
			molho = teclado.nextLine();
		}else if(opcaoMassa == 3) {
			massa.setMassa("Lasanha");
			System.out.println("Selecione o molho");
			molho = teclado.nextLine();
		}
		
		massa.setMolho(molho);
		fecharPedido(massa);
		
	}
	
	public void fecharPedido(Lanche lanche) {
		
		System.out.println("Informe sua distancia: ");
		int distancia = teclado.nextInt();
		System.out.println("Obrigado pelo seu pedido.");
		System.out.println("Ele será entregue em " + lanche.calcularTempo(distancia) + " minutos.");
		System.out.println("O valor total do pedido é R$" + lanche.getPreco());
	}

}
