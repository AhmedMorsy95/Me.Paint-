import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Triangle implements Shape{
    protected Point points[]=new Point[3];
    protected Map<String,Double>properties; 
    protected Color c,fillColor;
	public void setPosition(Point pos1) {
		
  	}
	public void setPosition(Point a[]) {
		for(int i=0;i<3;i++)
			this.points[i]=a[i];
  	}
    
  	public Point getPosition() {
    	return this.points[0];
  	}
  	
  	public Point[] getPoints() {
    	return this.points;
  	}
    public Double PerimeterOFTrianle(Point a[]){
    	double ret=0.0;
    	for(int i=0;i<3;i++){
    		ret+=a[i].distance(a[(i+1)%3]);
    	}
    	return ret;
    }
    public Double AreaOfTriangle(Point a[]){
    	double ret=PerimeterOFTrianle(a)/2.0;
    	double sides[] = new double[3];
    	for(int i=0;i<3;i++){
    	    sides[i]=a[i].distance(a[(i+1)%3]);
    	}
    	return Math.sqrt(ret*(ret-sides[0])*(ret-sides[1])*(ret-sides[2]));
    	///http://www.mathopenref.com/heronsformula.html
    }
    public void setProperties(Map<String, Double> given) {
  		this.properties=given; 
  	}
    /*
  	public void setProperties(Map<String, Double> properties) {
	   properties.put("perimeter", this.PerimeterOFTrianle(this.points));
	   properties.put("Area", this.AreaOfTriangle(this.points));
  	}*/

  	public Map<String, Double> getProperties() {
	   return this.properties;
  	}

  	public void setColor(Color color) {
	  this.c=color;
  	}

  	public Color getColor() {
  	  return this.c;
  	}

	public void setFillColor(Color color) {
	   this.fillColor=color;
	}

	public Color getFillColor() {
	   return this.fillColor;
	}

	public void draw(Graphics canvas) {
	   
	}
   
}
