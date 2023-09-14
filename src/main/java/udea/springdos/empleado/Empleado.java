package udea.springdos.empleado;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import udea.springdos.movimientoDinero.MovimientoDinero;

import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Empleado {
    @Id
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String empresa;
    @Column
    private String rol;
    @OneToMany
    private List<MovimientoDinero> movimientoDineros;



}
