
public class Editorial {
private String nombre,telefono,direcci�n,localidad,mail,cuil;

@Override
public String toString() {
	return "Editorial [nombre=" + nombre + ", telefono=" + telefono + ", direcci�n=" + direcci�n + ", localidad="
			+ localidad + ", mail=" + mail + ", cuil=" + cuil + "]";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefono() {
	return telefono;
}
//terminado
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getDirecci�n() {
	return direcci�n;
}

public void setDirecci�n(String direcci�n) {
	this.direcci�n = direcci�n;
}

public String getLocalidad() {
	return localidad;
}

public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getCuil() {
	return cuil;
}

public void setCuil(String cuil) {
	this.cuil = cuil;
}

public Editorial(String nombre, String telefono, String direcci�n, String localidad, String mail, String cuil) {
	super();
	this.nombre = nombre;
	this.telefono = telefono;
	this.direcci�n = direcci�n;
	this.localidad = localidad;
	this.mail = mail;
	this.cuil = cuil;
}
}
