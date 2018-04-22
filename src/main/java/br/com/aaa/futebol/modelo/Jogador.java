package br.com.aaa.futebol.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	private String nome;
	
	private int ausencia;
	private int presenca;
	
	@Enumerated(EnumType.STRING)
	private Posicao posicao;
	
	@Temporal(TemporalType.DATE)
	private Date dataUltimoJogo;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Date> listaPresenca = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAusencia() {
		return ausencia;
	}

	public void setAusencia(int ausencia) {
		this.ausencia = ausencia;
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	public Date getDataUltimoJogo() {
		return dataUltimoJogo;
	}

	public void setDataUltimoJogo(Date dataUltimoJogo) {
		this.dataUltimoJogo = dataUltimoJogo;
	}

	public List<Date> getListaPresenca() {
		return listaPresenca;
	}

	public void setListaPresenca(List<Date> listaPresenca) {
		this.listaPresenca = listaPresenca;
	}
}