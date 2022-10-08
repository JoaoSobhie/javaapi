package br.com.fiap.energymeter.energymeter.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumoDTO {

    private Long id;

    private Long idEquipamento;

    private LocalDateTime datetime;

    private BigDecimal tensao;

    private BigDecimal corrente;

    private BigDecimal kWh;
}
