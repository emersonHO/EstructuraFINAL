package Calculadora;
import java.util.ArrayList;
import java.util.List;

public class NodoArbol {
    private int valor;
    private List<NodoArbol> vecinos;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.vecinos = new ArrayList<>();
    }

    public int getValor() {
        return valor;
    }

    public void agregarVecino(NodoArbol vecino) {
        vecinos.add(vecino);
        vecino.vecinos.add(this); // Si el grafo es no dirigido
    }

    public List<NodoArbol> getVecinos() {
        return vecinos;
    }

    public static void main(String[] args) {
        NodoArbol nodo1 = new NodoArbol(1);
        NodoArbol nodo2 = new NodoArbol(2);
        NodoArbol nodo3 = new NodoArbol(3);

        nodo1.agregarVecino(nodo2);
        nodo1.agregarVecino(nodo3);

        System.out.println("Vecinos del nodo " + nodo1.getValor() + ": ");
        for (NodoArbol vecino : nodo1.getVecinos()) {
            System.out.println(vecino.getValor());
        }
    }
}

