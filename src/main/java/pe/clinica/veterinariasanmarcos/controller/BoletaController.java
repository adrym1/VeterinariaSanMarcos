package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.Boleta;
import pe.clinica.veterinariasanmarcos.service.BoletaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/boletas")

public class BoletaController extends BaseControllerImpl<Boleta, BoletaServiceImpl>{

}
