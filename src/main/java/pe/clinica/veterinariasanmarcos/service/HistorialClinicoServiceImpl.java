package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.HistorialClinico;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.HistorialClinicoRepository;

@Service
public class HistorialClinicoServiceImpl extends BaseServiceImpl<HistorialClinico,Long> implements HistorialClinicoService {
    @Autowired
    private HistorialClinicoRepository historialClinicoRepository;

    public HistorialClinicoServiceImpl(BaseRepository<HistorialClinico,Long>baseRepository){super(baseRepository);}

}
