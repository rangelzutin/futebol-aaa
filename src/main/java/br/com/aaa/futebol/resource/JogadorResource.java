package br.com.aaa.futebol.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.aaa.futebol.modelo.Jogador;
import br.com.aaa.futebol.service.JogadorController;

@Path("jogador")
public class JogadorResource {
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getJogador(@PathParam("id") Integer id) {
		return new Gson().toJson(new JogadorController().getJogador(id));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getListaJogadores() {
		return new Gson().toJson(new JogadorController().getListaJogadores());
	}
	
	//https://examples.javacodegeeks.com/core-java/json-jax-rs-example/
	//https://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/salva_jogadores")
	public Response salvaJogadores(List<Jogador> jogadores) {
	
		String result = "Record entered: "+ jogadores;
		return Response.status(201).entity(result).build();
	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/salva_jogador")
	public Response salvaJogador(Jogador jogador) {
	
		String result = "Record entered: "+ jogador;
		return Response.status(201).entity(result).build();
	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/atualiza_jogadores")
	public Response atualizaJogadores(List<Jogador> jogadores) {
	
		String result = "Record entered: "+ new JogadorController().atualizaJogadores(jogadores);;
		return Response.status(201).entity(result).build();
	
	}
	
}