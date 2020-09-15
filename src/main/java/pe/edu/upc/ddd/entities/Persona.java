package pe.edu.upc.ddd.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public abstract class Persona {
    @Column(length = 40, nullable = false)
    private String apellidos;

    @Column(length = 40, nullable = false)
    private String nombres;

    @Column(name = "numero_documento", length = 12, nullable = false)
    private String numeroDocumento;

    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Embedded
    private Direccion direccion;
}
