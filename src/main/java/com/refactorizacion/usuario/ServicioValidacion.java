/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.usuario;

public class ServicioValidacion {
    
    public boolean validarEmail(Usuario usuario) {
        if (usuario == null || usuario.getEmail() == null) return false;
        // Validación: debe contener '@'
        return usuario.getEmail().contains("@");
    }

    public boolean validarContrasenaSegura(Usuario usuario) {
        if (usuario == null || usuario.getContrasena() == null) return false;
        // Validación: longitud mínima de 8
        return usuario.getContrasena().length() >= 8;
    }
}