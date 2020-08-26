package lanchonete;

public class Massa extends Lanche {
	private String molho;
	private String massa;
	private int tempoPreparo = 30;
	
	public Massa(double preco) {
		super.setPreco(preco);
	}
	
	
	public String getMolho() {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	@Override
	public int calcularTempo(int distancia) {
		return super.calcularTempo(distancia) + this.tempoPreparo;
	}

}
