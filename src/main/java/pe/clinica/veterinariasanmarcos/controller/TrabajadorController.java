package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;
import pe.clinica.veterinariasanmarcos.service.TrabajadorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/trabajadores")
public class TrabajadorController extends BaseControllerImpl<Trabajador, TrabajadorServiceImpl>{
}
