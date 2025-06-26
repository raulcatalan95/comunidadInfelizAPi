package cl.comunidadinfeliz.service;

import cl.comunidadinfeliz.model.Pago;
import cl.comunidadinfeliz.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {

    private final PagoRepository pagoRepository;

    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    public Pago registrarPago(String tipo, Double monto, String depto) {
        return pagoRepository.save(new Pago(tipo, monto, depto));
    }

    public List<Pago> obtenerPagosPorDepto(String depto) {
        return pagoRepository.findByDepto(depto);
    }
}
