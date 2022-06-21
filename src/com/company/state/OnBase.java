package com.company.state;

import com.company.Track;

public class OnBase extends State{
    @Override
    public void changeDriver(Track track) {
        /*
        track = tracks[1];
        Driver driver = drivers[1];
        track.setDriver(driver);
        System.out.println("Driver was changed");
         */
    }

    @Override
    public void startDriving(Track track) {
        /*
        Здесь прописывается логика отправки грузовика на маршрут
         */
        track.setStateObj(new OnBase());
    }

    @Override
    public void startRepair(Track track) {
        /*
        Здесь прописывается логика отправки грузовика на ремонт
         */
    }
}
