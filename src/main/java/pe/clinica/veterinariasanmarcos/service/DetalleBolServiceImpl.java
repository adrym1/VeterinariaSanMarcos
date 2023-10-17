package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.DetalleBol;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.DetalleBolRepository;


@Service
public class DetalleBolServiceImpl extends BaseServiceImpl<DetalleBol,Long> implements DetalleBolService{

    @Autowired
    private DetalleBolRepository detalleBolRepository;

    public DetalleBolServiceImpl(BaseRepository<DetalleBol,Long>baseRepository){super(baseRepository);}

}
