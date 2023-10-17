package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;
import pe.clinica.veterinariasanmarcos.service.VeterinarioServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/veterinarios")
public class VeterinarioController extends BaseControllerImpl<Veterinario, VeterinarioServiceImpl>{
}
