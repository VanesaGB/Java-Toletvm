package modelos;

public class Modulo {
	
	//Enumeraci�n Bloque
	public enum Bloque{
		TRONCAL, METODOLOGIAS, HABILIDADES;
	}
	
	//Propiedades del objeto M�dulo
	private int id; //Identificador del m�dulo en la base de datos
	private String nombre; //Nombre del m�dulo. Ejemplo: Metodolog�as �giles
	private int jornadas; //N�mero de jornadas que durar� el m�dulo
	private int horas; //N�mero de horas de las que constar� el m�dulo
	private int horasTutorias; //N�mero de horas de tutor�a de las que constar� el m�dulo
	private Bloque bloque; //Bloque al que pertenecer� el m�dulo.
	
	
	//Constructores (vac�o y con propiedades)
	public Modulo(){}
	
	public Modulo(int id, String nombre, int jornadas, int horas, int horasTutoria, Bloque bloque){
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.horasTutorias = horasTutoria;
		this.bloque = bloque;
	}
	
	
	//Getters
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getJornadas() {
		return jornadas;
	}
	public int getHoras() {
		return horas;
	}
	public int getHorasTutorias() {
		return horasTutorias;
	}
	public Bloque getBloque() {
		return bloque;
	}
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setJornadas(int jornadas) {
		this.jornadas = jornadas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setHorasTutorias(int horasTutorias) {
		this.horasTutorias = horasTutorias;
	}
	public void setBloque(Bloque bloque) {
		this.bloque = bloque;
	}
	
	
	
}

