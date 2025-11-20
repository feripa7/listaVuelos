package org.example;

import org.example.entities.Vuelo;
import org.example.utils.VueloUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    private static final LocalDate FECHA_INICIO = null; //LocalDate.of(2025, 5, 20) null
    private static final LocalDate FECHA_FINAL = null; //LocalDate.of(2025, 6, 10) null

    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<>();

        //Le pedimos a chatGPT 10 ejemplos

        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "New York",
                LocalDate.of(2025, 5, 20), LocalDate.of(2025, 5, 21)));
        vuelos.add(new Vuelo(2, "T002-X", "Turkish", "Barcelona", "Buenos Aires",
                LocalDate.of(2025, 5, 25), LocalDate.of(2025, 5, 26)));
        vuelos.add(new Vuelo(3, "A003-Y", "Air France", "Paris", "Tokyo",
                LocalDate.of(2025, 6, 5), LocalDate.of(2025, 6, 6)));
        vuelos.add(new Vuelo(4, "L004-Z", "Lufthansa", "Berlin", "Madrid",
                LocalDate.of(2025, 6, 12), LocalDate.of(2025, 6, 13)));
        vuelos.add(new Vuelo(5, "K005-W", "KLM", "Amsterdam", "London",
                LocalDate.of(2025, 5, 30), LocalDate.of(2025, 5, 30)));
        vuelos.add(new Vuelo(6, "E006-V", "Emirates", "Dubai", "Sydney",
                LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 2)));
        vuelos.add(new Vuelo(7, "Q007-X", "Qatar Airways", "Doha", "New York",
                LocalDate.of(2025, 5, 22), LocalDate.of(2025, 5, 23)));
        vuelos.add(new Vuelo(8, "S008-Y", "Swiss", "Zurich", "Rome",
                LocalDate.of(2025, 5, 28), LocalDate.of(2025, 5, 28)));
        vuelos.add(new Vuelo(9, "B009-Z", "British Airways", "London", "Madrid",
                LocalDate.of(2025, 5, 21), LocalDate.of(2025, 5, 21)));
        vuelos.add(new Vuelo(10, "C010-W", "China Airlines", "Beijing", "San Francisco",
                LocalDate.of(2025, 6, 8), LocalDate.of(2025, 6, 9)));

        List<Vuelo> vuelosFiltrados = VueloUtils.filtrarVuelos(vuelos, FECHA_INICIO, FECHA_FINAL);
        vuelosFiltrados.forEach(System.out::println);

    }


}