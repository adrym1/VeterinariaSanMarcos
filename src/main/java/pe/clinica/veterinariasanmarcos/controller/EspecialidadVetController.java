package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;
import pe.clinica.veterinariasanmarcos.service.EspecialidadVetServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/especialidadvet")
public class EspecialidadVetController extends BaseControllerImpl<EspecialidadVet, EspecialidadVetServiceImpl>{
}
