
package Calculadora;

public interface iCalculadora {
    //Métodos para las operaciones básicas
    public double suma(double num1, double num2);
    public double resta(double num1, double num2);
    public double multiplicacion(double num1, double num2);
    public double division(double num1, double num2) throws ArithmeticException;

    //Métodos para operaciones matemáticas avanzadas
    public double potencia(double base, double exponente);
    public double potencia2(double num);
    public double potencia3(double num);
    public double raizCuadrada(double num);
    public double raizCubica(double num);
    public double logaritmo(double num);

    //Métodos para funciones trigonométricas
    public double seno(double num, boolean radianes);
    public double coseno(double num, boolean radianes);
    public double tangente(double num, boolean radianes);
    public double arcoseno(double num, boolean radianes);
    public double arcocoseno(double num, boolean radianes);
    public double arcotangente(double num, boolean radianes);
    
    //Método para conversiones de unidades
    public double convertirUnidad(double valor, boolean aRadianes);

    //Métodos para funciones especiales
    public double pi();
    public double euler();
    public double porcentaje(double num);

    //Métodos para operaciones de memoria
    public void borrarMemoria();
    public double recuperarMemoria();
    public void almacenarMemoria(double valor);
    public void sumarAMemoria(double valor);
    public void restarDeMemoria(double valor);

    //Otros métodos
    public double calcularResultado(String total);
    public void borrarEntrada();
    public void borrarEntradaParcial();
    public void borrarCifra();
    public void agregarPunto();
}
