package Lab02;

import javax.swing.JOptionPane;

public class Ex51 {

	public static void main(String[] args) {
		
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You'vs choosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
		
		System.exit(0);

	}

}
