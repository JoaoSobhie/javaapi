package br.com.fiap.energymeter.energymeter.repository;

import br.com.fiap.energymeter.energymeter.DTO.ResposeFiltroPersonal;
import br.com.fiap.energymeter.energymeter.mapper.ConsumerProjection;
import br.com.fiap.energymeter.energymeter.model.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long> {


    //List<Objects> buscaPersonalizada(String data);

    @Query(value = "Select Extract(hour from data_consumo) as hora, sum(kWh) as kWh from consumo where date(data_consumo) = :dataFiltro group by Extract(hour from data_consumo) ", nativeQuery = true)
    List<ConsumerProjection> filtroConsumo(LocalDate dataFiltro);
}
