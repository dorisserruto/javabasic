//import java.math.*;

public class Punto {
	//instance variables
	private double X, Y;
	//constructor
	public Punto(){
		X=0;
		Y=0;
	}
	public Punto(double x, double y){
		X=x;
		Y=y;
	}
	//access methods
		public double getX(){
			return X;
		}
		public double getY(){
			return Y;
		}
		public void setX(double x){
			X=x;
		}
		public void setY(double y){
			X=y;
		}
	
	//instance methods
		public double distance(Punto q){
			double dx,dy;
			dx = X - q.getX();
			dy = Y - q.getY();
			return Math.sqrt(Math.pow(dx, 2)+ Math.pow(dy, 2));
		}
}
