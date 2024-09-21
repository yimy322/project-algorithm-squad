package prueba;

import java.util.Arrays;
import javax.swing.JOptionPane;

import logica.*;
public class Pruebas {
	public static void main(String[] args) {
		int[] arr = {8,56,3,7,3,8,3,65,8};
		System.out.println(Arrays.toString(arr));
		
		Ordenamiento ordenar = new Ordenamiento();
		Busqueda buscar = new Busqueda();
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero a buscar"));
		
		ordenar.insertionSort(arr);
		int cant = buscar.recurrencia(arr, valor);
		
		JOptionPane.showMessageDialog(null, "Arreglo: "+Arrays.toString(arr)+
				"\nValor buscado: "+valor+
				"\nRecurrecia en el arreglo: "+cant);
		
	}
}
