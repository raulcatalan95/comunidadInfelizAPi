package cl.comunidadinfeliz.repository;

import cl.comunidadinfeliz.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByDepto(String depto);
}
