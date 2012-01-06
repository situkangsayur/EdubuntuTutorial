/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edubuntututorial.imk.kelompok.controll.panel.sesi;

import edubuntututorial.imk.kelompok.model.panel.sesi.SesiSatuModel;

/**
 *
 * @author hendri
 */
public class SesiSatuControll {

    private SesiSatuModel sesiSatuModel;

    public SesiSatuModel getSesiSatuModel() {
        return sesiSatuModel;
    }

    public void setSesiSatuModel(SesiSatuModel sesiSatuModel) {
        this.sesiSatuModel = sesiSatuModel;
    }

    public void installUbuntu() {
        sesiSatuModel.getInstallUbuntu();

    }

    public void repository() {
        sesiSatuModel.getRepository();

    }

    public void softwareCeter() {
        sesiSatuModel.getSoftwareCeter();
    }

    public void manualDownload() {
        sesiSatuModel.getManualDownload();
    }
}
