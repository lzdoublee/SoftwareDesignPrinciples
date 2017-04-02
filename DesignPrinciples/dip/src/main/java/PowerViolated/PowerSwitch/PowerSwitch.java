package PowerViolated.PowerSwitch;

import PowerViolated.LightBulb.LightBulb;

/**
 * Created by L.z Double E on 4/2/2017.
 */
public class PowerSwitch {
    LightBulb bulb;
    private boolean on;
    public PowerSwitch(LightBulb lightBulb)
    {
        this.bulb = lightBulb;
        this.on = true;
    }

    public boolean isOn()
    {
        return this.on;
    }

    public void press()
    {
        boolean checkOn = isOn();
        if(checkOn)
        {
            bulb.turnBulbOff();
            this.on = false;
        }
        else
        {
            bulb.turnBulbOn();
            this.on = true;
        }
    }

}
