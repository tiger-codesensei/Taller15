/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.producto;

public class ServicioEtiquetadoProducto {
    public void generarEtiqueta(Producto producto) {
        if (producto == null || producto.getNombre().isEmpty()) {
            System.err.println("Error de Etiquetado: Nombre de producto faltante.");
            return;
        }
        System.out.println("Etiqueta impresa para: " + producto.getNombre());
    }
}