/*public class TestEjercicio4 {
    public static void main(String[] args) {
        // Prueba 1: El mayor está en el medio
        if (Ejercicio4.encontrarMayor(10, 50, 30) != 50) {
            System.out.println("❌ TestEjercicio4 Falló: El mayor entre 10, 50 y 30 debe ser 50.");
            System.exit(1); 
        }

        // Prueba 2: El mayor es el tercero
        if (Ejercicio4.encontrarMayor(-5, -10, 0) != 0) {
            System.out.println("❌ TestEjercicio4 Falló: El mayor entre -5, -10 y 0 debe ser 0.");
            System.exit(1);
        }

        System.out.println("✅ TestEjercicio4: PASSED");
        System.exit(0); 
    }
}*/
package unpa.uarg.tp1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas Ejercicio 4 - Mayor de Tres Números")
public class Ejercicio4Test {

    @ParameterizedTest(name = "El mayor entre {0}, {1} y {2} debe ser {3}")
    @CsvSource({
        "10, 50, 30, 50",   // Mayor en el medio
        "-5, -10, 0, 0",    // Mayor al final (con negativos)
        "100, 20, 35, 100", // Mayor al principio
        "5, -1, 3, 5"       // Mezclados
    })
    void testEncontrarMayor(int n1, int n2, int n3, int resultadoEsperado) {
        int resultadoObtenido = Ejercicio4.encontrarMayor(n1, n2, n3);
        
        assertEquals(resultadoEsperado, resultadoObtenido, () -> 
            String.format("❌ Falló la lógica: Al evaluar (%d, %d, %d), esperábamos %d pero tu método devolvió %d.", 
            n1, n2, n3, resultadoEsperado, resultadoObtenido)
        );
    }
}