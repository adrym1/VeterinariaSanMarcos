package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Trabajador;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.TrabajadorRepository;

@Service
public class TrabajadorServiceImpl extends BaseServiceImpl<Trabajador,Long> implements TrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public TrabajadorServiceImpl(BaseRepository<Trabajador,Long>baseRepository){super(baseRepository);}
}
