package MessageObjects.RGS.AIL;

public class AILObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDAIL = "";
    private String SegmentActionCode = "";
    private String LocationResourceID = "";
    private String LocationTypeAIL = "";
    private String LocationGroup = "";
    private String StartDateTime = "";
    private String StartDateTimeOffset = "";
    private String StartDateTimeOffsetUnits = "";
    private String Duration = "";
    private String DurationUnits = "";
    private String AllowSubstitutionCode = "";
    private String FillerStatusCode = "";

    public String getFieldSeparator()
    {
        return FieldSeparator;
    }

    public void setFieldSeparator(String fieldSeparator)
    {
        FieldSeparator = fieldSeparator;
    }

    public String getEncodingCharacters()
    {
        return EncodingCharacters;
    }

    public void setEncodingCharacters(String encodingCharacters)
    {
        EncodingCharacters = encodingCharacters;
    }

    public String getSetIDAIL()
    {
        return SetIDAIL;
    }

    public void setSetIDAIL(String setIDAIL)
    {
        SetIDAIL = setIDAIL;
    }

    public String getSegmentActionCode()
    {
        return SegmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode)
    {
        SegmentActionCode = segmentActionCode;
    }

    public String getLocationResourceID()
    {
        return LocationResourceID;
    }

    public void setLocationResourceID(String locationResourceID)
    {
        LocationResourceID = locationResourceID;
    }

    public String getLocationTypeAIL()
    {
        return LocationTypeAIL;
    }

    public void setLocationTypeAIL(String locationTypeAIL)
    {
        LocationTypeAIL = locationTypeAIL;
    }

    public String getLocationGroup()
    {
        return LocationGroup;
    }

    public void setLocationGroup(String locationGroup)
    {
        LocationGroup = locationGroup;
    }

    public String getStartDateTime()
    {
        return StartDateTime;
    }

    public void setStartDateTime(String startDateTime)
    {
        StartDateTime = startDateTime;
    }

    public String getStartDateTimeOffset()
    {
        return StartDateTimeOffset;
    }

    public void setStartDateTimeOffset(String startDateTimeOffset)
    {
        StartDateTimeOffset = startDateTimeOffset;
    }

    public String getStartDateTimeOffsetUnits()
    {
        return StartDateTimeOffsetUnits;
    }

    public void setStartDateTimeOffsetUnits(String startDateTimeOffsetUnits)
    {
        StartDateTimeOffsetUnits = startDateTimeOffsetUnits;
    }

    public String getDuration()
    {
        return Duration;
    }

    public void setDuration(String duration)
    {
        Duration = duration;
    }

    public String getDurationUnits()
    {
        return DurationUnits;
    }

    public void setDurationUnits(String durationUnits)
    {
        DurationUnits = durationUnits;
    }

    public String getAllowSubstitutionCode()
    {
        return AllowSubstitutionCode;
    }

    public void setAllowSubstitutionCode(String allowSubstitutionCode)
    {
        AllowSubstitutionCode = allowSubstitutionCode;
    }

    public String getFillerStatusCode()
    {
        return FillerStatusCode;
    }

    public void setFillerStatusCode(String fillerStatusCode)
    {
        FillerStatusCode = fillerStatusCode;
    }

    @Override
    public String toString()
    {
        return "AIL" + FieldSeparator +
                SetIDAIL + FieldSeparator +
                SegmentActionCode + FieldSeparator +
                LocationResourceID + FieldSeparator +
                LocationTypeAIL + FieldSeparator +
                LocationGroup + FieldSeparator +
                StartDateTime + FieldSeparator +
                StartDateTimeOffset + FieldSeparator +
                StartDateTimeOffsetUnits + FieldSeparator +
                Duration + FieldSeparator +
                DurationUnits + FieldSeparator +
                AllowSubstitutionCode + FieldSeparator +
                FillerStatusCode;
    }
}
