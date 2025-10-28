/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.libro;

public class ServicioReporteLibro {
    public void generarReporte(Libro libro) {
        if (libro == null || libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
            System.err.println("Error de Reporte: Datos de libro insuficientes.");
            return;
        }
        System.out.println("Reporte generado para: " + libro.getTitulo());
    }
}