import java.awt.Point;
import java.util.Map;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/// to test the square class
	   Square a= new Square();
       Point p= new Point(5,5);
       a.setPosition(p);
       a.setLength(5.0);
       Map<String,Double> x = new HashMap<String , Double>();
       x.put("length", 5.0);
       a.setProperties(x);
       Point b=a.getPosition();
       System.out.println(b.getX()+" "+b.getY());
       Map<String,Double>mp=a.getProperties();
       for(String name: mp.keySet()){
    	   System.out.println(name+"  =  "+mp.get(name));
       }
	} 

}
