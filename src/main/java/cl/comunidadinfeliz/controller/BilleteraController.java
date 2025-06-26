package cl.comunidadinfeliz.controller;

import cl.comunidadinfeliz.model.Billetera;
import cl.comunidadinfeliz.service.BilleteraService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billetera")
public class BilleteraController {

    private final BilleteraService billeteraService;

    public BilleteraController(BilleteraService billeteraService) {
        this.billeteraService = billeteraService;
    }

    @GetMapping("/{usuarioId}")
    public Billetera obtenerBilletera(@PathVariable Long usuarioId) {
        return billeteraService.obtenerBilletera(usuarioId);
    }

    @PostMapping("/recargar")
    public Billetera recargar(@RequestParam Long usuarioId, @RequestParam double monto) {
        return billeteraService.recargarSaldo(usuarioId, monto);
    }

    @PostMapping("/descontar")
    public boolean descontar(@RequestParam Long usuarioId, @RequestParam double monto) {
        return billeteraService.descontarSaldo(usuarioId, monto);
    }
}
