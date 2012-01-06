/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.model.panel.sesi;

import edubuntututorial.imk.kelompok.listener.panel.sesi.SesiSatuListener;

/**
 *
 * @author hendri
 */
public class SesiSatuModel {

    private SesiSatuListener listener;

    public SesiSatuListener getListener() {
        return listener;
    }

    public void setListener(SesiSatuListener listener) {
        this.listener = listener;
    }

    public void fireOnInstallUbuntu() {
        if (listener != null) {
            listener.onInstallUbuntu();
        }

    }

    public void fireOnRepository() {
        if (listener != null) {
            listener.onRepository();
        }

    }

    public void fireOnSoftwareCeter() {
        if (listener != null) {
            listener.onSoftwareCeter();
        }
    }

    public void fireOnManualDownload() {
        if (listener != null) {
            listener.onManualDownload();
        }
    }

    public void getInstallUbuntu() {
        fireOnInstallUbuntu();
    }

    public void getRepository() {
        fireOnRepository();
    }

    public void getSoftwareCeter() {
        fireOnSoftwareCeter();
    }

    public void getManualDownload() {
        fireOnManualDownload();
    }
}
