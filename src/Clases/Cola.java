
package Clases;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<String> cola;

    public Cola() {
        this.cola = new LinkedList<>();
    }

    public void agregarOperacion(String operacion) {
        cola.offer(operacion);
    }

    public String obtenerSiguienteOperacion() {
        if (!cola.isEmpty()) {
            return cola.poll();
        } else {
            return null; // No hay más operaciones en la cola
        }
    }
}
