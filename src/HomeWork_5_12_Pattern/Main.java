package HomeWork_5_12_Pattern;

import HomeWork_5_12_Pattern.signaling.Red;
import HomeWork_5_12_Pattern.signaling.Yellow;

public class Main {
    public static void main(String[] args) {

        Alarm red = new Red();
        Alarm green = new Red();
        Alarm yellow = new Yellow();
        Sensor sensor = new Sensor();
        sensor.addAlarm(red).addAlarm(green).addAlarm(yellow);



        for (int i = 0; i < 900; i += 50) {
            System.out.println("Temperature " + i );
            sensor.newTemperature(i);
        }

        for(int i=900;i>0;i-=50){
            System.out.println("Temperature " + i );
            sensor.newTemperature(i);
        }

    }
}
