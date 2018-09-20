package br.com.aaa.futebol;

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
		
		JogadorController controller = new JogadorController();
		List<Jogador> listaJogadores = controller.getListaJogadores();
		listaJogadores.forEach(jogador -> System.out.println(jogador.getNome()));
	}
	
	public static void criaJogadores() {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		JogadorDAO dao = new JogadorDAO(manager);
		
		Jogador j1 = new Jogador();
		j1.setNome("Wellington");
		j1.setPosicao(Posicao.LINHA);
		j1.setPontos(110);
		dao.persisteJogador(j1);
		
		Jogador j2 = new Jogador();
		j2.setNome("Fel");
		j2.setPosicao(Posicao.LINHA);
		j2.setPontos(110);
		dao.persisteJogador(j2);
		
		Jogador j3 = new Jogador();
		j3.setNome("Du Salomao");
		j3.setPosicao(Posicao.LINHA);
		j3.setPontos(104);
		dao.persisteJogador(j3);
		
		Jogador j4 = new Jogador();
		j4.setNome("Chicao B");
		j4.setPosicao(Posicao.LINHA);
		j4.setPontos(104);
		dao.persisteJogador(j4);
		
		Jogador j5 = new Jogador();
		j5.setNome("Rangel");
		j5.setPosicao(Posicao.LINHA);
		j5.setPontos(102);
		dao.persisteJogador(j5);
		
		Jogador j6 = new Jogador();
		j6.setNome("Papel");
		j6.setPosicao(Posicao.LINHA);
		j6.setPontos(102);
		dao.persisteJogador(j6);
		
		Jogador j7 = new Jogador();
		j7.setNome("Purga");
		j7.setPosicao(Posicao.LINHA);
		j7.setPontos(100);
		dao.persisteJogador(j7);
		
		Jogador j8 = new Jogador();
		j8.setNome("Daniel P.");
		j8.setPosicao(Posicao.LINHA);
		j8.setPontos(98);
		dao.persisteJogador(j8);
		
		Jogador j9 = new Jogador();
		j9.setNome("Flavinho");
		j9.setPosicao(Posicao.LINHA);
		j9.setPontos(96);
		dao.persisteJogador(j9);
		
		Jogador j10 = new Jogador();
		j10.setNome("Vrum");
		j10.setPosicao(Posicao.LINHA);
		j10.setPontos(94);
		dao.persisteJogador(j10);
		
		Jogador j11 = new Jogador();
		j11.setNome("Davi B.");
		j11.setPosicao(Posicao.LINHA);
		j11.setPontos(90);
		dao.persisteJogador(j11);
		
		Jogador j12 = new Jogador();
		j12.setNome("Julio M.");
		j12.setPosicao(Posicao.LINHA);
		j12.setPontos(90);
		dao.persisteJogador(j12);
		
		Jogador j13 = new Jogador();
		j13.setNome("Danilo P.");
		j13.setPosicao(Posicao.LINHA);
		j13.setPontos(86);
		dao.persisteJogador(j13);
		
		Jogador j14 = new Jogador();
		j14.setNome("Motta Pai");
		j14.setPosicao(Posicao.LINHA);
		j13.setPontos(84);
		dao.persisteJogador(j14);
		
		Jogador j15 = new Jogador();
		j15.setNome("Carcinha");
		j15.setPosicao(Posicao.LINHA);
		j15.setPontos(84);
		dao.persisteJogador(j15);
		
		Jogador j16 = new Jogador();
		j16.setNome("Gui Mazzaro");
		j16.setPosicao(Posicao.LINHA);
		j16.setPontos(84);
		dao.persisteJogador(j16);
		
		Jogador j17 = new Jogador();
		j17.setNome("Hebert");
		j17.setPosicao(Posicao.LINHA);
		j17.setPontos(82);
		dao.persisteJogador(j17);
		
		Jogador j18 = new Jogador();
		j18.setNome("Cris P.");
		j18.setPosicao(Posicao.LINHA);
		j18.setPontos(82);
		dao.persisteJogador(j18);
		
		Jogador j19 = new Jogador();
		j19.setNome("Carlao");
		j19.setPosicao(Posicao.GOL);
		j19.setPontos(82);
		dao.persisteJogador(j19);
		
		Jogador j20 = new Jogador();
		j20.setNome("Play");
		j20.setPosicao(Posicao.LINHA);
		j20.setPontos(80);
		dao.persisteJogador(j20);
		
		Jogador j21 = new Jogador();
		j21.setNome("Roger");
		j21.setPosicao(Posicao.LINHA);
		j21.setPontos(76);
		dao.persisteJogador(j21);
		
		Jogador j22 = new Jogador();
		j22.setNome("Batata");
		j22.setPosicao(Posicao.LINHA);
		j22.setPontos(70);
		dao.persisteJogador(j22);
		
		Jogador j23 = new Jogador();
		j23.setNome("Kaio G.");
		j23.setPosicao(Posicao.LINHA);
		j23.setPontos(70);
		dao.persisteJogador(j23);
		
		Jogador j24 = new Jogador();
		j24.setNome("Helder");
		j24.setPosicao(Posicao.LINHA);
		j24.setPontos(68);
		dao.persisteJogador(j24);
		
		Jogador j25 = new Jogador();
		j25.setNome("Renato");
		j25.setPosicao(Posicao.GOL);
		j25.setPontos(64);
		dao.persisteJogador(j25);
		
		Jogador j26 = new Jogador();
		j26.setNome("Giovani");
		j26.setPosicao(Posicao.LINHA);
		j26.setPontos(64);
		dao.persisteJogador(j26);
		
		Jogador j27 = new Jogador();
		j27.setNome("Miranda");
		j27.setPosicao(Posicao.LINHA);
		j27.setPontos(50);
		dao.persisteJogador(j27);
		
		Jogador j28 = new Jogador();
		j28.setNome("Daniel Pollo");
		j28.setPosicao(Posicao.LINHA);
		j28.setPontos(40);
		dao.persisteJogador(j28);
		
		Jogador j29 = new Jogador();
		j29.setNome("Marcos P.");
		j29.setPosicao(Posicao.LINHA);
		j29.setPontos(30);
		dao.persisteJogador(j29);
		
		Jogador j30 = new Jogador();
		j30.setNome("Cassinho");
		j30.setPosicao(Posicao.LINHA);
		j30.setPontos(26);
		dao.persisteJogador(j30);
		
		Jogador j31 = new Jogador();
		j31.setNome("Cissao");
		j31.setPosicao(Posicao.LINHA);
		j31.setPontos(4);
		dao.persisteJogador(j31);
		
		Jogador j32 = new Jogador();
		j32.setNome("Juliano");
		j32.setPosicao(Posicao.GOL);
		j32.setPontos(3);
		dao.persisteJogador(j32);
		
		Jogador j33 = new Jogador();
		j33.setNome("Juliao");
		j33.setPosicao(Posicao.LINHA);
		j33.setPontos(0);
		dao.persisteJogador(j33);
		
		manager.getTransaction().commit();
		manager.close();
	}
}