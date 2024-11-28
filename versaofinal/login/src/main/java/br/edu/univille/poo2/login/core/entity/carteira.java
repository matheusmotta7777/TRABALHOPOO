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
public class carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "carteira")
    private Set<deposit> depositos;

    @OneToMany(mappedBy = "carteira")
    private Set<saque> saques;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
