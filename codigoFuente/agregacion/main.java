package agregacion;

public class Main {

	public static void main(String[] args) {
		System.out.println("Punto");
		Point punto = new Point(6,7);
		Point p = new Point(-6,-7);
		double resultado;

		resultado = punto.distance();
		System.out.println("Distancia a 0,0: " + resultado);
		resultado = punto.distance(4, 3);
		System.out.println("Distancia a 4,3: " + resultado);
		resultado = punto.distance(p);
		System.out.println("Distancia a punto p: " + resultado);
		
		Line linea = new Line();
		int x = 2; int y = 3;
		Point nuevoPunto = new Point();
		System.out.println("Linea");
		nuevoPunto.setX(x);
		nuevoPunto.setY(y);
		linea.setBegin(nuevoPunto);
		linea.setEnd(p);
		linea.setBeginXY(x, y);
		
		resultado = linea.getLength();
		System.out.println(linea.toString());
		System.out.println("La longitud de la linea es de: " + resultado);
		
		
	}

}
