public class TestEjercicio4 {
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
}