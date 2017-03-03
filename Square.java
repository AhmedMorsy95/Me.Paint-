import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.*;;

public class Square implements Shape {
    protected Point position;
    protected Map<String,Double>properties; 
    protected Double length;
    protected Color c,fillColor;

    public void setPosition(Point position) {
     	this.position=position;
  	}
	public void setLength(Double a) {
     	this.length=a;
  	}

  	public Point getPosition() {
    	return this.position;
  	}
  	public void setProperties(Map<String, Double> given) {
  		this.properties=given; 
  	}
    /*
  	public void setProperties(Map<String, Double> given) {
  	   properties.put("length", this.length);
	   properties.put("Area", this.length*this.length);
	   properties.put("Perimeter", this.length*4);
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
