package br.com.dgstecnologia.sli.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgstecnologia.sli.entities.Cliente;
import br.com.dgstecnologia.sli.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

	@Autowired
	private ClienteRepository repository;

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list = repository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findBuIdl(@PathVariable Long id) {
		Cliente obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

	@PostMapping(value = "/insertCliente")
	public void createEmployee(@RequestBody Cliente obj) {
		repository.save(obj);

	}

	@PutMapping(value = "/updateCliente")
	public void updateEmployee(@RequestBody Cliente obj) {
		repository.save(obj);

	}

	@DeleteMapping(value = "/deleteCliente")
	public void deleteEmployee(@RequestBody Cliente obj) {
		repository.delete(obj);

	}

}
