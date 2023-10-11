package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
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

    @Column(name = "fch_nacimiento")
    private Date fch_naci;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_especialidad")
    private EspecialidadVet especialidad;

}
