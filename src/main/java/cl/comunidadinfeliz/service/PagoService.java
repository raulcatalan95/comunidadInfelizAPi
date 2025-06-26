package cl.comunidadinfeliz.service;

import cl.comunidadinfeliz.model.NoPago;
import cl.comunidadinfeliz.repository.PagoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PagoService {

    private final NoPagoRepository pagoRepository;

    public PagoService(NoPagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    public NoPago registrarPago(String tipo, Double monto, String depto) {
        return pagoRepository.save(new NoPago(tipo, monto, depto));
    }

    public List<NoPago> obtenerPagosPorDepto(String depto) {
        return NopagoRepository.findByDepto(depto);
    }
}
