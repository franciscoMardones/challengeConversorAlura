package coinsConverter;

import javax.swing.JOptionPane;

public class FunctionCoin {

    // Instancia de la clase Coins que contiene los métodos de conversión
    Coins monedas = new Coins();

    // Método para convertir monedas basado en la selección del usuario
    public void ConvertirMoneda(double ValorRecibido) {
        // Solicita al usuario seleccionar una opción de conversión
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{
                        "Peso Arg a Dólar", "Peso Arg a Euro", "Peso Arg a Libra esterlina", "Peso Arg a Yen", "Peso Arg a Won",
                        "Dólar a Peso Arg", "Euro a Peso Arg", "Libra esterlina a Peso Arg", "Yen a Peso Arg",
                        "Won a Peso Arg"
                }, "Selección")).toString();

        // Realiza la conversión según la opción seleccionada
        switch (opciones) {
            case "Peso Arg a Dólar":
                monedas.ConvertirPesosADolar(ValorRecibido);
                break;
            case "Peso Arg a Euro":
                monedas.ConvertirPesosAEuro(ValorRecibido);
                break;
            case "Peso Arg a Libra esterlina":
                monedas.ConvertirPesosALibra(ValorRecibido);
                break;
            case "Peso Arg a Yen":
                monedas.ConvertirPesosAYen(ValorRecibido);
                break;
            case "Peso Arg a Won":
                monedas.ConvertirPesosAWon(ValorRecibido);
                break;
            case "Dólar a Peso Arg":
                monedas.ConvertirDolarAPeso(ValorRecibido);
                break;
            case "Euro a Peso Arg":
                monedas.ConvertirEuroAPeso(ValorRecibido);
                break;
            case "Libra esterlina a Peso Arg":
                monedas.ConvertirLibraAPeso(ValorRecibido);
                break;
            case "Yen a Peso Arg":
                monedas.ConvertirYenAPeso(ValorRecibido);
                break;
            case "Won a Peso Arg":
                monedas.ConvertirWonAPeso(ValorRecibido);
                break;
            default:
                // Maneja una opción no válida (aunque no debería ocurrir con el uso de JOptionPane)
                JOptionPane.showMessageDialog(null, "Selección no válida");
                break;
        }
    }
}
