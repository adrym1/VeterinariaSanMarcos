package pe.clinica.veterinariasanmarcos.repository;

import org.springframework.stereotype.Repository;
import pe.clinica.veterinariasanmarcos.Entity.Mascota;

@Repository
public interface MascotaRepository extends BaseRepository<Mascota, Long> {
}
