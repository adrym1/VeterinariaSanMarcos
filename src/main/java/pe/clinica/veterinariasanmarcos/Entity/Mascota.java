package pe.clinica.veterinariasanmarcos.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_mascota")
public class Mascota extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fch_nacimiento")
    private Date fch_naci;

    @OneToMany(targetEntity = Cita.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mascota")
    private List<Cita> citaList;

    @OneToMany(targetEntity = HistorialClinico.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mascota")
    private List<HistorialClinico> historialClinicoList;
}
