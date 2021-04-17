/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eighthquestion;

/**
 *
 * @author Vivek Drakshapally
 */

 abstract class Interview{
    public abstract void aptitude ();
    public abstract void groupdiscussion();
    public abstract void technicalround();
    public abstract void hrround();
}
 
abstract class Day1 extends Interview{
    @Override
    public void aptitude(){
        System.out.println("First round of the Interview is Aptitude");
    }
}

abstract class Day2 extends Day1{
    @Override
    public void groupdiscussion(){
        System.out.println("Second round of the Interview is GroupDiscussion");
    }
    @Override
    public void technicalround(){
        System.out.println("Thid round of the Interview is Technicalround");
    }
}

class Day3 extends Day2{
    @Override
    public void hrround(){
        System.out.println("Last round of the Interview is hr");
    }
}
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Question8: Vivek Drakshapally");
        Day3 ref = new Day3();
        ref.aptitude();
        ref.groupdiscussion();
        ref.technicalround();
        ref.hrround();
    }
    
}
