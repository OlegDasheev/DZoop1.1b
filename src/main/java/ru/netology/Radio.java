package ru.netology;

public class Radio {
    private String name;
    private int currentRadioStation;
    private boolean on;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(String name,
                 int currentRadioStation,
                 boolean on,
                 int maxRadioStation,
                 int minRadioStation,
                 int currentVolume,
                 int maxVolume,
                 int minVolume
    ) {
        this.name = name;
        this.currentRadioStation = currentRadioStation;
        this.on = on;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }


    public void changeNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }

    }

    public Radio(String name) {
        this.name = name;
    }


    public void changePrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }

    }

    public Radio(String name, int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public Radio(String name, int currentVolume, int maxVolume) {
        this.name = name;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }

    public Radio(String name, int currentVolume, int maxVolume, int minVolume) {
        this.name = name;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }
}
