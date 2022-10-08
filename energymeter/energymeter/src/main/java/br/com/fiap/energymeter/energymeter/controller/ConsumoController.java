package br.com.fiap.energymeter.energymeter.controller;

import br.com.fiap.energymeter.energymeter.DTO.ConsumoDTO;
import br.com.fiap.energymeter.energymeter.DTO.ResposeFiltroPersonal;
import br.com.fiap.energymeter.energymeter.service.ConsumoService;
import lombok.AllArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "consumo")
public class ConsumoController {

    private final ConsumoService consumoService;

    @GetMapping(value = "all")
    @ResponseStatus(HttpStatus.OK)
    public List<ConsumoDTO> consumoDTOList() throws Exception {

        try {
            return consumoService.getConsumo();
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    @GetMapping(value = "chart")
    @ResponseStatus(HttpStatus.OK)
    public List<ResposeFiltroPersonal> consumoPersonal(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dataFiltro) throws Exception {
        try {
            return consumoService.consumoPersonal(dataFiltro);
        }catch (Exception e){
            throw new Exception(e);
        }

    }
}
