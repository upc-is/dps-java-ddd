package pe.edu.upc.ddd.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// Objet Value
@Embeddable
public class Direccion {
    @Column(length = 30)
    private String calle;

    @Column(length = 10)
    private String numero;

    @Column(length = 30)
    private String urbanizacion;

    @Column(length = 3)
    private String manzana;

    @Column(length = 3)
    private String lote;
}
