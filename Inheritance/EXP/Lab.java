package EXP;

import java.util.ArrayList;

public class Lab {
    private ArrayList<LabEquipment> equipments;
    public Lab()
    {
        equipments = new ArrayList<>();
    }

    public Lab(Lab source)
    {
        this.equipments = source.equipments;
    }
    public void setLabEquipment(LabEquipment eqp , int index)
    {
        LabEquipment copy = eqp.Clone();
        this.equipments.set(index, copy);
    }
    public void addLabEquipment(LabEquipment eqp)
    {
        LabEquipment copy = eqp.Clone();
        this.equipments.add( copy);
    }
    public LabEquipment getLabEquipment( int index)
    {
    
        return this.equipments.get(index).Clone();
    }

}
