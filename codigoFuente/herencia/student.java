package herencia;

import java.util.Arrays;

public class Student extends Person{
	private int numCursos;
	private String[] cursos;
	private int[] notas;
	int x;
	
	public int getNumCursos() {
		return numCursos;
	}
	public void setNumCursos(int numCursos) {
		this.numCursos = numCursos;
		cursos = new String[numCursos];
		notas = new int[numCursos];
	}
	public Student(String nombre, String direccion) {
		super(nombre, direccion);
	}
	public String toString() {
		return "Student [numCursos=" + numCursos + ", cursos=" + Arrays.toString(cursos) + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	public String toString1() {
		return "Student: " + super.toString();
	}
	public void addCourseGrade(String curso,int nota) {
		cursos[x] = curso;
		notas[x] = nota;
		x++;
	}
	public void printGrades() {
		System.out.println(toString1());
		for (int i = 0; i < cursos.length; i++) {
		System.out.println("Curso: "+ cursos[i] + " Nota: " +notas[i]);
		}
	}
}
