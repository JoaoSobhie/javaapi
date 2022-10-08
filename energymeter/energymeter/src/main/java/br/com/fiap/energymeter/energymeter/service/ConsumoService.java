package br.com.fiap.energymeter.energymeter.service;

import br.com.fiap.energymeter.energymeter.DTO.ConsumoDTO;
import br.com.fiap.energymeter.energymeter.DTO.ResposeFiltroPersonal;

import java.time.LocalDate;
import java.util.List;

public interface ConsumoService {
    List<ConsumoDTO> getConsumo();

    List<ResposeFiltroPersonal> consumoPersonal(LocalDate dataFiltro);
}
