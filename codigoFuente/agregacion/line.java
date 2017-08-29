package agregacion;

public class Line {
	private Point begin;
	private Point end;
	
	
	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	public Line(int x1, int y1, int x2, int y2) {
		this.begin.setX(x1);
		this.begin.setX(y1);
		this.end.setX(x2);
		this.end.setY(y2);
	}
	public Line() {
		super();
		this.begin = begin;
		this.end = end;
	}
	public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	public int getBeginX() {
		return this.begin.getX();
	}
	public int getBeginY() {
		return this.begin.getY();
	}
	public int getEndX() {
		return this.end.getX();
	}
	public int getEndY() {
		return this.end.getY();
	}
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	public void setEndXY(int x, int k) {
		this.end.setXY(x, k);
	}
	public String toString() {
		return "Line begin(" + begin.getX() + "," + begin.getY()+") end(" + end.getX()+","+ end.getY() + ")";
	}
	public double getLength() {
		return begin.distance(end);
	}
}
