package pe.edu.upc.ddd.entities;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nombre;
}
