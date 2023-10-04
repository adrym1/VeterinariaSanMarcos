package pe.clinica.veterinariasanmarcos.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.List;
/*
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_producto")
public class Producto extends Base {

    @Column(name = "nombre")
    private String nombrepro;

    @Column(name = "precio")
    private double precio;

    @OneToMany(targetEntity = DetalleBol.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private List<DetalleBol> detalleBolList;
}
*/
