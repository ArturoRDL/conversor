package conversor;

import javax.swing.JOptionPane;


public class OpcionesDeMonedas {
	  	    
	
	
	   public void divisas() {
		   String monto;
		   double montoIngresado;
		   double resultado;
		   double monedaUSD = 0.05291;
		   double monedaEUR = 0.05239;
		   double monedaGPB = 0.04564;
		   double monedaJPY = 7.58835;
		   double monedaKRW = 72.2604;
		   double monedaCOP = 263.1272;
		   double monedaUSD1 = 18.9399;
		   double monedaEUR1 = 20.2560;
		   double monedaGPB1 = 22.9831;
		   double monedaJPY1 = 0.0646;
		   double monedaKRW1 = 0.0124;
		   double monedaCOP1 = 0.0039;
		   
		   String [] Divisas = {"Peso Mexicano a Dolar","Peso Mexicano a Euro", "Peso Mexicano a Libras Esterlinas",
				   				"Peso Mexicano a Yen","Peso Mexicano a Won","Peso Mexicano a Colombiano", 
				   				"Dolar a Peso Mexicano","Euro a Peso Mexicano", "Libras Esterlinas a Peso Mexicano",
				   				"Yen a Peso Mexicano","Won a Peso Mexicano","Colombiano a Peso Mexicano",};
			String Seleccion = (String) JOptionPane.showInputDialog(null, "Seleciona una divisa","Divisas",
					JOptionPane.PLAIN_MESSAGE, null, Divisas, Divisas[0]);
			
			 monto = (JOptionPane.showInputDialog
						("Ingresa el monto a convertir: "));
			 
			 
			 
			if(ValidarDato.Validar(monto)) {
				
				montoIngresado = Double.parseDouble(monto);
								
				switch (Seleccion) {
				case "Peso Mexicano a Dolar": 
					resultado =   montoIngresado * monedaUSD;
					JOptionPane.showMessageDialog(null, "Tu Monto en Dolar es:  " + resultado);
					break;
				case "Peso Mexicano a Euro": 
					resultado = monedaEUR * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Euro es:  " + resultado);
					break;
				case "Peso Mexicano a Libras Esterlinas": 
					resultado = monedaGPB * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Franco es:  " + resultado);
					break;
				case "Peso Mexicano a Yen": 
					resultado = monedaJPY * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Yens es:  " + resultado);
					break;
				case "Peso Mexicano a Won": 
					resultado = monedaKRW * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Won surcoreano es:  " + resultado);
					break;
				case "Peso Mexicano a Colombiano": 
					resultado = monedaCOP * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Colombiano es:  " + resultado);
					break;
				case "Dolar a Peso Mexicano": 
					resultado = monedaUSD1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicanos es:  " + resultado);
					break;
				case "Euro a Peso Mexicano": 
					resultado = monedaEUR1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicano es:  " + resultado);
					break;
				case "Libras a Peso Mexicano": 
					resultado = monedaGPB1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicano es:  " + resultado);
					break;
				case "Yen a Peso Mexicano": 
					resultado = monedaJPY1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicano es:  " + resultado);
					break;
				case "Won a Peso Mexicano": 
					resultado = monedaKRW1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicano es:  " + resultado);
					break;
				case "Colombiano a Peso Mexicano": 
					resultado = monedaCOP1 * montoIngresado;
					JOptionPane.showMessageDialog(null, "Tu Monto en Pesos Mexicano es:  " + resultado);
					break;
				}
			}else {
				JOptionPane.showMessageDialog(null,"Solo puede ingresar datos numerico");
				divisas();
			}
			Continuar DeseaContinuar = new Continuar();
    		DeseaContinuar.CuadroContinuar();
	  
   	}
	
	
}
