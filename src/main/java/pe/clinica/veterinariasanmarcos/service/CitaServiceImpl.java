package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Cita;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.CitaRepository;

@Service
public class CitaServiceImpl extends BaseServiceImpl<Cita,Long> implements CitaService{
    @Autowired
    private CitaRepository citaRepository;
    
    public CitaServiceImpl(BaseRepository<Cita,Long> baseRepository){super(baseRepository);}

}
