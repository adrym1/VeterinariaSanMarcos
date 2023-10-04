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
@Table(name="tb_cliente")
public class Cliente extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private int celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;

    @OneToMany(targetEntity = Mascota.class ,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private List<Mascota> mascotaList;

    @OneToMany(targetEntity = Boleta.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private List<Boleta> boletaList;
}
