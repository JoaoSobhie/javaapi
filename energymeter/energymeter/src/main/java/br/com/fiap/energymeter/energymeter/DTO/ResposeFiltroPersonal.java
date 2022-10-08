package br.com.fiap.energymeter.energymeter.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResposeFiltroPersonal {
  private Integer hora;
  private BigDecimal kwh;
}
