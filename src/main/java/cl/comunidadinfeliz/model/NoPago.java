package cl.comunidadinfeliz.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pagos")
public class NoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;

    private LocalDate fechaPago;

    private String descripcion;

    private String depto; // <- Nuevo campo

    public NoPago() {
    }

    // Este constructor coincide con lo que se usa en tu servicio
    public NoPago(String descripcion, Double monto, String depto) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.fechaPago = LocalDate.now(); // o pásalo como parámetro si prefieres
        this.depto = depto;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public Double getMonto() {
        return monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDepto() {
        return depto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
}
