package cl.comunidadinfeliz.controller;

import cl.comunidadinfeliz.model.Pago;
import cl.comunidadinfeliz.service.PagoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*") // Permite que Vercel se comunique con el backend
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping("/gasto-comun")
    public Pago pagarGastoComun(@RequestBody Pago pago) {
        return pagoService.registrarPago("GASTO_COMUN", pago.getMonto(), pago.getDepto());
    }

    @PostMapping("/multa")
    public Pago pagarMulta(@RequestBody Pago pago) {
        return pagoService.registrarPago("MULTA", pago.getMonto(), pago.getDepto());
    }

    @GetMapping("/depto/{depto}")
    public List<Pago> obtenerPagos(@PathVariable String depto) {
        return pagoService.obtenerPagosPorDepto(depto);
    }
}
