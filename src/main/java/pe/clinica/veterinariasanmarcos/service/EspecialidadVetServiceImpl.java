package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.EspecialidadVet;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.EspecialidadVetRepository;

@Service
public class EspecialidadVetServiceImpl extends BaseServiceImpl<EspecialidadVet,Long> implements EspecialidadVetService{

    @Autowired
    private EspecialidadVetRepository especialidadVetRepository;

    public EspecialidadVetServiceImpl(BaseRepository<EspecialidadVet,Long> baseRepository){super(baseRepository);}
}
