package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_especialidad_vet")
public class EspecialidadVet extends Base {
    @Column(name = "nom_especialidad")
    private String especialidad;
}
