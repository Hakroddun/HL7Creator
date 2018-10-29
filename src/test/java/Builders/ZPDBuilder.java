package Builders;

import MessageObjects.RGS.AIG.ZPDObject;

public class ZPDBuilder
{

    public static ZPDObject getZpdObject()
    {
        ZPDObject zpd = new ZPDObject();
        zpd.setSetIDZPD("1");
        zpd.setUsedforSurgery("USED_FOR_SURGERY");
        return zpd;
    }

    public static String getTestZPDString(String id)
    {
        return "ZPD|" + id + "|USED_FOR_SURGERY";
    }
}