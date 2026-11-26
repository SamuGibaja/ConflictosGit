package conflictos;

public class GestorTareas {
	public static String obtenerEstado(int tareasPendientes) {
	    if (tareasPendientes == 0) {
	        return "No hay tareas pendientes";
	    } else if (tareasPendientes > 10) {
	        return "ATENCIÓN: acumulación de tareas";
	    } else {
	        return "Pendientes: " + tareasPendientes + " tareas";
	    }
	}
	public static void main(String[] args) {
	    System.out.println(obtenerEstado(0));   // No hay tareas pendientes
	    System.out.println(obtenerEstado(5));   // Pendientes: 5 tareas
	    System.out.println(obtenerEstado(10));  // Pendientes: 10 tareas
	    System.out.println(obtenerEstado(15));  // ATENCIÓN: acumulación de tareas
	}
	}

