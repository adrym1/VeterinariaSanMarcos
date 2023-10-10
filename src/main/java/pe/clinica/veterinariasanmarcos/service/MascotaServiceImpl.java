package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.MascotaRepository;

import java.util.List;

@Service
public class MascotaServiceImpl extends BaseServiceImpl<Mascota, Long> implements MascotaService {
    //@Autowired
    private MascotaRepository mascotaRepository;

    public MascotaServiceImpl(BaseRepository<Mascota, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Mascota> findAll() throws Exception {
        return null;
    }
}
