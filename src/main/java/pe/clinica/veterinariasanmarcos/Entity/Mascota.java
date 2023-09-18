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
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fch_nacimiento")
    private Date fch_naci;

    @OneToMany(targetEntity = Cita.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_mascota")
    private List<Cita> citaList;
}
