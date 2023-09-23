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
@Table(name="tb_trabajador")
public class Trabajador extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "celular")
    private int celular;

    @Column(name = "fch_nacimiento")
    private Date fch_naci;

    @Column(name = "correo")
    private String correo;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "clave")
    private String clave;

    @OneToMany(targetEntity = Cita.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_trabajador")
    private List<Cita> citasList;
}
