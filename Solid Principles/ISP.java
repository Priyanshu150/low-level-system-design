// Violation 
interface SmartDevice {
    void turnOn();
    void turnOff();
    void setTemperature(int degrees);
    void playMusic(String song);
}

// Solution 

interface Switchable {
    void turnOn();
    void turnOff();
}

interface TemperatureControllable {
    void setTemperature(int degrees);
}

interface MusicPlayable {
    void playMusic(String song);
}

// SmartLight implements only Switchable.
// SmartThermostat implements both Switchable and TemperatureControllable.
// SmartSpeaker implements both Switchable and MusicPlayable.