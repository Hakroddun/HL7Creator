package MessageObjects;

import MessageObjects.PID.PIDGroupObject;
import MessageObjects.RGS.RGSGroupObject;
import java.util.ArrayList;

public class HL7Object
{
    private MSHObject msh;
    private SCHObject sch;
    private ArrayList<TQ1Object> tq1;
    private ArrayList<NTEObject> nte;
    private ArrayList<PIDGroupObject> pidGroup;
    private ArrayList<RGSGroupObject> rgsGroup;
    private ZCDObject zcd;

    public MSHObject getMsh()
    {
        return msh;
    }

    public void setMsh(MSHObject msh)
    {
        this.msh = msh;
    }

    public SCHObject getSch()
    {
        return sch;
    }

    public void setSch(SCHObject sch)
    {
        this.sch = sch;
    }

    public ArrayList<TQ1Object> getTq1()
    {
        return tq1;
    }

    public void setTq1(ArrayList<TQ1Object> tq1)
    {
        this.tq1 = tq1;
    }

    public ArrayList<NTEObject> getNte()
    {
        return nte;
    }

    public void setNte(ArrayList<NTEObject> nte)
    {
        this.nte = nte;
    }

    public ArrayList<PIDGroupObject> getPidGroup()
    {
        return pidGroup;
    }

    public void setPidGroup(ArrayList<PIDGroupObject> pidGroup)
    {
        this.pidGroup = pidGroup;
    }

    public ArrayList<RGSGroupObject> getRgsGroup()
    {
        return rgsGroup;
    }

    public void setRgsGroup(ArrayList<RGSGroupObject> rgsGroup)
    {
        this.rgsGroup = rgsGroup;
    }

    public ZCDObject getZcd()
    {
        return zcd;
    }

    public void setZcd(ZCDObject zcd)
    {
        this.zcd = zcd;
    }
}
