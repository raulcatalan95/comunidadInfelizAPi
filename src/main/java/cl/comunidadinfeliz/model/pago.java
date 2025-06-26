package cl.comunidadinfeliz.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // "GASTO_COMUN" o "MULTA"
    private Double monto;
    private String depto;
    private LocalDateTime fechaPago;

    // Constructor vacío
    public Pago() {}

    // Constructor completo
    public Pago(String tipo, Double monto, String depto) {
        this.tipo = tipo;
        this.monto = monto;
        this.depto = depto;
        this.fechaPago = LocalDateTime.now();
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }

    public String getDepto() { return depto; }
    public void setDepto(String depto) { this.depto = depto; }

    public LocalDateTime getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDateTime fechaPago) { this.fechaPago = fechaPago; }
}
