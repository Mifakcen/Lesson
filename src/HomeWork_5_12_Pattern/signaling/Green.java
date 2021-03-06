package HomeWork_5_12_Pattern.signaling;

import HomeWork_5_12_Pattern.Alarm;

public class Green implements Alarm {
    boolean flag = false;
    final private int Temp = 100;

    private void setActive(boolean active) {
        flag = active;
        System.out.println(flag ? "Green alarm activated" : "Red alarm deactivated");
    }

    @Override
    public void tempChanged(int temp) {
        if (temp >= Temp) {
            if (!this.flag)
                setActive(true);
        } else if (this.flag)
            setActive(false);
    }
    @Override
    public void shutdown() {
        if(flag){
            flag = false;
            System.out.println("Green alarm shutdown and deactivated");
        } else{
            System.out.println("Green alarm shutdown");
        }
    }
}
