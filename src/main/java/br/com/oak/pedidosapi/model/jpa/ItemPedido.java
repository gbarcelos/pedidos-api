package br.com.oak.pedidosapi.model.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
public class ItemPedido {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Positive
  private Integer quantidade;

  private String descricao;

  private BigDecimal valorUnitario;

  private BigDecimal valorTotal;

  @ManyToOne(optional=false)
  private Pedido pedido;

}
