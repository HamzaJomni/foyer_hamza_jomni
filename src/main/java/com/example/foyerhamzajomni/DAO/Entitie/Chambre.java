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
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numchambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    public Chambre() {

    }
}
