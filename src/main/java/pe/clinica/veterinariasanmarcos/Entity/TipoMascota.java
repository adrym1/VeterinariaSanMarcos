package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_tipo_mascota")
public class TipoMascota extends Base {

    //Aquí puede tener: --- Tipo de mascotas(perros, gatos, loros, conejos, etc)
    @Column(name = "nom_tipo")
    private String tipo;

    @OneToMany(targetEntity = Mascota.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_mascota")
    private List<Mascota> mascotaList;
}
