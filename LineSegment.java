import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class LineSegment implements Shape{
    protected Point points[] = new Point[2];
    protected Map<String,Double>properties; 
    protected Color c,fillColor;
	public void setPosition(Point pos1) {
		
  	}
	public void setPosition(Point a[]) {
		for(int i=0;i<2;i++)
			this.points[i]=a[i];
  	}
    
  	public Point getPosition() {
    	return this.points[0];
  	}
  	public Point[] getPosition2() {
    	return this.points;
  	}

  	public void setProperties(Map<String, Double> given) {
  		this.properties=given; 
  	}
  	/*public void setProperties(Map<String, Double> properties) {
	   properties.put("length", this.points[0].distance(this.points[1]));
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
