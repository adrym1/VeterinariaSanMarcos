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
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_boleta")
    private long id;

    @Column(name = "fecha")
    private Date fch_boleta;

    @OneToMany(targetEntity = DetalleBol.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_boleta")
    private List<DetalleBol> detalleBolList;
}
