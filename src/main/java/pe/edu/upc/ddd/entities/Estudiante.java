package pe.edu.upc.ddd.entities;

// upper Camel Case (Class), lower Camel Case (At y Meth)
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class Estudiante extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 9, nullable = false)
    private String tiu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;
}
