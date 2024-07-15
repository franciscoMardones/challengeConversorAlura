package menu;

import javax.swing.JOptionPane;

import coinsConverter.FunctionCoin;


public class Menu {

    // Método principal para ejecutar el menú
    public static void ejecutarMenu() {

        // Instancia de las clases que contienen las funciones de conversión
        FunctionCoin monedas = new FunctionCoin();

        try {
            String opciones;
            int menuSi = JOptionPane.YES_OPTION;

            do {
                // Solicita al usuario seleccionar una opción de conversión
                opciones = (JOptionPane.showInputDialog(null, "Seleccione para continuar", "Menú ",
                        JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Monedas"}, "Selección"))
                        .toString();

                switch (opciones) {
                    case "Monedas": {
                        // Solicita al usuario ingresar el monto a convertir
                        String input = JOptionPane.showInputDialog("Ingrese el monto que desea convertir");

                        // Valida que el valor ingresado sea un número
                        while (!esNumero(input)) {
                            JOptionPane.showMessageDialog(null, "Error en el valor ingresado", "Error", JOptionPane.ERROR_MESSAGE);
                            input = JOptionPane.showInputDialog(null, "Ingrese monto nuevamente");
                        }

                        double valorRecibido = Double.parseDouble(input);
                        monedas.ConvertirMoneda(valorRecibido);

                        // Pregunta si el usuario quiere volver a convertir
                        int seleccion = JOptionPane.showConfirmDialog(null, "¿Volver a convertir?");
                        System.out.println(seleccion);
                    }
                    break;

                    default:
                        break;
                }
            } while (JOptionPane.YES_OPTION == menuSi);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aplicación cerrada");
        }
    }

    // Método que valida si una cadena es un número
    private static boolean esNumero(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
