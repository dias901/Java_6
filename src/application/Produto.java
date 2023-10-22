package application;

public class Produto {

	private String nome;
	private Double pre�o;
	private Integer quant;
	
	public Produto() {
		
	}
	
	public Produto(String nome, Double pre�o, Integer quant) {
		this.nome = nome;
		this.pre�o = pre�o;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public Double total() {
		pre�o*=quant;
		return pre�o;
	}
	
	
}
