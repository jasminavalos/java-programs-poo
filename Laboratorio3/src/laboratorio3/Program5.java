package laboratorio3;
import javax.swing.JOptionPane;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "PROGRAMA QUE HACE OPERACIONES CON ARREGLOS");
		int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas para el arreglo: "));
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas para el arreglo: "));
		int[][] arregloIngresado = new int[filas][columnas];
		
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < columnas; j++)
			{
				arregloIngresado[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición: " +  "[" + (i + 1) + "]" + "," + "[" + (j + 1) + "]"));
			}
		}
		
		int option;
		
		do
		{
			option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n" + 
						"1. Mostrar los elementos ingresados en el arreglo.\n" + 
						"2. Mostrar los números pares del arreglo.\n" + 
						"3. Mostrar los números impare del arreglo.\n" + 
						"4. Mostrar el número mayor del arreglo.\n" +
						"5. Mostrar el número menor del arreglo.\n" + 
						"6. Buscar un número dentro del arreglo.\n" + 
						"7. Ordenar el arreglo de manera ascendente.\n" +
						"8. Salir."));
			
			switch(option)
			{
				case 1:
					mostrarArreglo(arregloIngresado);
					break;
					
				case 2:
					numeroPar(arregloIngresado);
					break;
					
				case 3:
					numeroImpar(arregloIngresado);
					break;
				
				case 4:
					numeroMayor(arregloIngresado);
					break;
					
				case 5:
					numeroMenor(arregloIngresado);
					break;
					
				case 6:
					buscarNumero(arregloIngresado);
					break;
					
				case 7: 
					ordenarArreglo(arregloIngresado);
					break;
					
				case 8:
					return;
			}
			
		}while(option != 8);
		
	}
	
	   public static void mostrarArreglo(int[][] arregloIngresado) {
	    	StringBuilder resultado = new StringBuilder("Arreglo:\n");
	        for (int[] fila : arregloIngresado) {
	            for (int elemento : fila) {
	                resultado.append(elemento).append("\t  "); 
	            }
	            resultado.append("\n\n"); 
	        }
	        JOptionPane.showMessageDialog(null, resultado.toString());
	    }

	    public static void numeroPar(int[][] arregloIngresado) {
	        StringBuilder resultado = new StringBuilder("Números pares:\n");
	        for (int[] fila : arregloIngresado) {
	            for (int elemento : fila) {
	                if (elemento % 2 == 0) {
	                    resultado.append(elemento).append("\t  ");
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, resultado.toString());
	    }

	    public static void numeroImpar(int[][] arregloIngresado) {
	        StringBuilder resultado = new StringBuilder("Números impares:\n");
	        for (int[] fila : arregloIngresado) {
	            for (int elemento : fila) {
	                if (elemento % 2 != 0) {
	                    resultado.append(elemento).append("\t  ");
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, resultado.toString());
	    }

	    public static void numeroMayor(int[][] arregloIngresado) {
	        int mayor = arregloIngresado[0][0];
	        for (int[] fila : arregloIngresado) {
	            for (int elemento : fila) {
	                if (elemento > mayor) {
	                    mayor = elemento;
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
	    }

	    public static void numeroMenor(int[][] arregloIngresado) {
	        int menor = arregloIngresado[0][0];
	        for (int[] fila : arregloIngresado) {
	            for (int elemento : fila) {
	                if (elemento < menor) {
	                    menor = elemento;
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
	    }

	    public static void buscarNumero(int[][] arregloIngresado) {
	        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar:"));
	        boolean encontrado = false;
	        StringBuilder resultado = new StringBuilder("El número " + numero + " se encuentra en las siguientes posiciones:\n");
	        for (int i = 0; i < arregloIngresado.length; i++) {
	            for (int j = 0; j < arregloIngresado[i].length; j++) {
	                if (arregloIngresado[i][j] == numero) {
	                    resultado.append("[").append(i).append("][").append(j).append("]\n");
	                    encontrado = true;
	                }
	            }
	        }
	        if (!encontrado) {
	            JOptionPane.showMessageDialog(null, "El número " + numero + " no se encuentra en el arreglo.");
	        } else {
	            JOptionPane.showMessageDialog(null, resultado.toString());
	        }
	    }

	    public static void ordenarArreglo(int[][] arregloIngresado) {
	    	for (int[] fila : arregloIngresado) {
	            java.util.Arrays.sort(fila);
	        }
	        JOptionPane.showMessageDialog(null, "El arreglo ha sido ordenado de manera ascendente.");
	        mostrarArreglo(arregloIngresado);
		}

	}