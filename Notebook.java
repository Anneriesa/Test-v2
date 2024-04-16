import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private String name;

    private int amountRAM;
    private String operatingSystem;
    private int hd ;
    private String collar;

    public Notebook(String name, int amountRAM, String operatingSystem, int hd, String collar) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.hd = hd;
        this.collar = collar;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("hd");
        list.add("collar");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", Объём ХД: " + hd +
                ", Цвет: " + collar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int gethd() {
        return hd;
    }

    public void sethd(int hd) {
        this.hd = hd;
    }

    public String getModel() {
        return collar;
    }

    public void setModel(String collar) {
        this.collar = collar;
    }
}