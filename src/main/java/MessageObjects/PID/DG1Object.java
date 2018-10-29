package MessageObjects.PID;

public class DG1Object
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDDG1 = "";
    private String DiagnosisCodingMethod = "";
    private String DiagnosisCodeDG1 = "";
    private String DiagnosisDescription = "";
    private String DiagnosisDateTime = "";
    private String DiagnosisType = "";
    private String MajorDiagnosticCategory = "";
    private String DiagnosticRelatedGroup = "";
    private String DRGApprovalIndicator = "";
    private String DRGGrouperReviewCode = "";
    private String OutlierType = "";
    private String OutlierDays = "";
    private String OutlierCost = "";
    private String GrouperVersionAndType = "";
    private String DiagnosisPriority = "";
    private String DiagnosingClinician = "";
    private String DiagnosisClassification = "";
    private String ConfidentialIndicator = "";
    private String AttestationDateTime = "";
    private String DiagnosisIdentifier = "";
    private String DiagnosisActionCode = "";

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

    public String getSetIDDG1()
    {
        return SetIDDG1;
    }

    public void setSetIDDG1(String setIDDG1)
    {
        SetIDDG1 = setIDDG1;
    }

    public String getDiagnosisCodingMethod()
    {
        return DiagnosisCodingMethod;
    }

    public void setDiagnosisCodingMethod(String diagnosisCodingMethod)
    {
        DiagnosisCodingMethod = diagnosisCodingMethod;
    }

    public String getDiagnosisCodeDG1()
    {
        return DiagnosisCodeDG1;
    }

    public void setDiagnosisCodeDG1(String diagnosisCodeDG1)
    {
        DiagnosisCodeDG1 = diagnosisCodeDG1;
    }

    public String getDiagnosisDescription()
    {
        return DiagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription)
    {
        DiagnosisDescription = diagnosisDescription;
    }

    public String getDiagnosisDateTime()
    {
        return DiagnosisDateTime;
    }

    public void setDiagnosisDateTime(String diagnosisDateTime)
    {
        DiagnosisDateTime = diagnosisDateTime;
    }

    public String getDiagnosisType()
    {
        return DiagnosisType;
    }

    public void setDiagnosisType(String diagnosisType)
    {
        DiagnosisType = diagnosisType;
    }

    public String getMajorDiagnosticCategory()
    {
        return MajorDiagnosticCategory;
    }

    public void setMajorDiagnosticCategory(String majorDiagnosticCategory)
    {
        MajorDiagnosticCategory = majorDiagnosticCategory;
    }

    public String getDiagnosticRelatedGroup()
    {
        return DiagnosticRelatedGroup;
    }

    public void setDiagnosticRelatedGroup(String diagnosticRelatedGroup)
    {
        DiagnosticRelatedGroup = diagnosticRelatedGroup;
    }

    public String getDRGApprovalIndicator()
    {
        return DRGApprovalIndicator;
    }

    public void setDRGApprovalIndicator(String DRGApprovalIndicator)
    {
        this.DRGApprovalIndicator = DRGApprovalIndicator;
    }

    public String getDRGGrouperReviewCode()
    {
        return DRGGrouperReviewCode;
    }

    public void setDRGGrouperReviewCode(String DRGGrouperReviewCode)
    {
        this.DRGGrouperReviewCode = DRGGrouperReviewCode;
    }

    public String getOutlierType()
    {
        return OutlierType;
    }

    public void setOutlierType(String outlierType)
    {
        OutlierType = outlierType;
    }

    public String getOutlierDays()
    {
        return OutlierDays;
    }

    public void setOutlierDays(String outlierDays)
    {
        OutlierDays = outlierDays;
    }

    public String getOutlierCost()
    {
        return OutlierCost;
    }

    public void setOutlierCost(String outlierCost)
    {
        OutlierCost = outlierCost;
    }

    public String getGrouperVersionAndType()
    {
        return GrouperVersionAndType;
    }

    public void setGrouperVersionAndType(String grouperVersionAndType)
    {
        GrouperVersionAndType = grouperVersionAndType;
    }

    public String getDiagnosisPriority()
    {
        return DiagnosisPriority;
    }

    public void setDiagnosisPriority(String diagnosisPriority)
    {
        DiagnosisPriority = diagnosisPriority;
    }

    public String getDiagnosingClinician()
    {
        return DiagnosingClinician;
    }

    public void setDiagnosingClinician(String diagnosingClinician)
    {
        DiagnosingClinician = diagnosingClinician;
    }

    public String getDiagnosisClassification()
    {
        return DiagnosisClassification;
    }

    public void setDiagnosisClassification(String diagnosisClassification)
    {
        DiagnosisClassification = diagnosisClassification;
    }

    public String getConfidentialIndicator()
    {
        return ConfidentialIndicator;
    }

    public void setConfidentialIndicator(String confidentialIndicator)
    {
        ConfidentialIndicator = confidentialIndicator;
    }

    public String getAttestationDateTime()
    {
        return AttestationDateTime;
    }

    public void setAttestationDateTime(String attestationDateTime)
    {
        AttestationDateTime = attestationDateTime;
    }

    public String getDiagnosisIdentifier()
    {
        return DiagnosisIdentifier;
    }

    public void setDiagnosisIdentifier(String diagnosisIdentifier)
    {
        DiagnosisIdentifier = diagnosisIdentifier;
    }

    public String getDiagnosisActionCode()
    {
        return DiagnosisActionCode;
    }

    public void setDiagnosisActionCode(String diagnosisActionCode)
    {
        DiagnosisActionCode = diagnosisActionCode;
    }

    @Override
    public String toString()
    {
        return "DG1" + FieldSeparator +
                SetIDDG1 + FieldSeparator +
                DiagnosisCodingMethod + FieldSeparator +
                DiagnosisCodeDG1 + FieldSeparator +
                DiagnosisDescription + FieldSeparator +
                DiagnosisDateTime + FieldSeparator +
                DiagnosisType + FieldSeparator +
                MajorDiagnosticCategory + FieldSeparator +
                DiagnosticRelatedGroup + FieldSeparator +
                DRGApprovalIndicator + FieldSeparator +
                DRGGrouperReviewCode + FieldSeparator +
                OutlierType + FieldSeparator +
                OutlierDays + FieldSeparator +
                OutlierCost + FieldSeparator +
                GrouperVersionAndType + FieldSeparator +
                DiagnosisPriority + FieldSeparator +
                DiagnosingClinician + FieldSeparator +
                DiagnosisClassification + FieldSeparator +
                ConfidentialIndicator + FieldSeparator +
                AttestationDateTime + FieldSeparator +
                DiagnosisIdentifier + FieldSeparator +
                DiagnosisActionCode;
    }
}
