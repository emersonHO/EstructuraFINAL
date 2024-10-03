package Calculadora;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;


public class GrafoConNodos {
    private List<NodoArbol> nodos;

    public GrafoConNodos() {
        this.nodos = new ArrayList<>();
    }

    public void agregarNodo(NodoArbol nodo) {
        nodos.add(nodo);
    }

    public void agregarArista(int indiceOrigen, int indiceDestino, int peso) {
        NodoArbol origen = nodos.get(indiceOrigen);
        NodoArbol destino = nodos.get(indiceDestino);

        origen.agregarVecino(destino);
    }

    public void mostrarArbolEnFrame() {
        JFrame frame = new JFrame("Árbol");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Construye un nodo raíz para el JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Raíz");

        // Agrega los nodos del árbol al nodo raíz
        for (NodoArbol nodo : nodos) {
            DefaultMutableTreeNode nodoTree = new DefaultMutableTreeNode("Nodo " + nodo.getValor());
            root.add(nodoTree);
            for (NodoArbol vecino : nodo.getVecinos()) {
                nodoTree.add(new DefaultMutableTreeNode("Vecino " + vecino.getValor()));
            }
        }

        // Construye el JTree
        JTree tree = new JTree(root);

        // Agrega el JTree al JFrame
        frame.getContentPane().add(new JScrollPane(tree));

        // Configura el JFrame
        frame.setSize(new Dimension(300, 400));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GrafoConNodos grafo = new GrafoConNodos();

        NodoArbol nodo1 = new NodoArbol(1);
        NodoArbol nodo2 = new NodoArbol(2);
        NodoArbol nodo3 = new NodoArbol(3);

        nodo1.agregarVecino(nodo2);
        nodo1.agregarVecino(nodo3);

        grafo.agregarNodo(nodo1);
        grafo.agregarNodo(nodo2);
        grafo.agregarNodo(nodo3);

        grafo.mostrarArbolEnFrame();
    }
}
