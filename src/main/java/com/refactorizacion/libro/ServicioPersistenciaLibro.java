/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.libro;

public class ServicioPersistenciaLibro {
    public void guardarEnBaseDeDatos(Libro libro) {
        if (libro == null || libro.getIsbn() == null || libro.getIsbn().isEmpty()) {
            System.err.println("Error de Persistencia: ISBN clave no presente.");
            return;
        }
        System.out.println("Guardando en BD el libro con ISBN: " + libro.getIsbn());
    }
}