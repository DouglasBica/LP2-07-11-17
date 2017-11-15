package Calculadora;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import space.indietech.cliente.Cliente;
import space.indietech.estacionamento.Vaga;

@RestController
@RequestMapping(value = "/calculadora")
public class CalculadoraRest {

	@PutMapping("/{valor}")
	public ResponseEntity<Object> calcular(@RequestBody ("valor")int valor, @RequestBody CalculadoraDao Calculadora) {
		Calculadora.setvalor(valor);

	}
}


	
	@PutMapping("/{cpf}")
	public ResponseEntity<Object> savePF(@PathVariable("cpf") String cpf, @RequestBody Cliente cliente) {
		cliente.setCpfCnpj(cpf);

		boolean exists = clienteRepository.exists(cpf);

		cliente = clienteRepository.save(cliente);

		if (!exists) {
			return new ResponseEntity<>(cliente, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	
	
	
}