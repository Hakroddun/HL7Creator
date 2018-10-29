package MessageObjects.PID;

import java.util.ArrayList;

public class PIDGroupObject
{
    private PIDObject pid;
    private PD1Object pd1;
    private PV1Object pv1;
    private PV2Object pv2;
    private ArrayList<OBXObject> obx;
    private ArrayList<DG1Object> dg1;

    public PIDObject getPid()
    {
        return pid;
    }

    public void setPid(PIDObject pid)
    {
        this.pid = pid;
    }

    public PD1Object getPd1()
    {
        return pd1;
    }

    public void setPd1(PD1Object pd1)
    {
        this.pd1 = pd1;
    }

    public PV1Object getPv1()
    {
        return pv1;
    }

    public void setPv1(PV1Object pv1)
    {
        this.pv1 = pv1;
    }

    public PV2Object getPv2()
    {
        return pv2;
    }

    public void setPv2(PV2Object pv2)
    {
        this.pv2 = pv2;
    }

    public ArrayList<OBXObject> getObx()
    {
        return obx;
    }

    public void setObx(ArrayList<OBXObject> obx)
    {
        this.obx = obx;
    }

    public ArrayList<DG1Object> getDg1()
    {
        return dg1;
    }

    public void setDg1(ArrayList<DG1Object> dg1)
    {
        this.dg1 = dg1;
    }
}
