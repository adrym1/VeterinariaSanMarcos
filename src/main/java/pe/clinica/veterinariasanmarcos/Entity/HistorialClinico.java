package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_historial_clinico")
public class HistorialClinico extends Base {
    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "result_exam")
    private String result_examenes;

    @Column(name = "tratamiento")
    private String tratamientos;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "fecha")
    private Date fecha;
}
