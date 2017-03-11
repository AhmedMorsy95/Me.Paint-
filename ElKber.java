/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painttrial;

import java.awt.Graphics;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kimo computer
 */
public class ElKber implements DrawingEngine {
    Shape s[];
    Stack<Shape>stack;
    ElKber(){
     s=new Shape[0];
     stack=new Stack<>();
    } 
    @Override
    public void addShape(Shape shape){
        s=Add(s,shape);
    }
    public int getSize(){
        return s.length;
    }
    /**
     *
     * @param s
     * @param element
     * @return
     */
    public Shape[] Add(Shape s[],Shape element){/// copies the array into a new
        Shape ret[]=new  Shape[s.length+1];
        System.arraycopy(s, 0, ret, 0, s.length);
        ret[ret.length-1]=element;
        return ret;
    }

    @Override
    public void removeShape(Shape shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shape[] getShapes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refresh(Graphics canvas) {
        for(int i=0;i<this.s.length;i++)
            this.s[i].draw(canvas);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Class<? extends painttrial.Shape>> getSupportedShapes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void installPluginShape(Class<? extends painttrial.Shape> shapeClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
           Shape ret[]=new  Shape[this.s.length-1];
           for(int i=0;i<ret.length;i++)
               ret[i]=this.s[i];
           this.stack.add(this.s[s.length-1]);
           this.s=ret;
    }

    @Override
    public void redo() {
      if(!this.stack.isEmpty()){
          this.addShape(stack.lastElement());
          this.stack.pop();
      }
    }
}
