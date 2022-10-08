package br.com.fiap.energymeter.energymeter.mapper;

import java.math.BigDecimal;

public interface ConsumerProjection {

    Integer getHora();
    BigDecimal getKwh();
}
