package br.com.fiap.energymeter.energymeter.serviceImpl;

import br.com.fiap.energymeter.energymeter.DTO.ConsumoDTO;
import br.com.fiap.energymeter.energymeter.DTO.ResposeFiltroPersonal;
import br.com.fiap.energymeter.energymeter.model.Consumo;
import br.com.fiap.energymeter.energymeter.repository.ConsumoRepository;
import br.com.fiap.energymeter.energymeter.service.ConsumoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Service
public class ConsumoServiceImpl implements ConsumoService {
    private final ConsumoRepository consumoRepository;

    @Override
    public List<ConsumoDTO> getConsumo() {

        List<ConsumoDTO> consumoDTOList = new ArrayList<>();

        consumoRepository.findAll().forEach(c->{

            consumoDTOList.add(ConsumoDTO.builder()
                    .id(c.getId())
                    .corrente(c.getCorrente())
                    .kWh(c.getKWh())
                    .datetime(c.getDatetime())
                    .idEquipamento(c.getIdEquipamento())
                    .tensao(c.getTensao())
                    .corrente(c.getCorrente())
                    .build());
        });

        return consumoDTOList;

    }

    @Override
    public List<ResposeFiltroPersonal> consumoPersonal(LocalDate dataFiltro) {

        List<ResposeFiltroPersonal> resposeFiltroPersonals = new ArrayList<>();

        consumoRepository.filtroConsumo(dataFiltro).forEach(c->{
            resposeFiltroPersonals.add(ResposeFiltroPersonal.builder().hora(c.getHora()).kwh(c.getKwh()).build());
        });

        return resposeFiltroPersonals;
    }
}
