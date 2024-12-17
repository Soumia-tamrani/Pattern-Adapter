import computer.*;
import computer.adapter.HdmiVgaAdapterComposition;
import computer.adapter.HdmiVgaAdapterHeritage;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVGA(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVGA(new VideoProjecteur());
        uniteCentrale.print("Hello");
//Adapter basee sur la composition:
        HdmiVgaAdapterComposition hdmiVgaAdapter = new HdmiVgaAdapterComposition();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVGA(hdmiVgaAdapter);
        hdmiVgaAdapter.print(" Bonsoir HDMi via composition");
//Adapter basee sur Heritage:
        HdmiVgaAdapterHeritage hdmiVgaAdapterH = new HdmiVgaAdapterHeritage();

        uniteCentrale.setVGA(hdmiVgaAdapterH);
        hdmiVgaAdapter.print(" Bonsoir HDMi via heritage");

        // Using Standard method to connect With VGA:
        uniteCentrale.setVGA(new SuperVP());
        uniteCentrale.print("SuperVP Using VGA");
        // Using Adapter to Connect With  HDMI:
        HdmiVgaAdapterComposition hdmiVgaAdapter1 = new HdmiVgaAdapterComposition();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentrale.setVGA(hdmiVgaAdapter1);
        uniteCentrale.print("SuperVP Using HDMI");



    }

}
