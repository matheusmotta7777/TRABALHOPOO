package br.edu.univille.poo2.login.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valorApostado;
    private double multiplicadorAposta;

    @ManyToOne
    @JoinColumn(name = "id_carteira")
    private carteira carteira;

    @ManyToOne
    @JoinColumn(name = "id_formaPGTO")
    private formaPGTO formaPGTO;

}
