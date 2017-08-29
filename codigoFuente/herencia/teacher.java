package herencia;

import java.util.Arrays;

public class Teacher extends Person{
	private int numCursos;
	private String[] cursos;
	int y;
	
	public Teacher(String nombre, String direccion) {
		super(nombre, direccion);
		// TODO Auto-generated constructor stub
	}

	public int getNumCursos() {
		return numCursos;
	}
	public void setNumCursos(int numCursos) {
		this.numCursos = numCursos;
		cursos = new String[getNumCursos()];
	}
	public String toString() {
		return toString1() +" [numCursos=" + numCursos + ", cursos=" + Arrays.toString(cursos) + "]";
	}
	public String toString1() {
		return "Teacher: "+ super.toString();
	}
	public boolean addCourses(String curso) {
		boolean curse = false;
		boolean igual = false;
		int x;
		for(int j= 0; j<numCursos; j++) {
			if(curso == cursos[j]) {
				igual = false;
				x = j;
				break;
			}else {
				igual = true;
			}
		}
		if(igual){
			cursos[y]= curso;
			y++;
		}
		else {
			
		}
		return igual;
	}
	public boolean removeCourses(String curso) {
		boolean curse = false;
		for(int j= 0; j<numCursos; j++) {
			if(curso == cursos[j]) {
				cursos[j] = "";
				curse = true;
				break;
			}else {
				curse = false;
			}
		}
		
		return curse;
	}
}
