package br.com.lupus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lupus.api.model.OrdemServico;

public interface IOrderServiceRepository extends JpaRepository<OrdemServico, Long> {

}
