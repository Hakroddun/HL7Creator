package Builders;

import MessageObjects.RGS.RGSObject;

public class RGSBuilder
{

    public static RGSObject getRgsObject()
    {
        RGSObject rgs = new RGSObject();
        rgs.setSetIDRGS("1");
        rgs.setSegmentActionCode("SEGMENT_ACTION_CODE");
        rgs.setResourceGroupID("RESOURCE_GROUP_ID");
        return rgs;
    }

    public static String getTestRGSString(String id)
    {
        return "RGS|"+id+"|SEGMENT_ACTION_CODE|RESOURCE_GROUP_ID";
    }
}
