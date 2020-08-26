package lanchonete;

public class Bolo extends Lanche {
	private String massa;
	private String recheio;
	private String cobertura;
	private int tempoPreparo = 10;
	
	public Bolo(double preco) {
		super.setPreco(preco);
	}
	
	public String getMassa() {
		return massa;
	}

	public String getRecheio() {
		return recheio;
	}
	
	public String getCobertura() {
		return cobertura;
	}
	
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	@Override
	public int calcularTempo(int distancia) {
		return super.calcularTempo(distancia) + this.tempoPreparo;
	}

}
