package logica;

import javax.swing.JOptionPane;

public class Busqueda {
	private int buscarPrimero(int[] arr, int valor) {
		int inicio = 0;
		int fin = arr.length-1;
		int resultado = - 1;
		while(inicio <= fin) {
			int medio = inicio + (fin - inicio) / 2;
			if(arr[medio] == valor) {
				resultado = medio;
				fin = medio - 1;
			}else if(arr[medio]<valor) {
				inicio = medio + 1;
			}else {
				fin = medio - 1;
			}
		}
		return resultado;
	}
	
	private int buscarUltimo(int[] arr, int valor) {
		int inicio = 0;
		int fin = arr.length-1;
		int resultado = - 1;
		while(inicio <= fin) {
			int medio = inicio + (fin - inicio) / 2;
			if(arr[medio] == valor) {
				resultado = medio;
				inicio = medio + 1;
			}else if(arr[medio]<valor) {
				inicio = medio + 1;
			}else {
				fin = medio - 1;
			}
		}
		return resultado;
	}
	
	public int recurrencia(int[] arr, int valor) {
		int posInicio = buscarPrimero(arr, valor);
		int posFin = buscarUltimo(arr, valor);
		if(posInicio == -1 || posFin == -1) {
			JOptionPane.showMessageDialog(null, "No se encontro el valor buscado");
			return 0;
		}else {
			int cantidad = (posFin - posInicio + 1);
			return cantidad;
		}
	}
}
