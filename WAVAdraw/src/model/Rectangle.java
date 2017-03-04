package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Rectangle implements Shape {
    protected Point position;
    protected Map<String,Double>properties; 
    protected Double length,width;
    protected Color c,fillColor;
	public void setPosition(Point position) {
     	this.position=position;
  	}

  	public Point getPosition() {
    	return this.position;
  	}
  	public void setProperties(Map<String, Double> given) {
  		this.properties=given; 
  	}
  /*	public void setProperties(Map<String, Double> properties) {
	   properties.put("length", this.length);
	   properties.put("width" , width);
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

