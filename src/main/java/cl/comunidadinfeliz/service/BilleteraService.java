package cl.comunidadinfeliz.service;

import cl.comunidadinfeliz.model.Billetera;
import cl.comunidadinfeliz.repository.BilleteraRepository;
import org.springframework.stereotype.Service;


@Service
public class BilleteraService {

    private final BilleteraRepository billeteraRepository;

    public BilleteraService(BilleteraRepository billeteraRepository) {
        this.billeteraRepository = billeteraRepository;
    }

    public Billetera obtenerBilletera(Long usuarioId) {
        return billeteraRepository.findByUsuarioId(usuarioId)
                .orElseGet(() -> billeteraRepository.save(new Billetera(usuarioId, 0)));
    }

    public Billetera recargarSaldo(Long usuarioId, double monto) {
        Billetera billetera = obtenerBilletera(usuarioId);
        billetera.setSaldo(billetera.getSaldo() + monto);
        return billeteraRepository.save(billetera);
    }

    public boolean descontarSaldo(Long usuarioId, double monto) {
        Billetera billetera = obtenerBilletera(usuarioId);
        if (billetera.getSaldo() >= monto) {
            billetera.setSaldo(billetera.getSaldo() - monto);
            billeteraRepository.save(billetera);
            return true;
        }
        return false;
    }
}

