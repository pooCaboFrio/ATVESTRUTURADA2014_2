/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carrothread;

/**
 *
 * @author rosenhaim
 */
public class CarroThread implements Runnable{
    
    private Carro c;
    
    public CarroThread(Carro c1){
        this.c = c1;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Carro = " + c.getModelo());
        }
    
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }
    
}
