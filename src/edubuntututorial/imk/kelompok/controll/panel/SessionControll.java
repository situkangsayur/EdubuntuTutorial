/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.controll.panel;

import edubuntututorial.imk.kelompok.model.panel.SessionModel;
import java.util.ResourceBundle.Control;

/**
 *
 * @author hendri
 */
public class SessionControll {

    private SessionModel sessionModel;

    public SessionModel getSessionModel() {
        return sessionModel;
    }

    public void setSessionModel(SessionModel sessionModel) {
        this.sessionModel = sessionModel;
    }

 

   
    public void onExit() {
        sessionModel.onExit();
    }

    public void onAbout() {
        sessionModel.onAbout();
    }
}
