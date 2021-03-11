package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Pagamento;
// nao precisa de repository para subclasses
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
