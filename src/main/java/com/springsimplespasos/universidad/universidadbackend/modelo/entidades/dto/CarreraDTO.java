package com.springsimplespasos.universidad.universidadbackend.modelo.entidades.dto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraDTO {

    private Integer codigo;
    @NonNull
    @NotEmpty
    @Size(min = 0,max = 80)
    private String nombre;
    @Positive(message = "el valor no puede ser negativo")
    private Integer cantidad_materias;
    @Positive
    private Integer cantidad_anios;

    public CarreraDTO(@NonNull String nombre, Integer cantidad_materias, Integer cantidad_anios) {
        this.nombre = nombre;
        this.cantidad_materias = cantidad_materias;
        this.cantidad_anios = cantidad_anios;
    }
}
