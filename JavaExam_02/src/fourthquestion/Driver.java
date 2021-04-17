/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthquestion;

/**
 *
 * @author Vivek Drakshapally
 */
class Paymentsapp{
    public void pay(){
        System.out.println("Used to transfer money");
    }
}
class Phonepe extends Paymentsapp{
    @Override
    public void pay(){
        System.out.println("Through Phonepe");
    }
}
class Gpay extends Paymentsapp{
    @Override
    public void pay(){
        System.out.println("Through Gpay");
    }
}
class Paytm extends Paymentsapp{
    @Override
    public void pay(){
        System.out.println("Through Paytm");
    }
}

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solution for Question4: Vivek Drakshapally");
     
        Paymentsapp u2 = new Phonepe();
        u2.pay();
        Paymentsapp u3 = new Gpay();
        u3.pay();
        Paymentsapp u4 = new Paytm();
        u4.pay();
    }
    
}
