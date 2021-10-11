package com.listacafe.apirest.ressources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listacafe.apirest.models.Colaborador;
import com.listacafe.apirest.repository.ColaboradorRepository;

@RestController
@RequestMapping(value="/api")
public class ColaboradorResource {
	
	
	@Autowired
	ColaboradorRepository  colaboradorRepository;
	
	@GetMapping("/colaborador")
	public List<Colaborador> listaColaborador(){
		return colaboradorRepository.findAll();
	}
	
	@GetMapping("/colaborador/{id}")
	public Colaborador  listaColaboradorunico(@PathVariable(value="id")long id){
		return  (Colaborador) colaboradorRepository.findById(id);
	}
	
	@PostMapping("/colaborador")
	public Colaborador  salvaProduto(@RequestBody @Validated Colaborador colaborador){
		return colaboradorRepository.save(colaborador);
	}
	
	@DeleteMapping("/Colaborador")
	public void deletaProduto(@RequestBody @Validated Colaborador colaborador) {
		colaboradorRepository.delete(colaborador);
	}
	@PutMapping("/colaborador")
	public Colaborador atualizaProduto(@RequestBody @Validated Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}
}
