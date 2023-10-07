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
@Table(name="tb_boleta")
public class Boleta extends Base {

    @Column(name = "fecha")
    private Date fch_boleta;

    @OneToMany(targetEntity = DetalleBol.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_boleta")
    private List<DetalleBol> detalleBolList;

    @ManyToOne()
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;
}
