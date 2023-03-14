package conversor;

import javax.swing.JOptionPane;

public class ConversorMonedas {
	
	static void conversor() {
	double resultado;
	double monto = Double.parseDouble(JOptionPane.showInputDialog
									("Ingresa el monto a convertir"));
	
		if(monto > 0) {
			resultado = 0.05 * monto;
			JOptionPane.showMessageDialog(null, "Tu Monto en dolar es:  " + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "Valor no Valido");
		}
	}

	

	
}
