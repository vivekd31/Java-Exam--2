/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthquestion;

/**
 *
 * @author Vivek Drakshapally
 */
interface program1{
   public abstract void start();
   public abstract void end();        
}
 class program2 implements program1{
    @Override
    public void start(){
        System.out.println("Start method");
    }

    @Override
    public void end() {
        System.out.println("end method");
    }
}
class program3 extends program2{
    @Override
    public void end(){
        System.out.println("end method two");
    }
}
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("Solution for question9: Vivek Drakshapally");
        program3 p3 = new program3();
        p3.start();
        p3.end();
    }
    
}
