package br.com.aaa.futebol.service;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.aaa.futebol.dao.JogadorDAO;
import br.com.aaa.futebol.modelo.Jogador;
import br.com.aaa.futebol.util.JPAFactory;

public class JogadorController {

	public Jogador getJogador(Integer id) {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		JogadorDAO dao = new JogadorDAO(manager);
		
		Jogador jogador = new Jogador();
		jogador = (Jogador) dao.getJogador(id);
		
		manager.getTransaction().commit();
		manager.close();
		
		return jogador;
	}
	
	public List<Jogador> getListaJogadores() {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		JogadorDAO dao = new JogadorDAO(manager);
		
		List<Jogador> listaJogadores = dao.getListaJogadores();
		//listaJogadores.sort(Comparator.comparing(Jogador::getAusencia));
		
		manager.getTransaction().commit();
		manager.close();
		
		return listaJogadores;
	}
}