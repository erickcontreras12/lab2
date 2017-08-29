package herencia;

public class Main {

	public static void main(String[] args) {
		Student estudiante = new Student("Erick Contreras","Ciudad");
		estudiante.setNumCursos(5);
		estudiante.addCourseGrade("Ingles",90);
		estudiante.addCourseGrade("Calculo",76);
		estudiante.addCourseGrade("Progra",85);
		estudiante.addCourseGrade("Fisica",87);
		estudiante.addCourseGrade("Discreta",100);
		estudiante.printGrades();
		System.out.println(estudiante.toString());
		
		Teacher catedratico = new Teacher("Sebastian Rosales","Villa Nueva");
		boolean res;
		catedratico.setNumCursos(2);
		System.out.println("\n" + "Añadir");
		res = catedratico.addCourses("Progra");
		System.out.println(res);
		res = catedratico.addCourses("Progra");
		System.out.println(res);
		System.out.println(catedratico.toString());
		res = catedratico.addCourses("Discreta");
		System.out.println(res);
		System.out.println(catedratico.toString());
		System.out.println("Eliminar");
		res = catedratico.removeCourses("Mate");
		System.out.println(res);
		System.out.println(catedratico.toString());
		res = catedratico.removeCourses("Discreta");
		System.out.println(res);
		System.out.println(catedratico.toString());
		}
	
	
}
