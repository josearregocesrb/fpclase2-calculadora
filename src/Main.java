/*
Autores:
Jose Rafael Arregoces Bermudez
Carlos Efrain Pizan Jacome
Johny Jamer Barrera Vargas
*/
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;
        byte operacion = 0;
        String[] Opcion = {"Continuar", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "Calculadora Basica", "Elige una Opcion", 0, JOptionPane.QUESTION_MESSAGE, null, Opcion, "Continuar");
        if (opcion == 0) {
            do {
                try {
                    operacion = Byte.parseByte(JOptionPane.showInputDialog("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potencia\n6. Raiz\n0. Salir\nIngrese un numero: "));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Digitar solo Numeros");
                }
                switch (operacion) {
                    case 1 -> {
                        Metodos metodo = new Metodos();
                        metodo.Digitar();
                        metodo.suma(metodo.numero1, metodo.numero2);
                        double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                        JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                    }
                    case 2 -> {
                        Metodos metodo = new Metodos();
                        metodo.Digitar();
                        metodo.resta(metodo.numero1, metodo.numero2);
                        double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                        JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                    }
                    case 3 -> {
                        Metodos metodo = new Metodos();
                        metodo.Digitar();
                        metodo.multiplicacion(metodo.numero1, metodo.numero2);
                        double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                        JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                    }
                    case 4 -> {
                        Metodos metodo = new Metodos();
                        metodo.Digitar();
                        if (metodo.numero2 == 0) {
                            JOptionPane.showMessageDialog(null, "Imposible Calcular");
                        } else {
                            metodo.division(metodo.numero1, metodo.numero2);
                            double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                            JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                        }
                    }
                    case 5 -> {
                        Metodos metodo = new Metodos();
                        metodo.Digitar();
                        metodo.potencia(metodo.numero1, metodo.numero2);
                        double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                        JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                    }
                    case 6 -> {
                        Metodos metodo = new Metodos();
                        metodo.DigitarUnico();
                        if (metodo.numero1 < 0) {
                            JOptionPane.showMessageDialog(null, "Imposible Calcular");
                        } else {
                            metodo.raiz(metodo.numero1);
                            double resultado = Math.round(metodo.numero3 * 100) / 100.0;
                            JOptionPane.showMessageDialog(null, "El Resultado es: " + resultado);
                        }
                    }
                    case 0 ->
                        continuar = false;
                    default ->
                        JOptionPane.showMessageDialog(null, "Digite la Operacion Correcta");
                }
            } while (continuar == true);
        } else {
            System.exit(0);
        }
    }
}
