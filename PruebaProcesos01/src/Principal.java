import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		forCrearProcesos();
		PlanificadorFCFS.sirve();
	}

	private static void forCrearProcesos() {
		ArrayList<Proceso> procesos = new ArrayList<Proceso>();
		
		for (int contador = 0; contador <= 5; contador++) {
			Proceso p = new Proceso("P_" + contador, ((int) Math.floor(Math.random() * 4+1)) * 1000);
			procesos.add(p);
			
		}
		
		Collections.shuffle(procesos);
		
		for (Proceso p : procesos) {
			PlanificadorFCFS.put(p);
		}
		
		
	}

}
