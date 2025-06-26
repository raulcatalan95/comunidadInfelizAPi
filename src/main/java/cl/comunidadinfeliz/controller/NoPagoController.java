package cl.comunidadinfeliz.controller;

import cl.comunidadinfeliz.model.NoPago;
import cl.comunidadinfeliz.service.PagoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
@CrossOrigin(origins = "*")
public class NoPagoController {

    private final PagoService pagoService;

    public NoPagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping("/gasto-comun")
    public NoPago pagarGastoComun(@RequestBody NoPago pago) {
        return pagoService.registrarPago("GASTO_COMUN", pago.getMonto(), pago.getDepto());
    }

    @PostMapping("/multa")
    public NoPago pagarMulta(@RequestBody NoPago pago) {
        return pagoService.registrarPago("MULTA", pago.getMonto(), pago.getDepto());
    }

    @GetMapping("/depto/{depto}")
    public List<NoPago> obtenerPagos(@PathVariable String depto) {
        return pagoService.obtenerPagosPorDepto(depto);
    }
}
