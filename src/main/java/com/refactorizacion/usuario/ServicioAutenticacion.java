/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refactorizacion.usuario;

public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        if (usuario == null || contrasenaIngresada == null) {
            System.err.println("Autenticación fallida: credenciales nulas.");
            return false;
        }
        return usuario.getContrasena().equals(contrasenaIngresada);
    }
}