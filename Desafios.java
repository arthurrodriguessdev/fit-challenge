package FitChallenge;

public class Desafios {

	private String nomeDesafio, metaDiaria, descricaoDesafio;
	private Integer diasDesafio;
	
	public Desafios(String nomeDesafio, String metaDiaria, String descricaoDesafio, Integer diasDesafio) {
		this.nomeDesafio = nomeDesafio;
		this.metaDiaria= metaDiaria;
		this.descricaoDesafio = descricaoDesafio;
		this.diasDesafio = diasDesafio;
		
	}
	public String getNomeDesafio() {
		return nomeDesafio;
	}
	
	public String getMetaDiaria() {
		return metaDiaria;
	}
	
	public String getDescricaoDesafio() {
		return descricaoDesafio;
	}
	
	public Integer getDiasDesafio() {
		return diasDesafio;
	}
}
