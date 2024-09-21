package br.com.oak.pedidosapi.model.jpa;

import br.com.oak.pedidosapi.model.Status;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private LocalDateTime dataHora;

  @NotNull
  @Enumerated(EnumType.STRING)
  private Status status;

  private BigDecimal valorTotal;

  @OneToMany(cascade= CascadeType.PERSIST, mappedBy="pedido")
  private List<ItemPedido> itens = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public BigDecimal getValorTotal() {
    return valorTotal;
  }
}
