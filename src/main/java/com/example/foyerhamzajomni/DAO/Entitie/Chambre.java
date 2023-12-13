package com.example.foyerhamzajomni.DAO.Entitie;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="Chambre")
public class Chambre {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idChambre;
     long numchambre;
    @Enumerated(EnumType.STRING)
     TypeChambre typeChambre;

    @ManyToOne
    Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    List<Reservation>reservations = new ArrayList<>();
}
