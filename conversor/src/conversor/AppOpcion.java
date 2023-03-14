package conversor;

import javax.swing.JOptionPane;

public class AppOpcion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] opcion = {"Conversor de Divisas", "Conversor de Temperatura","salir"};
		String Seleccion = (String) JOptionPane.showInputDialog(null, "Seleciona una opcion","Convesor",
				JOptionPane.INFORMATION_MESSAGE, null, opcion, opcion[0]);
		
		switch(Seleccion){
        	case "Conversor de Divisas": 
        		OpcionesDeMonedas Opcionesdivisas = new OpcionesDeMonedas();
        		Opcionesdivisas.divisas();
        		break;
        	case "Conversor de Temperatura": 
        		OpcionesTemperatura Temperatura = new OpcionesTemperatura();
        		Temperatura.escalas();
        		break;
        	case "salir":
				System.exit(0);
				break;
		}
	}
}
