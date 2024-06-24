package Laboratorio2;

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasTrabajadas = 0;
        double tarifaHoras = 0;
        double sueldoBruto = 0;

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("Ingrese el número de horas que trabajó el empleado %s: ", (i + 1));
            horasTrabajadas = input.nextInt();

            System.out.printf("Ingrese la tarifa por horas del empleado %s: ", (i + 1));
            tarifaHoras = input.nextDouble();

            sueldoBruto = calcularSueldo(horasTrabajadas, tarifaHoras);
            System.out.printf("Sueldo bruto del empleado %s: %.2f$\n", (i + 1), sueldoBruto);
        }

        input.close();
    }

    public static double calcularSueldo(int horasTrabajadas, double tarifaHoras) 
    {
        int horasNormales = 40;
        double sueldoBruto;

        if (horasTrabajadas <= horasNormales) 
        {
            sueldoBruto = horasTrabajadas * tarifaHoras;
        }
        else 
        {
            int horasExtras = horasTrabajadas - horasNormales;
            sueldoBruto = (horasNormales * tarifaHoras) + (horasExtras * tarifaHoras * 1.5);
        }

        return sueldoBruto;
    }
}
