package conversor;

import javax.swing.JOptionPane;

public class OpcionesTemperatura {

	public void escalas() {
		   String Grados;
		   double DatoIngresado;
		   double resultado;
		   double Kelvin = 273.15;
		   double Rankie = 273.15;
		   
		   
		   String [] Escalas = {"Fahrenheit", "Kelvin", "Rankie"};
			String Seleccion = (String) JOptionPane.showInputDialog(null, "Seleciona una Escala","Escala de Temeperatura",
					JOptionPane.PLAIN_MESSAGE, null, Escalas, Escalas[0]);
			
			 Grados = (JOptionPane.showInputDialog
						("Ingresa Temperatura convertir "));
			 
			 
			 
			if(ValidarDato.Validar(Grados)) {
				
				DatoIngresado = Double.parseDouble(Grados);
								
				switch (Seleccion) {
				case "Fahrenheit": 
					resultado = (1.8 * DatoIngresado)+32;
					JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es:  " + resultado);
					break;
				case "Kelvin": 
					resultado = Kelvin + DatoIngresado;
					JOptionPane.showMessageDialog(null, "La temperatura en Kelvin es:  " + resultado);
					break;
				case "Rankie": 
					resultado = (Rankie + DatoIngresado)*1.8;
					JOptionPane.showMessageDialog(null, "La temperatura en Rankie es:  " + resultado);
					break;
				}
			}else {
				JOptionPane.showMessageDialog(null,"Solo puede ingresar datos numerico");
				escalas();
			}
			Continuar DeseaContinuar = new Continuar();
			DeseaContinuar.CuadroContinuar();
	  
	}

	
}
