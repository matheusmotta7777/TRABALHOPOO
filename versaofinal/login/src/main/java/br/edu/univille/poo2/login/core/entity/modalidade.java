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
public class modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SportEnum modality;

    public enum SportEnum {
        FUTEBOL, VOLEI, BASQUETE, BASEBALL, FUTEBOL_AMERICANO, TENIS_DE_MESA
    }
}
