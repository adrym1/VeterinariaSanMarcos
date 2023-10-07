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
@Table(name = "tb_especialidad_vet")
public class EspecialidadVet extends Base {
    @Column(name = "nom_especialidad")
    private String especialidad;

}
