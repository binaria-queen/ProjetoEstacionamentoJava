package com.aulas.rest.servicos;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulas.rest.entidades.Vagas;
import com.aulas.rest.repositorios.VagasRepositorio;

@Service
public class VagasService {
	@Autowired
	VagasRepositorio repo;

	public List<Vagas> listTodas() {
		List<Vagas> lista = repo.findAll();
		return lista;
	}

	public Vagas pegarPorId(int idvagas) {
		Optional<Vagas> obj = repo.findById(idvagas);
		Vagas vaga = obj.get();
		return vaga;

	}

	public Vagas salvar(Vagas vagas) {
		Vagas vaga = repo.save(vagas);
		return vaga;
	}

	public Vagas alterar(int idvagas, Vagas vagas) {
		Optional<Vagas> obj = repo.findById(idvagas);
		Vagas vaga = obj.get();

		vaga.setIdvagas(vagas.getIdvagas());
		vaga.setTipo(vagas.getTipo());
		vaga.setStatus(vagas.getStatus());
		vaga = repo.save(vaga);
		return vaga;

	}

	public void deletar(int idvagas) {
		repo.deleteById(idvagas);
	}
}