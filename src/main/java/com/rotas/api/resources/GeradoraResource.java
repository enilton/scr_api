package com.rotas.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rotas.api.models.Geradora;
import com.rotas.api.service.GeradoraService;

@RestController
@RequestMapping(value = "/api")
public class GeradoraResource {
	
	@Autowired
	private GeradoraService geradorasService;
	
	@GetMapping("/geradoras")
	public List<Geradora> listarTodos(){
		return geradorasService.findAll();
	}
	
	@GetMapping("/geradora/{id}")
    public Geradora ObterPorId(final @PathVariable(value = "id") Long id)
    {
        return geradorasService.findById(id);
    }
	
	@PostMapping("/geradora")
	public Geradora Salvar(final @RequestBody Geradora geradora) {
		return geradorasService.save(geradora);
	}
	
	@DeleteMapping("/geradora/{id}")
    public void Remover(final @PathVariable(value = "id") Long id)
    {
        geradorasService.deleteById(id);
    }
	
	@PutMapping("/geradora")
	public Geradora Atualizar(@RequestBody Geradora geradora) {
		return geradorasService.save(geradora);
	}
}
