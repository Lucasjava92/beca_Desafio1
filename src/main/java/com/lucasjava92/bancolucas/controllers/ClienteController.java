
package com.lucasjava92.bancolucas.controllers;

import com.lucasjava92.bancolucas.dominio.Cliente;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List; 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
	
	@PostMapping
	public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		if ( cliente.getEmail().length() <= 3 ) {
			return ResponseEntity.unprocessableEntity().build();
		}
		
		//Random gerador = new Random();
		//cliente.setId(gerador.nextLong(5L));
		//System.out.println("Criar");
		cliente.setId(5L);
		
		return ResponseEntity.created(null).body(cliente);
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		//System.out.println("atualizar");
		cliente.setId(id);
		
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletar(@PathVariable Long id) {
		//System.out.println("Deletar" + id);
		return ResponseEntity.noContent().build();

	}

	@GetMapping
	public ResponseEntity<List<Cliente>> listar() {
		Cliente c1 = new Cliente(null, null, null);
		c1.setId(1L);
		c1.setEmail("Joao@nttdata.com");
		c1.setEndereco("Av.Sao Jose 1250");
		
		Cliente c2 = new Cliente(null, null, null);
		c2.setId(2L);
		c2.setEmail("Maria@nttdata.com");
		c2.setEndereco("Av.Sao Jose 1251");
		
		Cliente c3 = new Cliente(null, null, null);
		c3.setId(3L);
		c3.setEmail("Carlos@nttdata.com");
		c3.setEndereco("Av.Sao Jose 1252");
		
		Cliente c4 = new Cliente(null, null, null);
		c4.setId(4L);
		c4.setEmail("Helena@nttdata.com");
		c4.setEndereco("Av.Sao Jose 1253");
		
		Cliente c5 = new Cliente(null, null, null);
		c5.setId(5L);
		c5.setEmail("Paulo@nttdata.com");
		c5.setEndereco("Av.Sao Jose 1254");
		
		Cliente c6 = new Cliente(null, null, null);
		c6.setId(6L);
		c6.setEmail("Thais@nttdata.com");
		c6.setEndereco("Av.Sao Jose 1255");
		
		return ResponseEntity.ok(List.of( c1, c2, c3, c4, c5, c6));
		
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Cliente> obter(@PathVariable Long id) {
		//System.out.println("Obteve " + id);
		Cliente c1 = new Cliente(null, null, null);
		c1.setId( id );
		c1.setEmail("Joao@nttdata.com");
		c1.setEndereco("Av.Sao Jose 1250");
		
		return ResponseEntity.ok(c1);
		
		
	}


}
