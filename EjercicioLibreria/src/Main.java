//terminado
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Bienvenidos a mi primer programa POO");
	Autor orwell = new Autor ("George","Orwell","1903","masculino","georgeorwell@gmail.com");
	JOptionPane.showMessageDialog(null, orwell);
	Editorial planeta = new Editorial ("Planeta"," 011 4124-9100","Av. Independencia 1682","Buenos Aires, CABA","planeta@gmail.com","30-62537821-0");
	JOptionPane.showMessageDialog(null, planeta);
	Libro rebelionEnLaGranja = new Libro ("Rebelion en la granja","1984",10,100,orwell,planeta);
	JOptionPane.showMessageDialog(null, rebelionEnLaGranja);
	}

}
