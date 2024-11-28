package br.edu.univille.poo2.login.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class atributos_aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "atributos_aposta_tipo",
            joinColumns = @JoinColumn(name = "id_atributos_aposta"),
            inverseJoinColumns = @JoinColumn(name = "id_tipo_aposta"))
    private Set<tipo_aposta> tipoAposta;

    private double multiplicadorAposta;
}
