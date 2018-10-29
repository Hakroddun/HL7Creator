package MessageObjects.RGS.AIS;

public class AISObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDAIS = "";
    private String SegmentActionCode = "";
    private String UniversalServiceIdentifier = "";
    private String StartDateTime = "";
    private String StartDateTimeOffset = "";
    private String StartDateTimeOffsetUnits = "";
    private String Duration = "";
    private String DurationUnits = "";
    private String AllowSubstitutionCode = "";
    private String FillerStatusCode = "";
    private String PlacerSupplementalServiceInformation = "";
    private String FillerSupplementalServiceInformation = "";

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

    public String getSetIDAIS()
    {
        return SetIDAIS;
    }

    public void setSetIDAIS(String setIDAIS)
    {
        SetIDAIS = setIDAIS;
    }

    public String getSegmentActionCode()
    {
        return SegmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode)
    {
        SegmentActionCode = segmentActionCode;
    }

    public String getUniversalServiceIdentifier()
    {
        return UniversalServiceIdentifier;
    }

    public void setUniversalServiceIdentifier(String universalServiceIdentifier)
    {
        UniversalServiceIdentifier = universalServiceIdentifier;
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

    public String getPlacerSupplementalServiceInformation()
    {
        return PlacerSupplementalServiceInformation;
    }

    public void setPlacerSupplementalServiceInformation(String placerSupplementalServiceInformation)
    {
        PlacerSupplementalServiceInformation = placerSupplementalServiceInformation;
    }

    public String getFillerSupplementalServiceInformation()
    {
        return FillerSupplementalServiceInformation;
    }

    public void setFillerSupplementalServiceInformation(String fillerSupplementalServiceInformation)
    {
        FillerSupplementalServiceInformation = fillerSupplementalServiceInformation;
    }

    @Override
    public String toString()
    {
        return "AIS" + FieldSeparator +
                SetIDAIS + FieldSeparator +
                SegmentActionCode + FieldSeparator +
                UniversalServiceIdentifier + FieldSeparator +
                StartDateTime + FieldSeparator +
                StartDateTimeOffset + FieldSeparator +
                StartDateTimeOffsetUnits + FieldSeparator +
                Duration + FieldSeparator +
                DurationUnits + FieldSeparator +
                AllowSubstitutionCode + FieldSeparator +
                FillerStatusCode + FieldSeparator +
                PlacerSupplementalServiceInformation + FieldSeparator +
                FillerSupplementalServiceInformation;
    }
}
