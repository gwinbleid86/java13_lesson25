package com.company.state;

import com.company.Track;

public class OnRepair extends State{
    @Override
    public void changeDriver(Track track) {
        // throw new Exception();
    }

    @Override
    public void startDriving(Track track) {
        // random
        if (1){
            track.setStateObj(new OnBase());
        } else {
            track.setStateObj(new OnRoute());
        }
    }

    @Override
    public void startRepair(Track track) {
        // throw new Exception();
    }
}
