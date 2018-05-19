package br.com.aaa.futebol;

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
		
		JogadorController controller = new JogadorController();
		List<Jogador> listaJogadores = controller.getListaJogadores();
		listaJogadores.forEach(jogador -> System.out.println(jogador.getNome()));
	}
	
	public static void criaJogadores() {
		
		EntityManager manager = new JPAFactory().getEntityManager();
		manager.getTransaction().begin();
		
		JogadorDAO dao = new JogadorDAO(manager);
		
		Jogador j1 = new Jogador();
		j1.setNome("Kaio G.");
		j1.setPosicao(Posicao.LINHA);
		j1.setAusenciaTrimestre(0);
		j1.setAusenciaAcumulada(1);
		j1.setAusenciaTotal(1);
		j1.setUltimaAusencia(new GregorianCalendar(2018,0,8).getTime());
		j1.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j1);
		
		Jogador j2 = new Jogador();
		j2.setNome("Fel");
		j2.setPosicao(Posicao.LINHA);
		j2.setAusenciaTrimestre(0);
		j2.setAusenciaAcumulada(1);
		j2.setAusenciaTotal(1);
		j2.setUltimaAusencia(new GregorianCalendar(2018,0,22).getTime());
		j2.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j2);
		
		Jogador j3 = new Jogador();
		j3.setNome("Chicao B.");
		j3.setPosicao(Posicao.LINHA);
		j3.setAusenciaTrimestre(0);
		j3.setAusenciaAcumulada(1);
		j3.setAusenciaTotal(1);
		j3.setUltimaAusencia(new GregorianCalendar(2018,1,5).getTime());
		j3.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j3);
		
		Jogador j4 = new Jogador();
		j4.setNome("Daniel P.");
		j4.setPosicao(Posicao.LINHA);
		j4.setAusenciaTrimestre(0);
		j4.setAusenciaAcumulada(1);
		j4.setAusenciaTotal(1);
		j4.setUltimaAusencia(new GregorianCalendar(2018,2,5).getTime());
		j4.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j4);
		
		Jogador j5 = new Jogador();
		j5.setNome("Rangel");
		j5.setPosicao(Posicao.LINHA);
		j5.setAusenciaTrimestre(1);
		j5.setAusenciaAcumulada(0);
		j5.setAusenciaTotal(1);
		j5.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j5.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j5);
		
		Jogador j6 = new Jogador();
		j6.setNome("Du Salomao");
		j6.setPosicao(Posicao.LINHA);
		j6.setAusenciaTrimestre(1);
		j6.setAusenciaAcumulada(0);
		j6.setAusenciaTotal(1);
		j6.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j6.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j6);
		
		Jogador j7 = new Jogador();
		j7.setNome("Purga");
		j7.setPosicao(Posicao.LINHA);
		j7.setAusenciaTrimestre(1);
		j7.setAusenciaAcumulada(0);
		j7.setAusenciaTotal(1);
		j7.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j7.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j7);
		
		Jogador j8 = new Jogador();
		j8.setNome("Julio M.");
		j8.setPosicao(Posicao.LINHA);
		j8.setAusenciaTrimestre(0);
		j8.setAusenciaAcumulada(2);
		j8.setAusenciaTotal(2);
		j8.setUltimaAusencia(new GregorianCalendar(2018,1,26).getTime());
		j8.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j8);
		
		Jogador j9 = new Jogador();
		j9.setNome("Welligton");
		j9.setPosicao(Posicao.LINHA);
		j9.setAusenciaTrimestre(2);
		j9.setAusenciaAcumulada(0);
		j9.setAusenciaTotal(2);
		j9.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j9.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j9);
		
		Jogador j10 = new Jogador();
		j10.setNome("Gui Mazzaro");
		j10.setPosicao(Posicao.LINHA);
		j10.setAusenciaTrimestre(1);
		j10.setAusenciaAcumulada(1);
		j10.setAusenciaTotal(2);
		j10.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j10.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j10);
		
		Jogador j11 = new Jogador();
		j11.setNome("Papel");
		j11.setPosicao(Posicao.LINHA);
		j11.setAusenciaTrimestre(1);
		j11.setAusenciaAcumulada(1);
		j11.setAusenciaTotal(2);
		j11.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j11.setUltimaPresenca(new GregorianCalendar(2018,4,7).getTime());
		dao.persisteJogador(j11);
		
		Jogador j12 = new Jogador();
		j12.setNome("D. Vrum");
		j12.setPosicao(Posicao.LINHA);
		j12.setAusenciaTrimestre(1);
		j12.setAusenciaAcumulada(2);
		j12.setAusenciaTotal(3);
		j12.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j12.setUltimaPresenca(new GregorianCalendar(2018,4,7).getTime());
		dao.persisteJogador(j12);
		
		Jogador j13 = new Jogador();
		j13.setNome("Binao");
		j13.setPosicao(Posicao.LINHA);
		j13.setAusenciaTrimestre(2);
		j13.setAusenciaAcumulada(1);
		j13.setAusenciaTotal(3);
		j13.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j13.setUltimaPresenca(new GregorianCalendar(2018,3,30).getTime());
		dao.persisteJogador(j13);
		
		Jogador j14 = new Jogador();
		j14.setNome("Danilo P.");
		j14.setPosicao(Posicao.LINHA);
		j14.setAusenciaTrimestre(1);
		j14.setAusenciaAcumulada(3);
		j14.setAusenciaTotal(4);
		j14.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j14.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j14);
		
		Jogador j15 = new Jogador();
		j15.setNome("Flavinho");
		j15.setPosicao(Posicao.LINHA);
		j15.setAusenciaTrimestre(1);
		j15.setAusenciaAcumulada(3);
		j15.setAusenciaTotal(4);
		j15.setUltimaAusencia(new GregorianCalendar(2018,3,23).getTime());
		j15.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j15);
		
		Jogador j16 = new Jogador();
		j16.setNome("Roger");
		j16.setPosicao(Posicao.LINHA);
		j16.setAusenciaTrimestre(1);
		j16.setAusenciaAcumulada(3);
		j16.setAusenciaTotal(4);
		j16.setUltimaAusencia(new GregorianCalendar(2018,3,23).getTime());
		j16.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j16);
		
		Jogador j17 = new Jogador();
		j17.setNome("Play");
		j17.setPosicao(Posicao.LINHA);
		j17.setAusenciaTrimestre(2);
		j17.setAusenciaAcumulada(2);
		j17.setAusenciaTotal(4);
		j17.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j17.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j17);
		
		Jogador j18 = new Jogador();
		j18.setNome("Hebert");
		j18.setPosicao(Posicao.LINHA);
		j18.setAusenciaTrimestre(2);
		j18.setAusenciaAcumulada(2);
		j18.setAusenciaTotal(4);
		j18.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j18.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j18);
		
		Jogador j19 = new Jogador();
		j19.setNome("Thiago M.");
		j19.setPosicao(Posicao.LINHA);
		j19.setAusenciaTrimestre(2);
		j19.setAusenciaAcumulada(2);
		j19.setAusenciaTotal(4);
		j19.setUltimaAusencia(new GregorianCalendar(2018,4,7).getTime());
		j19.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j19);
		
		Jogador j20 = new Jogador();
		j20.setNome("Chris P.");
		j20.setPosicao(Posicao.LINHA);
		j20.setAusenciaTrimestre(3);
		j20.setAusenciaAcumulada(1);
		j20.setAusenciaTotal(4);
		j20.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j20.setUltimaPresenca(new GregorianCalendar(2018,4,7).getTime());
		dao.persisteJogador(j20);
		
		Jogador j21 = new Jogador();
		j21.setNome("Batata");
		j21.setPosicao(Posicao.LINHA);
		j21.setAusenciaTrimestre(1);
		j21.setAusenciaAcumulada(4);
		j21.setAusenciaTotal(5);
		j21.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j21.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j21);
		
		Jogador j22 = new Jogador();
		j22.setNome("Motta Pai");
		j22.setPosicao(Posicao.LINHA);
		j22.setAusenciaTrimestre(1);
		j22.setAusenciaAcumulada(5);
		j22.setAusenciaTotal(6);
		j22.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j22.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j22);
		
		Jogador j23 = new Jogador();
		j23.setNome("Miranda");
		j23.setPosicao(Posicao.LINHA);
		j23.setAusenciaTrimestre(2);
		j23.setAusenciaAcumulada(4);
		j23.setAusenciaTotal(6);
		j23.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j23.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j23);
		
		Jogador j24 = new Jogador();
		j24.setNome("Renato");
		j24.setPosicao(Posicao.GOL);
		j24.setAusenciaTrimestre(2);
		j24.setAusenciaAcumulada(7);
		j24.setAusenciaTotal(9);
		j24.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j24.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j24);
		
		Jogador j25 = new Jogador();
		j25.setNome("Carlao");
		j25.setPosicao(Posicao.GOL);
		j25.setAusenciaTrimestre(4);
		j25.setAusenciaAcumulada(5);
		j25.setAusenciaTotal(9);
		j25.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j25.setUltimaPresenca(new GregorianCalendar(2018,4,7).getTime());
		dao.persisteJogador(j25);
		
		Jogador j26 = new Jogador();
		j26.setNome("Helder");
		j26.setPosicao(Posicao.LINHA);
		j26.setAusenciaTrimestre(3);
		j26.setAusenciaAcumulada(7);
		j26.setAusenciaTotal(10);
		j26.setUltimaAusencia(new GregorianCalendar(2018,4,7).getTime());
		j26.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j26);
		
		Jogador j27 = new Jogador();
		j27.setNome("D. Pollo");
		j27.setPosicao(Posicao.LINHA);
		j27.setAusenciaTrimestre(0);
		j27.setAusenciaAcumulada(11);
		j27.setAusenciaTotal(11);
		j27.setUltimaAusencia(new GregorianCalendar(2018,2,26).getTime());
		j27.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j27);
		
		Jogador j28 = new Jogador();
		j28.setNome("Giovanni");
		j28.setPosicao(Posicao.LINHA);
		j28.setAusenciaTrimestre(5);
		j28.setAusenciaAcumulada(6);
		j28.setAusenciaTotal(11);
		j28.setUltimaAusencia(new GregorianCalendar(2018,3,30).getTime());
		j28.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j28);
		
		Jogador j29 = new Jogador();
		j29.setNome("Gui Malv.");
		j29.setPosicao(Posicao.LINHA);
		j29.setAusenciaTrimestre(7);
		j29.setAusenciaAcumulada(4);
		j29.setAusenciaTotal(11);
		j29.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j29.setUltimaPresenca(new GregorianCalendar(2018,2,26).getTime());
		dao.persisteJogador(j29);
		
		Jogador j30 = new Jogador();
		j30.setNome("Chicao R.");
		j30.setPosicao(Posicao.LINHA);
		j30.setAusenciaTrimestre(6);
		j30.setAusenciaAcumulada(6);
		j30.setAusenciaTotal(12);
		j30.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j30.setUltimaPresenca(new GregorianCalendar(2018,3,2).getTime());
		dao.persisteJogador(j30);
		
		Jogador j31 = new Jogador();
		j31.setNome("Marcos B.");
		j31.setPosicao(Posicao.LINHA);
		j31.setAusenciaTrimestre(2);
		j31.setAusenciaAcumulada(11);
		j31.setAusenciaTotal(13);
		j31.setUltimaAusencia(new GregorianCalendar(2018,3,16).getTime());
		j31.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j31);
		
		Jogador j32 = new Jogador();
		j32.setNome("L. Galante");
		j32.setPosicao(Posicao.GOL);
		j32.setAusenciaTrimestre(4);
		j32.setAusenciaAcumulada(11);
		j32.setAusenciaTotal(15);
		j32.setUltimaAusencia(new GregorianCalendar(2018,3,07).getTime());
		j32.setUltimaPresenca(new GregorianCalendar(2018,4,14).getTime());
		dao.persisteJogador(j32);
		
		Jogador j33 = new Jogador();
		j33.setNome("Cassinho");
		j33.setPosicao(Posicao.LINHA);
		j33.setAusenciaTrimestre(5);
		j33.setAusenciaAcumulada(11);
		j33.setAusenciaTotal(16);
		j33.setUltimaAusencia(new GregorianCalendar(2018,4,14).getTime());
		j33.setUltimaPresenca(new GregorianCalendar(2018,4,7).getTime());
		dao.persisteJogador(j33);
		
		manager.getTransaction().commit();
		manager.close();
	}
}