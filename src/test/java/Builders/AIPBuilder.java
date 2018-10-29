package Builders;

import MessageObjects.RGS.AIP.AIPObject;

public class AIPBuilder
{
    public static AIPObject getAipObject()
    {
        AIPObject aip = new AIPObject();
        aip.setSetIDAIP("1");
        aip.setSegmentActionCode("SEGMENT_ACTION_CODE");
        aip.setPersonnelResourceID("PERSONNEL_RESOURCE_ID");
        aip.setResourceType("RESOURCE_TYPE");
        aip.setResourceGroup("RESOURCE_GROUP");
        aip.setStartDateTime("START_DATE_TIME");
        aip.setStartDateTimeOffset("START_DATE_TIME_OFFSET");
        aip.setStartDateTimeOffsetUnits("START_DATE_TIME_OFFSET_UNITS");
        aip.setDuration("DURATION");
        aip.setDurationUnits("DURATION_UNITS");
        aip.setAllowSubstitutionCode("ALLOW_SUBSTITUTION_CODE");
        aip.setFillerStatusCode("FILLER_STATUS_CODE");
        return aip;
    }

    public static String getTestAIPString(String id)
    {
        return "AIP|" +
                id + "|SEGMENT_ACTION_CODE|PERSONNEL_RESOURCE_ID|RESOURCE_TYPE|RESOURCE_GROUP|START_DATE_TIME|" +
                "START_DATE_TIME_OFFSET|START_DATE_TIME_OFFSET_UNITS|DURATION|DURATION_UNITS|ALLOW_SUBSTITUTION_CODE|" +
                "FILLER_STATUS_CODE";
    }
}