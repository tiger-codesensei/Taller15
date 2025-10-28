/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.producto;

public class ServicioCalculoPrecio {
    private static final double IMPUESTO = 0.19;

    public double calcularPrecioFinal(Producto producto) {
        if (producto == null || producto.getPrecioBase() < 0) {
             System.err.println("Error de Cálculo: Precio base inválido.");
             return 0.0;
        }
        double impuesto = producto.getPrecioBase() * IMPUESTO;
        return producto.getPrecioBase() + impuesto;
    }
}