package com.company;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Track[] tracks = FileService.readFile();
        for (Track t : tracks) {
            System.out.println(t);
        }

        Track track = tracks[1];
        track.getStateObj().changeDriver(track);

        FileService.writeFile(tracks);
    }
}