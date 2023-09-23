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
@Table(name="tb_tipo_producto")
public class TipoProducto extends Base {

    //Aquí puede tener: --- Alimento de mascotas(cachorros, adultos,comida especial o dietetica)
    // --- Vacunas --- Juguetes y accesorios --- productos de higiene
    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(targetEntity = Producto.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_producto")
    private List<Producto> productoList;
}
