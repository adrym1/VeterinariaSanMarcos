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
@Table(name="tb_cita")
public class Cita extends Base {

    @Column(name = "fch_cita")
    private Date fecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_trabajador")
    private Trabajador trabajador;

}
