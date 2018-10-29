package MessageObjects;

public class ZCDObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDZCD = "";
    private String CalibrationDeviceUsed = "";
    private String PatientAgeatSurgery = "";
    private String CaseActioned = "";

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

    public String getSetIDZCD()
    {
        return SetIDZCD;
    }

    public void setSetIDZCD(String setIDZCD)
    {
        SetIDZCD = setIDZCD;
    }

    public String getCalibrationDeviceUsed()
    {
        return CalibrationDeviceUsed;
    }

    public void setCalibrationDeviceUsed(String calibrationDeviceUsed)
    {
        CalibrationDeviceUsed = calibrationDeviceUsed;
    }

    public String getPatientAgeatSurgery()
    {
        return PatientAgeatSurgery;
    }

    public void setPatientAgeatSurgery(String patientAgeatSurgery)
    {
        PatientAgeatSurgery = patientAgeatSurgery;
    }

    public String getCaseActioned()
    {
        return CaseActioned;
    }

    public void setCaseActioned(String caseActioned)
    {
        CaseActioned = caseActioned;
    }

    @Override
    public String toString()
    {
        return "ZCD" + FieldSeparator +
                SetIDZCD + FieldSeparator +
                CalibrationDeviceUsed + FieldSeparator +
                PatientAgeatSurgery + FieldSeparator +
                CaseActioned;
    }
}
