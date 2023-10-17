package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;
import pe.clinica.veterinariasanmarcos.service.DetalleBolServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/detalleboletas")
public class DetalleBolController extends BaseControllerImpl<DetalleBol, DetalleBolServiceImpl>{
}
