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
public class saque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "id_destinatario")
    private User destinatario;

    @ManyToOne
    @JoinColumn(name = "carteira_id") // Define a chave estrangeira para o relacionamento
    private carteira carteira;
}
