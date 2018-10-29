package MessageObjects.RGS.AIG;

public class ZPDObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDZPD = "";
    private String UsedforSurgery = "";

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

    public String getSetIDZPD()
    {
        return SetIDZPD;
    }

    public void setSetIDZPD(String setIDZPD)
    {
        SetIDZPD = setIDZPD;
    }

    public String getUsedforSurgery()
    {
        return UsedforSurgery;
    }

    public void setUsedforSurgery(String usedforSurgery)
    {
        UsedforSurgery = usedforSurgery;
    }

    @Override
    public String toString()
    {
        return "ZPD" + FieldSeparator +
                SetIDZPD + FieldSeparator +
                UsedforSurgery;
    }
}
