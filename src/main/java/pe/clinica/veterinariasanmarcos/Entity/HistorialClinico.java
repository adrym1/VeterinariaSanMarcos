package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_historial_clinico")
public class HistorialClinico extends Base {
    private String descripcion;
    private String result_examenes;
    private String tratamientos;
    private String observaciones;
}
