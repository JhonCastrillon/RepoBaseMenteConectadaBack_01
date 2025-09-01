package PanelEstadisticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HU031C4 {
    public static void main(String[] args) {

        ArrayList<Estadistica> estadisticas = new ArrayList<>();

        estadisticas.add(new Estadistica("Visitas", 120, "2025-08-01"));
        estadisticas.add(new Estadistica("Ventas", 35, "2025-08-02"));
        estadisticas.add(new Estadistica("Clicks", 560, "2025-07-28"));

        System.out.println("Lista de estadísticas creada correctamente!");

        // Recorremos con while
        int i = 0;
        while (i < estadisticas.size()) {
            estadisticas.get(i).mostrar();
            i++;
        }

        // Ordenamos por valor
        Collections.sort(estadisticas, new Comparator<Estadistica>() {
            @Override
            public int compare(Estadistica e1, Estadistica e2) {
                return Double.compare(e1.getValor(), e2.getValor());
            }
        });

        // Recorremos de nuevo después de ordenar
        System.out.println("\n--- Lista ordenada por valor ---");
        i = 0; // 👈 reiniciamos la variable, no se vuelve a declarar
        while (i < estadisticas.size()) {
            estadisticas.get(i).mostrar();
            i++;
        }
    }
}

// Clase Estadistica
class Estadistica {
    private String tipo;
    private double valor;
    private String fecha;

    public Estadistica(String tipo, double valor, String fecha) {
        this.tipo = tipo;
        this.valor = valor;
        this.fecha = fecha;
    }

    public void mostrar() {
        System.out.println("Tipo: " + tipo + " | Valor: " + valor + " | Fecha: " + fecha);
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getFecha() {
        return fecha;
    }
}
