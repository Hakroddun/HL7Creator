package MessageObjects.RGS.AIP;

public class AIPObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDAIP = "";
    private String SegmentActionCode = "";
    private String PersonnelResourceID = "";
    private String ResourceType = "";
    private String ResourceGroup = "";
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

    public String getSetIDAIP()
    {
        return SetIDAIP;
    }

    public void setSetIDAIP(String setIDAIP)
    {
        SetIDAIP = setIDAIP;
    }

    public String getSegmentActionCode()
    {
        return SegmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode)
    {
        SegmentActionCode = segmentActionCode;
    }

    public String getPersonnelResourceID()
    {
        return PersonnelResourceID;
    }

    public void setPersonnelResourceID(String personnelResourceID)
    {
        PersonnelResourceID = personnelResourceID;
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
        return "AIP" + FieldSeparator +
                SetIDAIP + FieldSeparator +
                SegmentActionCode + FieldSeparator +
                PersonnelResourceID + FieldSeparator +
                ResourceType + FieldSeparator +
                ResourceGroup + FieldSeparator +
                StartDateTime + FieldSeparator +
                StartDateTimeOffset + FieldSeparator +
                StartDateTimeOffsetUnits + FieldSeparator +
                Duration + FieldSeparator +
                DurationUnits + FieldSeparator +
                AllowSubstitutionCode + FieldSeparator +
                FillerStatusCode;
    }
}
