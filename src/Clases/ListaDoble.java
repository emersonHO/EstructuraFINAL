package Clases;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;
    private int contador; // Nuevo campo para el contador
    private static ListaDoble historial = new ListaDoble();

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
        this.contador = 0; // Inicializar el contador en 0
    }
        
    public class Nodo {
        private int id;
        private String operacion;
        private double resultado;
        private Nodo siguiente;
        private Nodo anterior;

        public Nodo(int id, String operacion, double resultado) {
            this.id = id;
            this.operacion = operacion;
            this.resultado = resultado;
            this.siguiente = null;
            this.anterior = null;
        }
        
        public int getID() {
            return id;
        }
        
        public void setID(int id) {
            this.id = id;
        }
        public String getOperacion() {
            return operacion;
        }

        public double getResultado() {
            return resultado;
        }
    }

    public void agregarElemento(String operacion, double resultado) {
        Nodo nuevoNodo = new Nodo(++contador, operacion, resultado); // Incrementamos el contador y asignamos el valor al nuevo nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.anterior = cola;
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public void imprimirHistorial() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Operación: " + actual.operacion + ", Resultado: " + actual.resultado);
            actual = actual.siguiente;
        }
    }
    
    public int getContador() {
        return contador;
    }
    
    public void pasarAListaDoble(String operacion, double resultado) {
        historial.agregarElemento(operacion, resultado);
    }
    
    public String[] obtenerHistorialComoArray() {
        List<String> historialArray = new ArrayList<>();
        Nodo actual = cabeza;

        while (actual != null) {
            historialArray.add("ID: " + actual.getID() + ", Operación: " + actual.operacion + ", Resultado: " + actual.resultado);
            actual = actual.siguiente;
        }

        return historialArray.toArray(new String[0]);
    }
    
    public void ordenarPorResultado() {
        Nodo[] nodosArray = obtenerNodosComoArray();
        Arrays.sort(nodosArray, (nodo1, nodo2) -> Double.compare(nodo1.resultado, nodo2.resultado));

        cabeza = null;
        cola = null;
        contador = 0; // Restablecer el contador a 0

        for (Nodo nodo : nodosArray) {
            agregarElemento(nodo.operacion, nodo.resultado);
        }
    }


    
    public Nodo buscarPorID(int targetID) {
        Nodo actual = cabeza;
        while (actual != null) {
            int actualID = actual.getID();

            if (actualID == targetID) {
                return actual;  // Encontrado
            }

            actual = actual.siguiente;
        }

        return null;  // No encontrado
    }

    // Método para eliminar un nodo específico por ID
    public void eliminarPorID(int targetID) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getID() == targetID) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior;
                }

                contador--; // Decrementar el contador al eliminar un nodo
                return; // Salir después de eliminar
            }

            actual = actual.siguiente;
        }
    }



    // Método auxiliar para obtener los nodos como un array
    private Nodo[] obtenerNodosComoArray() {
        Nodo[] nodosArray = new Nodo[contador];
        Nodo actual = cabeza;
        int index = 0;

        while (actual != null) {
            nodosArray[index++] = actual;
            actual = actual.siguiente;
        }

        return nodosArray;
    }
    
    // Método para ordenar la lista por ID (ascendente)
    public void ordenarPorID() {
        Nodo[] nodosArray = obtenerNodosComoArray();
        Arrays.sort(nodosArray, Comparator.comparingInt(Nodo::getID));

        cabeza = null;
        cola = null;

        for (Nodo nodo : nodosArray) {
            agregarElemento(nodo.operacion, nodo.resultado);
        }
    }
}