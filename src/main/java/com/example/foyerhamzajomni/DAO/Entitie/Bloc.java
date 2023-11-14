package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


@Entity
@Table(name="Bloc")
public class Bloc {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    public Bloc() {

    }
}