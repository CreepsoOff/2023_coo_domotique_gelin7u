import thermos.Thermostat;

public class AdapterThermostat implements Appareil {
    Thermostat thermostat;

    public AdapterThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void allumer() {
        thermostat.monterTemperature();
    }

    public void eteindre() {
        thermostat.baisserTemperature();
    }

    public String toString() {
        return "Thermostat";
    }


}
