//terminado
public class Libro {
private String nombre,a�o;
private int cantidadDeLibros,costo;
private Autor autor;
private Editorial editorial;
@Override
public String toString() {
	return "Libro [nombre=" + nombre + ", cantidadDeLibros=" + cantidadDeLibros + ", costo=" + costo + ",\n autor="
			+ autor + ", \neditorial=" + editorial + "]";
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getA�o() {
	return a�o;
}
public void setA�o(String a�o) {
	this.a�o = a�o;
}
public int getCantidadDeLibros() {
	return cantidadDeLibros;
}
public void setCantidadDeLibros(int cantidadDeLibros) {
	this.cantidadDeLibros = cantidadDeLibros;
}
public int getCosto() {
	return costo;
}
public void setCosto(int costo) {
	this.costo = costo;
}
public Autor getAutor() {
	return autor;
}
public void setAutor(Autor autor) {
	this.autor = autor;
}
public Editorial getEditorial() {
	return editorial;
}
public void setEditorial(Editorial editorial) {
	this.editorial = editorial;
}
public Libro(String nombre,String a�o, int cantidadDeLibros, int costo, Autor autor, Editorial editorial) {
	super();
	this.nombre = nombre;
	this.a�o = a�o;
	this.cantidadDeLibros = cantidadDeLibros;
	this.costo = costo;
	this.autor = autor;
	this.editorial = editorial;
}
}
