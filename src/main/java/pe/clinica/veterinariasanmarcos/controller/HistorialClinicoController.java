package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;
import pe.clinica.veterinariasanmarcos.service.HistorialClinicoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/historialesclinicos")
public class HistorialClinicoController extends BaseControllerImpl<HistorialClinico, HistorialClinicoServiceImpl>{
}
