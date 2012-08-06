/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightobserverpattern;

import java.util.ArrayList;

/**
 *
 * @author Nova
 */
public class LightObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horn h = new Horn();
        Alarm a = new Alarm();
        a.Attach(h);
        a.Notify();
        a.Detach(h);
    }
    
    static class Horn implements LightObserver
    {
        @Override
        public void Notify()
        {
            System.out.println("Alarm went off!");
        }
        
        
    }
    static class Alarm implements LightSubject
    {
        public ArrayList<LightObserver> observers;
        public Alarm()
        {
            observers = new ArrayList<>();
        }

        @Override
        public void Attach(LightObserver o) {
            observers.add(o);
        }

        @Override
        public void Detach(LightObserver o) {
            observers.remove(o);
        }

        @Override
        public void Notify() {
            for(LightObserver o : observers){
                o.Notify();
            }
        }
    }
}
