/**
 * 
 */
package jpos.services;

import jpos.events.TransitionEvent;

/**
 * Extended event call back interface with additional transition event firing method.<br>
 * <br> 
 * This interface has been introduced to ensure runtime backward compatibility for Device Service
 * implementations which are based on the original {@link EventCallbacks} interface. Those
 * do not need to implement this new interface event if a new version of javapos-contracts 
 * containing this extended interface is used.<br>
 * Whereas new implementations may based on this interface applying the before lacking event.   
 * 
 * @author denis.kuniss@dieboldnixdorf.com
 */
public interface EventCallbacks2 extends EventCallbacks {

    public void fireTransitionEvent(TransitionEvent e);

}
