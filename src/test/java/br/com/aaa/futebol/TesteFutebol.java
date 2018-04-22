package br.com.aaa.futebol;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.aaa.futebol.dao.JogadorDAO;
import br.com.aaa.futebol.modelo.Jogador;
import br.com.aaa.futebol.modelo.Posicao;
import br.com.aaa.futebol.service.JogadorController;
import br.com.aaa.futebol.util.JPAFactory;

public class TesteFutebol {

	public static void main(String[] args) {
		
		//criaJogadores();
		//defineJogadorFrequencia();
		
		/*JogadorController controller = new JogadorController();
		List<Jogador> listaJogadores = controller.getListaJogadores();
		listaJogadores.forEach(jogador -> System.out.println(jogador.getListaPresenca().get(jogador.getListaPresenca().size()-1).getTime()));*/
		
		JogadorController controller = new JogadorController();
		List<Jogador> listaJogadores = controller.getListaJogadores();
		listaJogadores.forEach(jogador -> System.out.println(jogador.getNome()));
	}
	
	public static void defineJogadorFrequencia() {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		Date dataJogo = new GregorianCalendar(2018,0,29).getTime();
		
		JogadorDAO dao = new JogadorDAO(manager);
		
		Jogador jogador1 = dao.getJogador(1);
		/*PRESENCA*/
		jogador1.setPresenca(jogador1.getPresenca() + 1);
		jogador1.getListaPresenca().add(dataJogo);
		jogador1.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador1.setAusencia(jogador1.getAusencia() + 1);
		
		Jogador jogador2 = dao.getJogador(2);
		/*PRESENCA*/
		jogador2.setPresenca(jogador2.getPresenca() + 1);
		jogador2.getListaPresenca().add(dataJogo);
		jogador2.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador2.setAusencia(jogador2.getAusencia() + 1);
		
		Jogador jogador3 = dao.getJogador(3);
		/*PRESENCA*/
		jogador3.setPresenca(jogador3.getPresenca() + 1);
		jogador3.getListaPresenca().add(dataJogo);
		jogador3.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador3.setAusencia(jogador3.getAusencia() + 1);
		
		Jogador jogador4 = dao.getJogador(4);
		/*PRESENCA*/
		jogador4.setPresenca(jogador4.getPresenca() + 1);
		jogador4.getListaPresenca().add(dataJogo);
		jogador4.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador4.setAusencia(jogador4.getAusencia() + 1);
		
		Jogador jogador5 = dao.getJogador(5);
		/*PRESENCA*/
		jogador5.setPresenca(jogador5.getPresenca() + 1);
		jogador5.getListaPresenca().add(dataJogo);
		jogador5.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador5.setAusencia(jogador5.getAusencia() + 1);
		
		Jogador jogador6 = dao.getJogador(6);
		/*PRESENCA*/
		jogador6.setPresenca(jogador6.getPresenca() + 1);
		jogador6.getListaPresenca().add(dataJogo);
		jogador6.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		//jogador6.setAusencia(jogador6.getAusencia() + 1);
		
		Jogador jogador7 = dao.getJogador(7);
		/*PRESENCA*/
		//jogador7.setPresenca(jogador7.getPresenca() + 1);
		//jogador7.getListaPresenca().add(dataJogo);
		//jogador7.setDataUltimoJogo(dataJogo);
		/*AUSENCIA*/
		jogador7.setAusencia(jogador7.getAusencia() + 1);
		
		/*Jogador jogador8 = dao.getJogador(8);
		registraFrequencia(jogador8, dataJogo, false);
		
		Jogador jogador9 = dao.getJogador(9);
		registraFrequencia(jogador9, dataJogo, true);
		
		Jogador jogador10 = dao.getJogador(10);
		registraFrequencia(jogador10, dataJogo, true);
		
		Jogador jogador11 = dao.getJogador(11);
		registraFrequencia(jogador11, dataJogo, false);
		
		Jogador jogador12 = dao.getJogador(12);
		registraFrequencia(jogador12, dataJogo, false);
		
		Jogador jogador13 = dao.getJogador(13);
		registraFrequencia(jogador13, dataJogo, true);
		
		Jogador jogador14 = dao.getJogador(14);
		registraFrequencia(jogador14, dataJogo, true);
		
		Jogador jogador15 = dao.getJogador(15);
		registraFrequencia(jogador15, dataJogo, true);
		
		Jogador jogador16 = dao.getJogador(16);
		registraFrequencia(jogador16, dataJogo, true);
		
		Jogador jogador17 = dao.getJogador(17);
		registraFrequencia(jogador17, dataJogo, true);
		
		Jogador jogador18 = dao.getJogador(18);
		registraFrequencia(jogador18, dataJogo, false);
		
		Jogador jogador19 = dao.getJogador(19);
		registraFrequencia(jogador19, dataJogo, true);
		
		Jogador jogador20 = dao.getJogador(20);
		registraFrequencia(jogador20, dataJogo, true);
		
		Jogador jogador21 = dao.getJogador(21);
		registraFrequencia(jogador21, dataJogo, true);
		
		Jogador jogador22 = dao.getJogador(22);
		registraFrequencia(jogador22, dataJogo, true);
		
		Jogador jogador23 = dao.getJogador(23);
		registraFrequencia(jogador23, dataJogo, false);
		
		Jogador jogador24 = dao.getJogador(24);
		registraFrequencia(jogador24, dataJogo, true);
		
		Jogador jogador25 = dao.getJogador(25);
		registraFrequencia(jogador25, dataJogo, true);
		
		Jogador jogador26 = dao.getJogador(26);
		registraFrequencia(jogador26, dataJogo, true);
		
		Jogador jogador27 = dao.getJogador(27);
		registraFrequencia(jogador27, dataJogo, false);
		
		Jogador jogador28 = dao.getJogador(28);
		registraFrequencia(jogador28, dataJogo, true);*/
		
		manager.getTransaction().commit();
		manager.close();
	}
	
