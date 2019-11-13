package com.rotas.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rotas.models.Geradora;
import com.rotas.repository.GeradoraRepository;

@RestController
@RequestMapping(value = "/api")
public class GeradoraResource {
	
	@Autowired	
	GeradoraRepository geradoraRepository;
	
	@GetMapping("/geradoras")
	public List<Geradora> listarTodos(){
		return geradoraRepository.findAll();
	}
	
	@GetMapping("/geradora/{id}")
    public Optional<Geradora> ObterPorId(@PathVariable(value = "id") long id)
    {
        return geradoraRepository.findById(id);
    }
	
	@PostMapping("/geradora")
	public Geradora Salvar(@RequestBody Geradora geradora) {
		return geradoraRepository.save(geradora);
	}
	
	@DeleteMapping("/geradora/{id}")
    public void Remover(@PathVariable(value = "id") long id)
    {
        geradoraRepository.deleteById(id);
    }
	
	@PutMapping("/geradora")
	public Geradora Atualizar(@RequestBody Geradora geradora) {
		return geradoraRepository.save(geradora);
	}
}
