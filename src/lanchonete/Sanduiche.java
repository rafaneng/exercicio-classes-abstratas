package lanchonete;

public class Sanduiche extends Lanche {
	private String ingredientes[] = new String[10];
	private int tempoPreparo = 15;
	
	public Sanduiche(double preco) {
		super.setPreco(preco);
	}
	
	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public int calcularTempo(int distancia) {
		return super.calcularTempo(distancia) + this.tempoPreparo;
	}

}
