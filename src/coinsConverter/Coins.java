package coinsConverter;

import javax.swing.JOptionPane;

public class Coins {

    // Convierte pesos argentinos a dólares estadounidenses
    public void ConvertirPesosADolar(double valorRecibido) {
        double monedaDolar = valorRecibido / 371;
        // Redondea a 6 decimales
        monedaDolar = (double) Math.round(monedaDolar * 1000000) / 1000000.0;
        // Muestra el valor convertido
        JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = US$" + monedaDolar);
    }

    // Convierte pesos argentinos a euros
    public void ConvertirPesosAEuro(double valorRecibido) {
        double monedaEuro = valorRecibido / 397;
        monedaEuro = (double) Math.round(monedaEuro * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = €" + monedaEuro);
    }

    // Convierte pesos argentinos a libras esterlinas
    public void ConvertirPesosALibra(double valorRecibido) {
        double monedaLibra = valorRecibido / 240;
        monedaLibra = (double) Math.round(monedaLibra * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = £" + monedaLibra);
    }

    // Convierte pesos argentinos a yenes japoneses
    public void ConvertirPesosAYen(double valorRecibido) {
        double monedaYen = valorRecibido / 1.5;
        monedaYen = (double) Math.round(monedaYen * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ¥" + monedaYen);
    }

    // Convierte pesos argentinos a wones surcoreanos
    public void ConvertirPesosAWon(double valorRecibido) {
        double monedaWon = valorRecibido / 0.15;
        monedaWon = (double) Math.round(monedaWon * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ₩" + monedaWon);
    }

    // Convierte dólares estadounidenses a pesos argentinos
    public void ConvertirDolarAPeso(double valorRecibido) {
        double monedaPeso = valorRecibido * 371;
        // Redondea a 6 decimales
        monedaPeso = (double) Math.round(monedaPeso * 1000000) / 1000000.0;
        // Muestra el valor convertido
        JOptionPane.showMessageDialog(null, "US$" + valorRecibido + " = $" + monedaPeso);
    }

    // Convierte euros a pesos argentinos
    public void ConvertirEuroAPeso(double valorRecibido) {
        double monedaPeso = valorRecibido * 397;
        monedaPeso = (double) Math.round(monedaPeso * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "€" + valorRecibido + " = $" + monedaPeso);
    }

    // Convierte libras esterlinas a pesos argentinos
    public void ConvertirLibraAPeso(double valorRecibido) {
        double monedaPeso = valorRecibido * 0.15; // Este valor parece incorrecto, debería ser más alto
        monedaPeso = (double) Math.round(monedaPeso * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "£" + valorRecibido + " = $" + monedaPeso);
    }

    // Convierte yenes japoneses a pesos argentinos
    public void ConvertirYenAPeso(double valorRecibido) {
        double monedaPeso = valorRecibido * 1.5;
        monedaPeso = (double) Math.round(monedaPeso * 1000000) / 1000000.0;
        JOptionPane.showMessageDialog(null, "¥" + valorRecibido + " = $" + monedaPeso);
    }

    // Convierte wones surcoreanos a pesos argentinos
    public void ConvertirWonAPeso(double valorRecibido) {
        double monedaPeso = valorRecibido * 3.88;
        monedaPeso = (double) Math.round(monedaPeso * 1000000) / 1000000.0;
        // Muestra el valor convertido
        JOptionPane.showMessageDialog(null, "₩" + valorRecibido + " = $" + monedaPeso);
    }
}