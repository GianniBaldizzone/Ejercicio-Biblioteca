
public class Editorial {
private String nombre,telefono,dirección,localidad,mail,cuil;

@Override
public String toString() {
	return "Editorial [nombre=" + nombre + ", telefono=" + telefono + ", dirección=" + dirección + ", localidad="
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

public String getDirección() {
	return dirección;
}

public void setDirección(String dirección) {
	this.dirección = dirección;
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

public Editorial(String nombre, String telefono, String dirección, String localidad, String mail, String cuil) {
	super();
	this.nombre = nombre;
	this.telefono = telefono;
	this.dirección = dirección;
	this.localidad = localidad;
	this.mail = mail;
	this.cuil = cuil;
}
}
