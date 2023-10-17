package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.service.CitaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/citas")
public class CitaController extends BaseControllerImpl<Cita, CitaServiceImpl>{
}
