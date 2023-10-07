package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_veterinario")
public class Veterinario extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private int celular;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_especialidad")
    private EspecialidadVet especialidad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_veterinario")
    private List<Cita> citaList;
}
