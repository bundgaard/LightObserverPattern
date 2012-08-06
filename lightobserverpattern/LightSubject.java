/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightobserverpattern;

/**
 *
 * @author Nova
 */
public interface LightSubject {
    public void Attach(LightObserver o);
    public void Detach(LightObserver o);
    public void Notify();
}
