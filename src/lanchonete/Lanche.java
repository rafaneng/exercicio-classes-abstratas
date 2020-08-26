package lanchonete;

public abstract class Lanche {
	private double preco;
	private int tempoPorKmEntrega = 10;
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int calcularTempo(int distancia) {
		return distancia * this.tempoPorKmEntrega;
	}
}
