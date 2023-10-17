package pe.clinica.veterinariasanmarcos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.clinica.veterinariasanmarcos.Entity.Veterinario;
import pe.clinica.veterinariasanmarcos.repository.BaseRepository;
import pe.clinica.veterinariasanmarcos.repository.VeterinarioRepository;

@Service
public class VeterinarioServiceImpl extends BaseServiceImpl<Veterinario,Long> implements VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public VeterinarioServiceImpl (BaseRepository<Veterinario,Long>baseRepository){super(baseRepository);}

}
