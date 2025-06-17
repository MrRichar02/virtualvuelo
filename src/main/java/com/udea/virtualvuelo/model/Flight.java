package com.udea.virtualvuelo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idflight")
    private Long idFlight;
    @Column(name = "nombreavion", nullable = false, length = 80)
    private @NonNull String nombreAvion;
    @Column(name = "numerovuelo", nullable = false, length = 80)
    private @NonNull String numeroVuelo;
    @Column(name = "origen", nullable = false, length = 80)
    private @NonNull String origen;
    @Column(name = "destino", nullable = false, length = 80)
    private @NonNull String destino;
    @Column(name = "capacidad", nullable = false, length = 80)
    private @NonNull int capacidad;
    @Column(name = "rating", nullable = false, length = 80)
    @Min(value = 1, message = "rating should be more or than equal 1")
    @Max(value = 5, message = "rating should be less or than equal 5")
    private @NonNull int rating;
    @Column(name = "planvuelo", nullable = false, length = 80)
    private @NonNull Long planvuelo;
    
    private Boolean cumplido;

}
