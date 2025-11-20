package org.example.utils;

import org.example.entities.Vuelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class VueloUtils {

    //Clase utilitaria con el método para filtrar

    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, LocalDate fechaInicio, LocalDate fechaFin) {
        return vuelos.stream()
                .filter(v -> {
                    //En caso de que nos manden ambas fechas, este if nos devuelve las que quedan dentro del rango
                    if (fechaInicio != null && fechaFin != null) {
                        return !v.getFechaSalida().isBefore(fechaInicio) &&
                                !v.getFechaSalida().isAfter(fechaFin);
                        //Si solo nos mandan la de inicio, devolvemos desde esa fecha hasta el final
                    } else if (fechaInicio != null) {
                        return !v.getFechaSalida().isBefore(fechaInicio);
                        //Si solo nos mandan la de final, devolvemos hasta esa fecha
                    } else if (fechaFin != null) {
                        return !v.getFechaSalida().isAfter(fechaFin);
                        //Si ambas fechas son nulas, devolvemos todos los vuelos
                    } else {
                        return true;
                    }
                })
                //Ordenamos los vuelos de más antiguo a más reciente
                .sorted((v1, v2) -> v1.getFechaSalida().compareTo(v2.getFechaSalida()))
                .collect(Collectors.toList());
    }
}


