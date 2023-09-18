package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fch_cita")
    private Date fecha;

    @ManyToOne(targetEntity = Doctor.class)
    private Doctor doctor;

    @ManyToOne(targetEntity = Mascota.class)
    private Mascota mascota;

}
