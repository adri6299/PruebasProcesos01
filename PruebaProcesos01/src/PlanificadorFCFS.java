import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PlanificadorFCFS {
	private static Queue<Proceso> queue;
	
	static {
		queue = new LinkedList<Proceso>();
	}
	
	public static Proceso get() {
		Proceso aux = queue.poll();
		long inicio, fin;
		
		if (aux!=null) {
			try {
				inicio = System.currentTimeMillis();
				System.out.println("Proceso: " + aux.getNombre());
				System.out.println("Hora de inicio: " + inicio);
				Thread.sleep(aux.getDuracion());
				fin = System.currentTimeMillis();
				System.out.println("Hora de fin: " + fin);
				System.out.println("--> Duración del hilo (" + aux.getDuracion() + ") " + aux.getNombre() + " ||" + (fin-inicio));
				
			} catch (InterruptedException ex) {
				ex.printStackTrace();			}
		} else {
			System.out.println("Planificador sin procesos.");
		}
		return aux;
	}

	public static void put(Proceso p) {
		queue.add(p);
	}

	public static void sirve() {
		while (get()!=null);
		
	}

}
