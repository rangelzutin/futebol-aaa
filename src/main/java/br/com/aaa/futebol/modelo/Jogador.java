package br.com.aaa.futebol.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Rangel Zutin
 * @version 1.0
 * @since Janeiro 2018
 */
@Entity
public class Jogador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private int pontos;
	
	private String nome;

	@Enumerated(EnumType.STRING)
	private Posicao posicao;
	
	/*private int numeroFaltas;
	private int numeroPresencas;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy hh:mm:ss a", locale = "en_US")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimaFalta;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM dd, yyyy hh:mm:ss a", locale = "en_US")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimaPresenca;*/
	
	private int ranking;
	private boolean espera;
	private int qtosJogou;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	/*public int getNumeroFaltas() {
		return numeroFaltas;
	}
	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}
	public int getNumeroPresencas() {
		return numeroPresencas;
	}
	public void setNumeroPresencas(int numeroPresencas) {
		this.numeroPresencas = numeroPresencas;
	}
	public Date getUltimaFalta() {
		return ultimaFalta;
	}
	public void setUltimaFalta(Date ultimaFalta) {
		this.ultimaFalta = ultimaFalta;
	}
	public Date getUltimaPresenca() {
		return ultimaPresenca;
	}
	public void setUltimaPresenca(Date ultimaPresenca) {
		this.ultimaPresenca = ultimaPresenca;
	}*/
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public boolean isEspera() {
		return espera;
	}
	public void setEspera(boolean espera) {
		this.espera = espera;
	}
	public int getQtosJogou() {
		return qtosJogou;
	}
	public void setQtosJogou(int qtosJogou) {
		this.qtosJogou = qtosJogou;
	}
}