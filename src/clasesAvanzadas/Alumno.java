package clasesAvanzadas;

import utiles.Teclado;

public class Alumno {
	public String nombre;
	public int telefono;
	public String curso;
	public String dni;
	public String asignaturas[];
	public float notas[];
	
	//constructor por defecto
	public Alumno() {
		nombre="";
		telefono=0;
		curso="";
		dni="";
		asignaturas=new String[] {"Programación","Base de Datos","Sistemas"};
		notas=new float[3];
	}
	public Alumno(String nombre,int telf,String curso,String dni) {
		this.nombre=nombre;
		this.telefono=telf;
		this.curso=curso;
		this.dni=dni;
		asignaturas=new String[] {"Programación","Base de Datos","Sistemas"};
		notas=new float[3];
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setNotas() {
		Teclado ent=new Teclado();
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("Inserta la nota para la asignatura "+asignaturas[i]);
			this.notas[i]=ent.decimales();
		}
		
	}
	
	public float[] getNotas() {
		return notas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return telefono;
	}
	public void setEdad(int edad) {
		this.telefono = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
