
package Clases;

import java.util.Stack;

public class Pila {
    private Stack<String> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
    public String deshacer() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            return null; // No hay operaciones para deshacer
        }
    }
    
    public void agregarNumero(Stack<String> temporal) {
        //Convertimos el temporal en una unica cadena
        StringBuilder numeroCompleto = new StringBuilder();
        for (String elemento : temporal) {
            numeroCompleto.append(elemento);
        }
        //Agregamos la cadena a la pila
        String valor = numeroCompleto.toString();
        pila.push(valor);
    }

    public void agregarSigno(String signo, Stack<String> temporal) {
        if (!temporal.isEmpty()) {
            agregarNumero(temporal);
            pila.push(signo);
        } else {
            String ultimoElemento = pila.peek();
            if (ultimoElemento.equals("(")){
                
            } else {
                if (esOperador(ultimoElemento) && signo.equals("(")){
                    pila.pop();
                    pila.push(signo);
                }
            }
        }
        if(signo.equals("=")){
            agregarNumero(temporal);
        }
    }
    
    private boolean esOperador(String elemento) {
        // Lógica para determinar si el elemento es un operador
        return elemento.equals("+") || elemento.equals("-") || elemento.equals("x") || elemento.equals("/")
                || elemento.equals("^");
    }

    public void limpiar() {
        pila.clear();
    }

    public Stack<String> obtenerPila() {
        return pila;
    }
}

