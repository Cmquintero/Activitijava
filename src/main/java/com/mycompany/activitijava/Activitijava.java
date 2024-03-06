package com.mycompany.activitijava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Activitijava {

    public static void main(String[] args) {
        
        Libro[] libros = new Libro[3]; 

        
        libros[0] = new Libro("Cien años de soledad", "Gabriel García Márquez", "Juan Pérez");
        libros[1] = new Libro("1984", "George Orwell", "Ana López");
        libros[2] = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Carlos Gómez");

       
        libros[0].setHoraSacado(LocalDateTime.now());

        
        libros[1].setHoraDevuelto(LocalDateTime.now());

        
        for (int i = 0; i < libros.length; i++) {
            libros[i].imprimirInfo();
        }
    }
}

class Libro {
    private String nombre;
    private String autor;
    private String usuario; 
    private LocalDateTime horaSacado;
    private LocalDateTime horaDevuelto;

    public Libro(String nombre, String autor, String usuario) {
        this.nombre = nombre;
        this.autor = autor;
        this.usuario = usuario;
        this.horaSacado = null; // Inicialmente no se ha sacado el libro
        this.horaDevuelto = null; // Inicialmente no se ha devuelto el libro
    }

    public void setHoraSacado(LocalDateTime horaSacado) {
        this.horaSacado = horaSacado;
    }

    public LocalDateTime getHoraSacado() {
        return horaSacado;
    }

    public void setHoraDevuelto(LocalDateTime horaDevuelto) {
        this.horaDevuelto = horaDevuelto;
    }

    public LocalDateTime getHoraDevuelto() {
        return horaDevuelto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void imprimirInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy"); 
        
        String horaSacadoStr = horaSacado != null ? horaSacado.format(formatter) : "No sacado";
        String horaDevueltoStr = horaDevuelto != null ? horaDevuelto.format(formatter) : "No devuelto";
        
        System.out.println("Nombre del Libro: " + nombre + ", Autor: " + autor + ", Usuario: " + usuario +
                ", Hora Sacado: " + horaSacadoStr + ", Hora Devuelto: " + horaDevueltoStr);
    }
}