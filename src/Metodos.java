
import javax.swing.JOptionPane;

public class Metodos {

    double numero1;
    double numero2;
    double numero3;

    public void Digitar() {
        try {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digitar solo Numeros \nOperacion Incompleta");
        }
    }

    public void DigitarUnico() {
        try {
            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digitar solo Numeros \nOperacion Incompleta");
        }
    }

    public void suma(double numero1, double numero2) {
        numero3 = numero1 + numero2;
    }

    public void resta(double numero1, double numero2) {
        numero3 = numero1 - numero2;
    }

    public void multiplicacion(double numero1, double numero2) {
        numero3 = numero1 * numero2;
    }

    public void division(double numero1, double numero2) {
        numero3 = numero1 / numero2;
    }

    public void potencia(double numero1, double numero2) {
        numero3 = Math.pow(numero1, numero2);
    }

    public void raiz(double numero1) {
        numero3 = Math.sqrt(numero1);
    }
}
