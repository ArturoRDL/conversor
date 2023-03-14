package conversor;

import javax.swing.JOptionPane;

public class Continuar {
	
	public void CuadroContinuar() {
	
		int confirmar = JOptionPane.showConfirmDialog(null, "Desea Continuar");
		
		switch(confirmar){
        	case 0: 
        		AppOpcion.main(null);
        		break;
        	case 1: 
        		JOptionPane.showMessageDialog(null, "Programa Finalizado");
        		System.exit(confirmar);
        		break;
        	case 2: 
        		JOptionPane.showMessageDialog(null, "Programa Finalizado");
        		System.exit(confirmar);
        		break;
        }
	
	}
}
