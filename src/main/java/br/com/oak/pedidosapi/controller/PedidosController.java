package br.com.oak.pedidosapi.controller;

import br.com.oak.pedidosapi.controller.response.RecuperarPedidoPorIdResponse;
import br.com.oak.pedidosapi.model.jpa.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

  @PersistenceContext
  private EntityManager entityManager;

  @GetMapping("/{id}")
  public ResponseEntity<RecuperarPedidoPorIdResponse> recuperarPedidoPorId(@PathVariable @NotNull Long id) {
    Pedido pedido = entityManager.find(Pedido.class, id);
    return  ResponseEntity.ok(new RecuperarPedidoPorIdResponse(pedido));
  }
}
