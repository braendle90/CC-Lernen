package at.braendle.campus.remote;

import at.braendle.campus.remote.Classes.Battery;
import at.braendle.campus.remote.Classes.Remote;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Battery> batteries = new ArrayList<>();

        Battery battery1 = new Battery();
        Battery battery2 = new Battery();

        batteries.add(battery1);
        batteries.get(0).setChargingstatus(Battery.CHARGINGSTATUS.FULL);

        batteries.add(battery2);
        batteries.get(1).setChargingstatus(Battery.CHARGINGSTATUS.EMPTY);

        Remote remote = new Remote();

        remote.setBatteries(batteries);

        remote.getStatus(0);
        remote.getStatus(1);


        batteries.get(0).setChargingstatus(Battery.CHARGINGSTATUS.FULL);




    }
}
