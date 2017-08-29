package agregacion;

public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		super();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public int[] getXY() {
		int[] cord = new int[2];
		cord[0] = this.x;
		cord[1] = this.y;
		return cord;
	}

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
	public double distance(int x, int y) {
		double d = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
		return d;
	}
	public double distance() {
		double d = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
		return d;
	}
	public double distance(Point otro) {
		double d = Math.sqrt(Math.pow(this.x-otro.x,2)+Math.pow(this.y-otro.y,2));
		return d;
	}
}
