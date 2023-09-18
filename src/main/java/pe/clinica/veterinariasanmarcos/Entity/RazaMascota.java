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
@Table(name="tb_raza_mascota")
public class RazaMascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raza")
    private long id;

    @Column(name = "nom_raza")
    private String raza;

    @OneToMany(targetEntity = Mascota.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_raza")
    private List<Mascota> mascotaList;
}
