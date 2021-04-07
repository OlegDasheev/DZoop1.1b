package ru.netology;

public class Radio {
    private int currentRadioStation;
    private boolean on;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void changeNextRadioStation() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
    }

    public void changePrevRadioStation() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
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
        this.currentRadioStation = currentRadioStation;
    }


    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }
}
