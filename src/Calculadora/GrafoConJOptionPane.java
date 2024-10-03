package Calculadora;

import javax.swing.JOptionPane;

public class GrafoConJOptionPane {

    public static void main(String[] args) {
        int numVertices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de nodos (vértices):"));
        GrafoConNodos grafo = new GrafoConNodos();

        for (int i = 0; i < numVertices; i++) {
            int valorNodo = i;
            NodoArbol nodo = new NodoArbol(valorNodo);
            grafo.agregarNodo(nodo);
        }

        while (true) {
            try {
                int origen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nodo de origen (0-" + (numVertices - 1) + "):"));
                int destino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nodo de destino (0-" + (numVertices - 1) + "):"));
                int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la arista:"));

                grafo.agregarArista(origen, destino, peso);

                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra arista?", "Agregar Arista", JOptionPane.YES_NO_OPTION);
                if (opcion != JOptionPane.YES_OPTION) {
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        grafo.mostrarArbolEnFrame();
    }
}
