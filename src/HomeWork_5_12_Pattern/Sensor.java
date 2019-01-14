package HomeWork_5_12_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Alarm> alarms = new ArrayList<>();

    public Sensor addAlarm(Alarm alarm){
        this.alarms.add(alarm);
        return this;
    }

    public void newTemperature(int temperature){
        this.checkAlarms(temperature);
    }

    private void checkAlarms(int temp){
        for(Alarm alarm :alarms){
            alarm.tempChanged(temp);
        }
    }
}