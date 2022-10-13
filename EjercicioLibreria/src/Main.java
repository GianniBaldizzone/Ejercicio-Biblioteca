import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Bienvenidos a mi primer programa POO");
	Autor orwell = new Autor ("George","Orwell","1903","masculino","georgeorwell@gmail.com");
	JOptionPane.showMessageDialog(null, orwell);
	
	}

}
