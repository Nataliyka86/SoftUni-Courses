package MilitaryElite_06;

public interface Mission {
    String getCodeName();
    MissionState getState();
    void completeMission();
}
