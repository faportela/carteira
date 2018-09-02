package br.com.carteira.controller;

import java.math.BigDecimal;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.carteira.model.Operacao;
import br.com.carteira.repository.OperacaoRepository;

@RestController
public class OperacaoController {

	@Autowired
	OperacaoRepository repository;
	
	@RequestMapping("/salvar")
	public String process() {
		repository.save(new Operacao("ITSA4", "COMPRA", Calendar.getInstance(), new BigDecimal(9.33), 600));
		repository.save(new Operacao("TAEE11", "COMPRA", Calendar.getInstance(), new BigDecimal(19.93), 200));
		repository.save(new Operacao("PSSA3", "COMPRA", Calendar.getInstance(), new BigDecimal(46.70), 100));
		return listarOperacoes();
	}
	
	@RequestMapping("/listarOperacoes")
	public String listarOperacoes() {

		String result = "<html>";
		
		for (Operacao operacao : repository.findAll()) {
			result += "<div>" + operacao.toString()	+ "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/remover")
	public String removerOperacao(@RequestParam("id") long id) {

		repository.deleteById(id);
		
		return listarOperacoes();
	}
	
}
