package udea.springdos.movimientoDinero;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import udea.springdos.empleado.Empleado;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "monto_del_movimineto")
    private Double montoDelMovimiento;
    @Column(name = "montos_positivos_y_negativos")
    private Double montosPositivosNegativos;
    @Column(name = "concepto_movimiento")
    private String conceptoMovimiento;
    @ManyToOne
    private Empleado empleado;


}
