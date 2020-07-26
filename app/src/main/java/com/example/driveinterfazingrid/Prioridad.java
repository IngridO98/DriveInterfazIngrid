package com.example.driveinterfazingrid;

public class Prioridad {

    private String Titulo;
    private String Mensaje;
    private int fotoIcon;
    private int fotoRegtangular;
    private int fotoperfil;

    public Prioridad(){

    }

    public Prioridad(String titulo, String mensaje, int fotoIcon, int fotoRegtangular, int fotoperfil) {
        this.Titulo = titulo;
        this.Mensaje = mensaje;
        this.fotoIcon = fotoIcon;
        this.fotoRegtangular = fotoRegtangular;
        this.fotoperfil = fotoperfil;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public int getFotoIcon() {
        return fotoIcon;
    }

    public void setFotoIcon(int fotoIcon) {
        this.fotoIcon = fotoIcon;
    }

    public int getFotoRegtangular() {
        return fotoRegtangular;
    }

    public void setFotoRegtangular(int fotoRegtangular) {
        this.fotoRegtangular = fotoRegtangular;
    }

    public int getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(int fotoperfil) {
        this.fotoperfil = fotoperfil;
    }
}
