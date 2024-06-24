package Laboratorio6;

import javax.swing.JOptionPane;

class EmpleadoAsalariado extends Empleado {
    private final double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        
        
        if (salarioSemanal >= 0.0) {
            this.salarioSemanal = salarioSemanal;
        } else {
            JOptionPane.showMessageDialog(null, "El salario semanal debe ser >= 0.0", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            this.salarioSemanal = 0.0; // Valor por defecto
        }
    
    }

    @Override
    public double ingresos() {
        return salarioSemanal * 4;
    }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\nSalario semanal: $%.2f", super.toString(), salarioSemanal);
    }
}