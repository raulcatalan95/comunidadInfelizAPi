package cl.comunidadinfeliz.model;

import jakarta.persistence.*;

@Entity
public class Billetera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId; // o rut, si estás usando eso para identificar

    private double saldo;

    // Constructores
    public Billetera() {}

    public Billetera(Long usuarioId, double saldo) {
        this.usuarioId = usuarioId;
        this.saldo = saldo;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
