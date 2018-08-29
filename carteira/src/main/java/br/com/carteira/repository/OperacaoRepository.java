package br.com.carteira.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.carteira.model.Operacao;

public interface OperacaoRepository extends CrudRepository<Operacao, Long> {

}
