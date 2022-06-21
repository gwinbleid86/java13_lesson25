package com.company.state;

import com.company.Track;

public abstract class State {
    public abstract void changeDriver(Track track);
    public abstract void startDriving(Track track);
    public abstract void startRepair(Track track);
}
