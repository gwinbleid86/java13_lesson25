package com.company.state;

import com.company.Track;

public class OnRoute extends State {
    @Override
    public void changeDriver(Track track) {
//        throw new Exception("Can not change driver...");
    }

    @Override
    public void startDriving(Track track) {
//        throw new Exception("...");
    }

    @Override
    public void startRepair(Track track) {
        track.setStateObj(new OnRepair());
    }
}
