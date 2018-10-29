package MessageObjects;

public class TQ1Object
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDTQ1 = "";
    private String Quantity = "";
    private String RepeatPattern = "";
    private String ExplicitTime = "";
    private String RelativeTimeandUnits = "";
    private String ServiceDuration = "";
    private String Startdatetime = "";
    private String Enddatetime = "";
    private String Priority = "";
    private String Conditiontext = "";
    private String Textinstruction = "";
    private String Conjunction = "";
    private String Occurrenceduration = "";
    private String Totaloccurrences = "";

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

    public String getSetIDTQ1()
    {
        return SetIDTQ1;
    }

    public void setSetIDTQ1(String setIDTQ1)
    {
        SetIDTQ1 = setIDTQ1;
    }

    public String getQuantity()
    {
        return Quantity;
    }

    public void setQuantity(String quantity)
    {
        Quantity = quantity;
    }

    public String getRepeatPattern()
    {
        return RepeatPattern;
    }

    public void setRepeatPattern(String repeatPattern)
    {
        RepeatPattern = repeatPattern;
    }

    public String getExplicitTime()
    {
        return ExplicitTime;
    }

    public void setExplicitTime(String explicitTime)
    {
        ExplicitTime = explicitTime;
    }

    public String getRelativeTimeandUnits()
    {
        return RelativeTimeandUnits;
    }

    public void setRelativeTimeandUnits(String relativeTimeandUnits)
    {
        RelativeTimeandUnits = relativeTimeandUnits;
    }

    public String getServiceDuration()
    {
        return ServiceDuration;
    }

    public void setServiceDuration(String serviceDuration)
    {
        ServiceDuration = serviceDuration;
    }

    public String getStartdatetime()
    {
        return Startdatetime;
    }

    public void setStartdatetime(String startdatetime)
    {
        Startdatetime = startdatetime;
    }

    public String getEnddatetime()
    {
        return Enddatetime;
    }

    public void setEnddatetime(String enddatetime)
    {
        Enddatetime = enddatetime;
    }

    public String getPriority()
    {
        return Priority;
    }

    public void setPriority(String priority)
    {
        Priority = priority;
    }

    public String getConditiontext()
    {
        return Conditiontext;
    }

    public void setConditiontext(String conditiontext)
    {
        Conditiontext = conditiontext;
    }

    public String getTextinstruction()
    {
        return Textinstruction;
    }

    public void setTextinstruction(String textinstruction)
    {
        Textinstruction = textinstruction;
    }

    public String getConjunction()
    {
        return Conjunction;
    }

    public void setConjunction(String conjunction)
    {
        Conjunction = conjunction;
    }

    public String getOccurrenceduration()
    {
        return Occurrenceduration;
    }

    public void setOccurrenceduration(String occurrenceduration)
    {
        Occurrenceduration = occurrenceduration;
    }

    public String getTotaloccurrences()
    {
        return Totaloccurrences;
    }

    public void setTotaloccurrences(String totaloccurrences)
    {
        Totaloccurrences = totaloccurrences;
    }

    @Override
    public String toString()
    {
        return "TQ1" + FieldSeparator +
                SetIDTQ1 + FieldSeparator +
                Quantity + FieldSeparator +
                RepeatPattern + FieldSeparator +
                ExplicitTime + FieldSeparator +
                RelativeTimeandUnits + FieldSeparator +
                ServiceDuration + FieldSeparator +
                Startdatetime + FieldSeparator +
                Enddatetime + FieldSeparator +
                Priority + FieldSeparator +
                Conditiontext + FieldSeparator +
                Textinstruction + FieldSeparator +
                Conjunction + FieldSeparator +
                Occurrenceduration + FieldSeparator +
                Totaloccurrences;
    }
}
