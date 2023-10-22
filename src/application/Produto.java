package application;

public class Produto {

	private String nome;
	private Double preço;
	private Integer quant;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double preço, Integer quant) {
		this.nome = nome;
		this.preço = preço;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public Double total() {
		preço*=quant;
		return preço;
	}
	
	
}
