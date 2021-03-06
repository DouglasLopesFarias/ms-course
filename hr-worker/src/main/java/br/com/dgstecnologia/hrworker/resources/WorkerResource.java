package br.com.dgstecnologia.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgstecnologia.hrworker.entities.Worker;
import br.com.dgstecnologia.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workes")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findBuIdl(@PathVariable Long id){
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);		
	}

}
