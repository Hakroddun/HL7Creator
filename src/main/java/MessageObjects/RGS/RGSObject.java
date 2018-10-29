package MessageObjects.RGS;

public class RGSObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDRGS = "";
    private String SegmentActionCode = "";
    private String ResourceGroupID = "";

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

    public String getSetIDRGS()
    {
        return SetIDRGS;
    }

    public void setSetIDRGS(String setIDRGS)
    {
        SetIDRGS = setIDRGS;
    }

    public String getSegmentActionCode()
    {
        return SegmentActionCode;
    }

    public void setSegmentActionCode(String segmentActionCode)
    {
        SegmentActionCode = segmentActionCode;
    }

    public String getResourceGroupID()
    {
        return ResourceGroupID;
    }

    public void setResourceGroupID(String resourceGroupID)
    {
        ResourceGroupID = resourceGroupID;
    }

    @Override
    public String toString()
    {
        return "RGS" + FieldSeparator +
                SetIDRGS + FieldSeparator +
                SegmentActionCode + FieldSeparator +
                ResourceGroupID;
    }
}
