package Builders;

import MessageObjects.NTEObject;
import MessageObjects.RGS.AIS.AISObject;

public class AISBuilder
{
    public static AISObject getAisObject()
    {
        AISObject ais = new AISObject();
        ais.setSetIDAIS("1");
        ais.setSegmentActionCode("SEGMENT_ACTION_CODE");
        ais.setUniversalServiceIdentifier("UNIVERSAL_SERVICE_IDENTIFIER");
        ais.setStartDateTime("START_DATE_TIME");
        ais.setStartDateTimeOffset("START_DATE_TIME_OFFSET");
        ais.setStartDateTimeOffsetUnits("START_DATE_TIME_OFFSET_UNITS");
        ais.setDuration("DURATION");
        ais.setDurationUnits("DURATION_UNITS");
        ais.setAllowSubstitutionCode("ALLOW_SUBSTITUTION_CODE");
        ais.setFillerStatusCode("FILLER_STATUS_CODE");
        ais.setPlacerSupplementalServiceInformation("PLACER_SUPPLEMENTAL_SERVICE_INFORMATION");
        ais.setFillerSupplementalServiceInformation("FILLER_SUPPLEMENTAL_SERVICE_INFORMATION");
        return ais;
    }

    public static String getTestAISString(String id)
    {
        return "AIS|" +
                id+"|SEGMENT_ACTION_CODE|UNIVERSAL_SERVICE_IDENTIFIER|START_DATE_TIME|START_DATE_TIME_OFFSET|" +
                "START_DATE_TIME_OFFSET_UNITS|DURATION|DURATION_UNITS|ALLOW_SUBSTITUTION_CODE|FILLER_STATUS_CODE|" +
                "PLACER_SUPPLEMENTAL_SERVICE_INFORMATION|FILLER_SUPPLEMENTAL_SERVICE_INFORMATION";
    }
}
