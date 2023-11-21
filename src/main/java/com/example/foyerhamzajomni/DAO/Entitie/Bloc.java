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

@Table(name="Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idBloc;
     String nomBloc;
     long capaciteBloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")//mappedBy toujours le mettre dans le child
    List<Chambre> chambre = new ArrayList<>();
    
    @ManyToOne
    Foyer foyer;
}