package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Boleta;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.BoletaRepository;

@Service
public class BoletaServiceImpl extends BaseServiceImpl<Boleta,Long> implements BoletaService {
    @Autowired
    private BoletaRepository boletaRepository;

    public BoletaServiceImpl(BaseRepository<Boleta,Long> baseRepository){super(baseRepository);}
}
