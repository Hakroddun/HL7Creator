package Builders;

import MessageObjects.RGS.AIG.AIGObject;

public class AIGBuilder
{

    public static AIGObject getAigObject()
    {
        AIGObject aig = new AIGObject();
        aig.setSetIDAIG("1");
        aig.setSegmentActionCode("SEGMENT_ACTION_CODE");
        aig.setResourceID("RESOURCE_ID");
        aig.setResourceType("RESOURCE_TYPE");
        aig.setResourceGroup("RESOURCE_GROUP");
        aig.setResourceQuantity("RESOURCE_QUANTITY");
        aig.setResourceQuantityUnits("RESOURCE_QUANTITY_UNITS");
        aig.setStartDateTime("START_DATE_TIME");
        aig.setStartDateTimeOffset("START_DATE_TIME_OFFSET");
        aig.setStartDateTimeOffsetUnits("START_DATE_TIME_OFFSET_UNITS");
        aig.setDuration("DURATION");
        aig.setDurationUnits("DURATION_UNITS");
        aig.setAllowSubstitutionCode("ALLOW_SUBSTITUTION_CODE");
        aig.setFillerStatusCode("FILLER_STATUS_CODE");
        return aig;
    }

    public static String getTestAIGString(String id)
    {
        return "AIG|" +
                id + "|SEGMENT_ACTION_CODE|RESOURCE_ID|RESOURCE_TYPE|RESOURCE_GROUP|RESOURCE_QUANTITY|RESOURCE_QUANTITY_UNITS|" +
                "START_DATE_TIME|START_DATE_TIME_OFFSET|START_DATE_TIME_OFFSET_UNITS|DURATION|DURATION_UNITS|ALLOW_SUBSTITUTION_CODE|" +
                "FILLER_STATUS_CODE";
    }
}