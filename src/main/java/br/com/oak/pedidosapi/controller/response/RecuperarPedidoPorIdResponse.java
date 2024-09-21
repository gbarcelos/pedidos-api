package br.com.oak.pedidosapi.controller.response;

import br.com.oak.pedidosapi.model.jpa.Pedido;
import java.math.BigDecimal;

public class RecuperarPedidoPorIdResponse {

  private final Long id;
  private final BigDecimal valorTotal;

  public RecuperarPedidoPorIdResponse(Pedido pedido) {
    this.id = pedido.getId();
    this.valorTotal = pedido.getValorTotal();
  }

  public Long getId() {
    return id;
  }

  public BigDecimal getValorTotal() {
    return valorTotal;
  }
}
