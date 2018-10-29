package MessageObjects.PID;

public class PD1Object
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String LivingDependency = "";
    private String LivingArrangement = "";
    private String PatientPrimaryFacility = "";
    private String PatientPrimaryCareProviderNameandIDNo = "";
    private String StudentIndicator = "";
    private String Handicap = "";
    private String LivingWillCode = "";
    private String OrganDonorCode = "";
    private String SeparateBill = "";
    private String DuplicatePatient = "";
    private String PublicityCode = "";
    private String ProtectionIndicator = "";
    private String ProtectionIndicatorEffective = "";
    private String PlaceofWorship = "";
    private String AdvanceDirectiveCode = "";
    private String ImmunizationRegistryStatus = "";
    private String ImmunizationRegistryStatusEffectiveDate = "";
    private String PublicityCodeEffectiveDate = "";
    private String MilitaryBranch = "";
    private String MilitaryRankGrade = "";
    private String MilitaryStatus = "";

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

    public String getLivingDependency()
    {
        return LivingDependency;
    }

    public void setLivingDependency(String livingDependency)
    {
        LivingDependency = livingDependency;
    }

    public String getLivingArrangement()
    {
        return LivingArrangement;
    }

    public void setLivingArrangement(String livingArrangement)
    {
        LivingArrangement = livingArrangement;
    }

    public String getPatientPrimaryFacility()
    {
        return PatientPrimaryFacility;
    }

    public void setPatientPrimaryFacility(String patientPrimaryFacility)
    {
        PatientPrimaryFacility = patientPrimaryFacility;
    }

    public String getPatientPrimaryCareProviderNameandIDNo()
    {
        return PatientPrimaryCareProviderNameandIDNo;
    }

    public void setPatientPrimaryCareProviderNameandIDNo(String patientPrimaryCareProviderNameandIDNo)
    {
        PatientPrimaryCareProviderNameandIDNo = patientPrimaryCareProviderNameandIDNo;
    }

    public String getStudentIndicator()
    {
        return StudentIndicator;
    }

    public void setStudentIndicator(String studentIndicator)
    {
        StudentIndicator = studentIndicator;
    }

    public String getHandicap()
    {
        return Handicap;
    }

    public void setHandicap(String handicap)
    {
        Handicap = handicap;
    }

    public String getLivingWillCode()
    {
        return LivingWillCode;
    }

    public void setLivingWillCode(String livingWillCode)
    {
        LivingWillCode = livingWillCode;
    }

    public String getOrganDonorCode()
    {
        return OrganDonorCode;
    }

    public void setOrganDonorCode(String organDonorCode)
    {
        OrganDonorCode = organDonorCode;
    }

    public String getSeparateBill()
    {
        return SeparateBill;
    }

    public void setSeparateBill(String separateBill)
    {
        SeparateBill = separateBill;
    }

    public String getDuplicatePatient()
    {
        return DuplicatePatient;
    }

    public void setDuplicatePatient(String duplicatePatient)
    {
        DuplicatePatient = duplicatePatient;
    }

    public String getPublicityCode()
    {
        return PublicityCode;
    }

    public void setPublicityCode(String publicityCode)
    {
        PublicityCode = publicityCode;
    }

    public String getProtectionIndicator()
    {
        return ProtectionIndicator;
    }

    public void setProtectionIndicator(String protectionIndicator)
    {
        ProtectionIndicator = protectionIndicator;
    }

    public String getProtectionIndicatorEffective()
    {
        return ProtectionIndicatorEffective;
    }

    public void setProtectionIndicatorEffective(String protectionIndicatorEffective)
    {
        ProtectionIndicatorEffective = protectionIndicatorEffective;
    }

    public String getPlaceofWorship()
    {
        return PlaceofWorship;
    }

    public void setPlaceofWorship(String placeofWorship)
    {
        PlaceofWorship = placeofWorship;
    }

    public String getAdvanceDirectiveCode()
    {
        return AdvanceDirectiveCode;
    }

    public void setAdvanceDirectiveCode(String advanceDirectiveCode)
    {
        AdvanceDirectiveCode = advanceDirectiveCode;
    }

    public String getImmunizationRegistryStatus()
    {
        return ImmunizationRegistryStatus;
    }

    public void setImmunizationRegistryStatus(String immunizationRegistryStatus)
    {
        ImmunizationRegistryStatus = immunizationRegistryStatus;
    }

    public String getImmunizationRegistryStatusEffectiveDate()
    {
        return ImmunizationRegistryStatusEffectiveDate;
    }

    public void setImmunizationRegistryStatusEffectiveDate(String immunizationRegistryStatusEffectiveDate)
    {
        ImmunizationRegistryStatusEffectiveDate = immunizationRegistryStatusEffectiveDate;
    }

    public String getPublicityCodeEffectiveDate()
    {
        return PublicityCodeEffectiveDate;
    }

    public void setPublicityCodeEffectiveDate(String publicityCodeEffectiveDate)
    {
        PublicityCodeEffectiveDate = publicityCodeEffectiveDate;
    }

    public String getMilitaryBranch()
    {
        return MilitaryBranch;
    }

    public void setMilitaryBranch(String militaryBranch)
    {
        MilitaryBranch = militaryBranch;
    }

    public String getMilitaryRankGrade()
    {
        return MilitaryRankGrade;
    }

    public void setMilitaryRankGrade(String militaryRankGrade)
    {
        MilitaryRankGrade = militaryRankGrade;
    }

    public String getMilitaryStatus()
    {
        return MilitaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus)
    {
        MilitaryStatus = militaryStatus;
    }

    @Override
    public String toString()
    {
        return "PD1" + FieldSeparator +
                LivingDependency + FieldSeparator +
                LivingArrangement + FieldSeparator +
                PatientPrimaryFacility + FieldSeparator +
                PatientPrimaryCareProviderNameandIDNo + FieldSeparator +
                StudentIndicator + FieldSeparator +
                Handicap + FieldSeparator +
                LivingWillCode + FieldSeparator +
                OrganDonorCode + FieldSeparator +
                SeparateBill + FieldSeparator +
                DuplicatePatient + FieldSeparator +
                PublicityCode + FieldSeparator +
                ProtectionIndicator + FieldSeparator +
                ProtectionIndicatorEffective + FieldSeparator +
                PlaceofWorship + FieldSeparator +
                AdvanceDirectiveCode + FieldSeparator +
                ImmunizationRegistryStatus + FieldSeparator +
                ImmunizationRegistryStatusEffectiveDate + FieldSeparator +
                PublicityCodeEffectiveDate + FieldSeparator +
                MilitaryBranch + FieldSeparator +
                MilitaryRankGrade + FieldSeparator +
                MilitaryStatus;
    }
}
