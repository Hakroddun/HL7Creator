package MessageObjects.RGS.AIG;

public class AIGObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDAIG = "";
    private String SegmentActionCode = "";
    private String ResourceID = "";
    private String ResourceType = "";
    private String ResourceGroup = "";
    private String ResourceQuantity = "";
    private String ResourceQuantityUnits = "";
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

    public String getSetIDAIG()
    {
        return SetIDAIG;
    }

    public void setSetIDAIG(String setIDAIG)
    {
        SetIDAIG = setIDAIG;
    }

    public String getSegmentActionCode()
    {
        return SegmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode)
    {
        SegmentActionCode = segmentActionCode;
    }

    public String getResourceID()
    {
        return ResourceID;
    }

    public void setResourceID(String resourceID)
    {
        ResourceID = resourceID;
    }

    public String getResourceType()
    {
        return ResourceType;
    }

    public void setResourceType(String resourceType)
    {
        ResourceType = resourceType;
    }

    public String getResourceGroup()
    {
        return ResourceGroup;
    }

    public void setResourceGroup(String resourceGroup)
    {
        ResourceGroup = resourceGroup;
    }

    public String getResourceQuantity()
    {
        return ResourceQuantity;
    }

    public void setResourceQuantity(String resourceQuantity)
    {
        ResourceQuantity = resourceQuantity;
    }

    public String getResourceQuantityUnits()
    {
        return ResourceQuantityUnits;
    }

    public void setResourceQuantityUnits(String resourceQuantityUnits)
    {
        ResourceQuantityUnits = resourceQuantityUnits;
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
        return "AIG" + FieldSeparator +
                SetIDAIG + FieldSeparator +
                SegmentActionCode + FieldSeparator +
                ResourceID + FieldSeparator +
                ResourceType + FieldSeparator +
                ResourceGroup + FieldSeparator +
                ResourceQuantity + FieldSeparator +
                ResourceQuantityUnits + FieldSeparator +
                StartDateTime + FieldSeparator +
                StartDateTimeOffset + FieldSeparator +
                StartDateTimeOffsetUnits + FieldSeparator +
                Duration + FieldSeparator +
                DurationUnits + FieldSeparator +
                AllowSubstitutionCode + FieldSeparator +
                FillerStatusCode;
    }
}
