/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.model.panel;

import edubuntututorial.imk.kelompok.listener.panel.SessionListener;

/**
 *
 * @author hendri
 */
public class SessionModel {

    private SessionListener listener;

    public SessionListener getListener() {
        return listener;
    }

    public void setListener(SessionListener listener) {
        this.listener = listener;
    }

    protected void fireOnExit(){
        if(listener!=null){
            listener.onExit();
        }
    }

    protected void fireOnAbout(){
        if(listener!=null){
            listener.About();
        }
    }

    public void onExit() {
        fireOnExit();
    }

    public void onAbout() {
        fireOnAbout();
    }
}
