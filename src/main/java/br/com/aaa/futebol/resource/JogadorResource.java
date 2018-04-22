package br.com.aaa.futebol.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

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
}