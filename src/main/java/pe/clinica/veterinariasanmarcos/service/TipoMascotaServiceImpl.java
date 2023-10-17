package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.TipoMascota;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.TipoMascotaRepository;

@Service
public class TipoMascotaServiceImpl extends BaseServiceImpl<TipoMascota,Long> implements TipoMascotaService{

    @Autowired
    private TipoMascotaRepository tipoMascotaRepository;

    public TipoMascotaServiceImpl(BaseRepository<TipoMascota,Long>baseRepository){super(baseRepository);}

}
