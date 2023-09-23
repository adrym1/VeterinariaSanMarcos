package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;
import pe.clinica.veterinariasanmarcos.service.MascotaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/mascotas")
public class MascotaController extends BaseControllerImpl<Mascota, MascotaServiceImpl> {
}
