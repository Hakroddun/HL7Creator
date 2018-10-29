package Builders;

import MessageObjects.RGS.AIL.AILObject;

public class AILBuilder
{
    public static AILObject getAilObject()
    {
        AILObject ail = new AILObject();
        ail.setSetIDAIL("1");
        ail.setSegmentActionCode("SEGMENT_ACTION_CODE");
        ail.setLocationResourceID("LOCATION_RESOURCE_ID");
        ail.setLocationTypeAIL("LOCATION_TYPE_AIL");
        ail.setLocationGroup("LOCATION_GROUP");
        ail.setStartDateTime("START_DATE_TIME");
        ail.setStartDateTimeOffset("START_DATE_TIME_OFFSET");
        ail.setStartDateTimeOffsetUnits("START_DATE_TIME_OFFSET_UNITS");
        ail.setDuration("DURATION");
        ail.setDurationUnits("DURATION_UNITS");
        ail.setAllowSubstitutionCode("ALLOW_SUBSTITUTION_CODE");
        ail.setFillerStatusCode("FILLER_STATUS_CODE");
        return ail;
    }

    public static String getTestAILString(String id)
    {
        return "AIL|" +
                id + "|SEGMENT_ACTION_CODE|LOCATION_RESOURCE_ID|LOCATION_TYPE_AIL|LOCATION_GROUP|START_DATE_TIME|" +
                "START_DATE_TIME_OFFSET|START_DATE_TIME_OFFSET_UNITS|DURATION|DURATION_UNITS|ALLOW_SUBSTITUTION_CODE|" +
                "FILLER_STATUS_CODE";
    }
}