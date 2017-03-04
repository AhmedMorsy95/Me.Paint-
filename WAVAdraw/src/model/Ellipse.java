package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Ellipse implements Shape{
    protected Point position;
    protected double width,height;
    protected Map<String,Double>properties;
    protected Color c,fillColor;
	public void setPosition(Point position) {
     	this.position=position;
  	}
	public void setWidth(Double a) {
     	this.width=a;
  	}
	public void setHeight(Double a) {
     	this.height=a;
  	}
    
  	public Point getPosition() {
    	return this.position;
  	}
  	public void setProperties(Map<String, Double> given) {
  		this.properties=given; 
  	}
  	/*public void setProperties(Map<String, Double> properties) {
	   properties.put("width", this.width);
	   properties.put("height", this.height);
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
