package cl.comunidadinfeliz.repository;

import cl.comunidadinfeliz.model.NoPago;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoPagoRepository extends JpaRepository<NoPago, Long> {
    List<NoPago> findByDepto(String depto);
}