	public static void criaJogadores() {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		JogadorDAO dao = new JogadorDAO(manager);

		/*GOLEIROS*/
		Jogador g1 = new Jogador();
		g1.setNome("Carl„o");
		g1.setPosicao(Posicao.GOLEIRO);
		dao.persisteJogador(g1);
		
		Jogador g2 = new Jogador();
		g2.setNome("Renato");
		g2.setPosicao(Posicao.GOLEIRO);
		dao.persisteJogador(g2);
		
		/*DEFESENSORES*/
		Jogador d1 = new Jogador();
		d1.setNome("Rangel");
		d1.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d1);
		
		Jogador d2 = new Jogador();
		d2.setNome("Roger");
		d2.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d2);
		
		Jogador d3 = new Jogador();
		d3.setNome("Bin„o");
		d3.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d3);
		
		Jogador d4 = new Jogador();
		d4.setNome("Chic„o Bizetto");
		d4.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d4);
		
		Jogador d5 = new Jogador();
		d5.setNome("Danilo Vrum");
		d5.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d5);
		
		/*Jogador d6 = new Jogador();
		d6.setNome("Daniel Pastorello");
		d6.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d6);
		
		Jogador d7 = new Jogador();
		d7.setNome("Flavinho");
		d7.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d7);
		
		Jogador d8 = new Jogador();
		d8.setNome("Motta Pai");
		d8.setPosicao(Posicao.DEFENSOR);
		dao.persisteJogador(d8);*/
		
		/*MEIAS*/
		/*Jogador m1 = new Jogador();
		m1.setNome("Gio");
		m1.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m1);
		
		Jogador m2 = new Jogador();
		m2.setNome("Cassinho");
		m2.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m2);
		
		Jogador m3 = new Jogador();
		m3.setNome("Play");
		m3.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m3);
		
		Jogador m4 = new Jogador();
		m4.setNome("Mottinha");
		m4.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m4);
		
		Jogador m5 = new Jogador();
		m5.setNome("Danilo Pariz");
		m5.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m5);
		
		Jogador m6 = new Jogador();
		m6.setNome("Gui Malvestiti");
		m6.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m6);
		
		Jogador m7 = new Jogador();
		m7.setNome("Wellington Moro");
		m7.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m7);
		
		Jogador m8 = new Jogador();
		m8.setNome("Kaio Gusmin");
		m8.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m8);
		
		Jogador m9 = new Jogador();
		m9.setNome("Luiz Alfredo");
		m9.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m9);
		
		Jogador m10 = new Jogador();
		m10.setNome("D√∫ Salom√£o");
		m10.setPosicao(Posicao.MEIA);
		dao.persisteJogador(m10);*/
		
		/*ATACANTES*/
		/*Jogador a1 = new Jogador();
		a1.setNome("Papel");
		a1.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a1);
		
		Jogador a2 = new Jogador();
		a2.setNome("Fel");
		a2.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a2);
		
		Jogador a3 = new Jogador();
		a3.setNome("Hebert");
		a3.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a3);
		
		Jogador a4 = new Jogador();
		a4.setNome("Gui Mazzaro");
		a4.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a4);
		
		Jogador a5 = new Jogador();
		a5.setNome("Batata");
		a5.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a5);
		
		Jogador a6 = new Jogador();
		a6.setNome("Helder Quenzer");
		a6.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a6);
		
		Jogador a7 = new Jogador();
		a7.setNome("Chic√£o Russo");
		a7.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a7);
		
		Jogador a8 = new Jogador();
		a8.setNome("Christian Passos");
		a8.setPosicao(Posicao.ATACANTE);
		dao.persisteJogador(a8);*/
		
		manager.getTransaction().commit();
		manager.close();
	}
}