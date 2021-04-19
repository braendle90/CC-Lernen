package at.braendle.campus.remote.Classes;

import java.util.List;

public class Remote {


    boolean isOn;
    boolean hasPower;
    private List<Battery> batteries;

    public Remote() {
    }

    public void getStatus(int i) {


        System.out.println(batteries.get(i).getChargingstatus());


    }

    public void turnOn() {

        System.out.println("Turn ON");
    }


    public void turnOf() {
        System.out.println("Turn OF");
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }
}
