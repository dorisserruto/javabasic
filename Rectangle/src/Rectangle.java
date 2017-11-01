
public class Rectangle {
	//instance variables
	private double width, height;
	private String color;
	
	//constructor
	public Rectangle(){
		width = 1;
		height =1;
		color = "white";
	}
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	public Rectangle(double w, double h, String c){
		width = w;
		height = h;
		color = c;
	}
	
	//access methods
		public double getWidth(){
			return width;
		}
		public double getHeight(){
			return height;
		}
		public String getColor(){
			return color;
		}
		public void setWidth(double w){
			width = w;
		}
		public void setHeight(double h){
			height = h;
		}
		public void setColor(String c){
			color = c;
		}
		
	//instance methods
		public double getArea(){
			return (width * height);
		}
		public double getPerimeter(){
			return (( width * 2)+( height * 2));
		}
}
