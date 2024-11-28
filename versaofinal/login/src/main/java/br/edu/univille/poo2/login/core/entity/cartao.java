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
public class cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCartao;
    private String titular;
    private String cvv;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userDono;
}
