package primus.pawel;

import java.util.ArrayList;
import java.util.List;

// What a "Classy" Song
// 7kyu
// https://www.youtube.com/channel/UCn_17oH3TvMOhKYEg2X-x1w
// 2022-04-14 T:18:39:30
class Exercise_424 {
    public static void main(String[] args) {

        Song mountMoose = new Song("Mount Moose", "The Snazzy Moose");


    }
}

class Song {
    private String title;
    private String artist;
    private List<String> listeners;

    Song(final String title, final String artist) {
        this.title = title;
        this.artist = artist;
        listeners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> thisDayListener) {
        int newListeners = 0;
        for (String listener : thisDayListener) {

            if (!listeners.contains(listener.toLowerCase())) {
                listeners.add(listener.toLowerCase());
                newListeners++;
            }

        }
        return newListeners;
    }
}