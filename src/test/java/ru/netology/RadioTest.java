package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldUpStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.changeNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(5);
        radio.changeNextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changePrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(2);
        radio.changePrevRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.volumeUp();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.volumeDown();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void shouldMiVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}