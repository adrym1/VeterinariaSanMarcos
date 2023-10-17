package pe.clinica.veterinariasanmarcos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;
import pe.clinica.veterinariasanmarcos.service.TipoMascotaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/clinica/tipomascotas")
public class TipoMascotaController extends BaseControllerImpl<TipoMascota, TipoMascotaServiceImpl>{
}
