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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String cpf;
    private String dataNascimento;
    private String password;
    private boolean active;


    @OneToOne(mappedBy = "user")
    private carteira carteira;
    @OneToOne
    private UserRole role;

}
