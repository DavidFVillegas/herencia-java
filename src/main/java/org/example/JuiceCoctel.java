package org.example;

import java.time.LocalDate;
public class JuiceCoctel extends Coctel {

    private LocalDate fechaVencimiento;

    public JuiceCoctel() {
    }
    public JuiceCoctel(String nombre, Long precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters and Setters

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
