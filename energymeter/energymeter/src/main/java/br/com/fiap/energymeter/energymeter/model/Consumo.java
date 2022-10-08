package br.com.fiap.energymeter.energymeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "consumo")
public class Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="id_equipamento")
    private Long idEquipamento;

    @Column(name="data_consumo")
    private LocalDateTime datetime;

    @Column(name = "tensao")
    private BigDecimal tensao;

    @Column(name = "corrente")
    private BigDecimal corrente;

    @Column(name = "KWh")
    private BigDecimal kWh;


}
