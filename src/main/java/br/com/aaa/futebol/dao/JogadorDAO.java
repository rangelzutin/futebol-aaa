package br.com.aaa.futebol.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.aaa.futebol.modelo.Jogador;

public class JogadorDAO {
	
private EntityManager manager;
	
	public JogadorDAO(EntityManager manager) {
		this.manager = manager;
	}

	public void persisteJogador(Jogador jogador) {
		manager.persist(jogador);
	}
	
	public Jogador getJogador(Integer id) {
		return manager.find(Jogador.class, id);
	}
	
	public List<Jogador> getListaJogadores() {
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		CriteriaQuery<Jogador> query = criteriaBuilder.createQuery(Jogador.class);
		Root<Jogador> root = query.from(Jogador.class);
		query.orderBy(criteriaBuilder.desc(root.get("pontos")));
	    TypedQuery<Jogador> typedQuery = manager.createQuery(query);
	    return typedQuery.getResultList();
	}
	
	public List<Jogador> atualizaJogadores(List<Jogador> jogadores) {
		jogadores.forEach(jogador -> {
			Jogador jogador2 = this.getJogador(jogador.getId());
			int pontos = jogador.getPontos();
			pontos = pontos + 2;
			jogador2.setPontos(pontos);
			this.persisteJogador(jogador2);
		});
		return jogadores;
	}
}