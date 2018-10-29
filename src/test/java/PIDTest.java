import MessageObjects.PID.*;
import org.junit.Assert;
import org.junit.Test;

public class PIDTest
{
    @Test
    public void CreatePID()
    {
        String testString ="PID|" +
                "1|PATIENT_ID|PATIENT_IDENTIFIER_LIST|ALTERNATE_PATIENT_ID_PID|PATIENT_NAME|MOTHERS_MAIDEN_NAME|DATE_TIME_OF_BIRTH|" +
                "ADMINISTRATIVE_SEX|PATIENT_ALIAS|RACE|PATIENT_ADDRESS|COUNTY_CODE|PHONE_NUMBER_HOME|PHONE_NUMBER_BUSINESS|PRIMARY_LANGUAGE|" +
                "MARITAL_STATUS|RELIGION|PATIENT_ACCOUNT_NUMBER|SSN_NUMBER_PATIENT|DRIVERS_LICENSE_NUMBER_PATIENT|MOTHERS_IDENTIFIER|ETHNIC_GROUP|" +
                "BIRTH_PLACE|MULTIPLE_BIRTH_INDICATOR|BIRTH_ORDER|CITIZENSHIP|VETERANS_MILITARY_STATUS|NATIONALITY|PATIENT_DEATH_DATE_AND_TIME|" +
                "PATIENT_DEATH_INDICATOR|IDENTITY_UNKNOWN_INDICATOR|IDENTITY_RELIABILITY_CODE|LAST_UPDATE_DATE_TIME|LAST_UPDATE_FACILITY|" +
                "SPECIES_CODE|BREED_CODE|STRAIN|PRODUCTION_CLASS_CODE|TRIBAL_CITIZENSHIP";
        PIDObject pid = new PIDObject();
        pid.setSetIDPID("1");
        pid.setPatientID("PATIENT_ID");
        pid.setPatientIdentifierList("PATIENT_IDENTIFIER_LIST");
        pid.setAlternatePatientIDPID("ALTERNATE_PATIENT_ID_PID");
        pid.setPatientName("PATIENT_NAME");
        pid.setMothersMaidenName("MOTHERS_MAIDEN_NAME");
        pid.setDateTimeofBirth("DATE_TIME_OF_BIRTH");
        pid.setAdministrativeSex("ADMINISTRATIVE_SEX");
        pid.setPatientAlias("PATIENT_ALIAS");
        pid.setRace("RACE");
        pid.setPatientAddress("PATIENT_ADDRESS");
        pid.setCountyCode("COUNTY_CODE");
        pid.setPhoneNumberHome("PHONE_NUMBER_HOME");
        pid.setPhoneNumberBusiness("PHONE_NUMBER_BUSINESS");
        pid.setPrimaryLanguage("PRIMARY_LANGUAGE");
        pid.setMaritalStatus("MARITAL_STATUS");
        pid.setReligion("RELIGION");
        pid.setPatientAccountNumber("PATIENT_ACCOUNT_NUMBER");
        pid.setSSNNumberPatient("SSN_NUMBER_PATIENT");
        pid.setDriversLicenseNumberPatient("DRIVERS_LICENSE_NUMBER_PATIENT");
        pid.setMothersIdentifier("MOTHERS_IDENTIFIER");
        pid.setEthnicGroup("ETHNIC_GROUP");
        pid.setBirthPlace("BIRTH_PLACE");
        pid.setMultipleBirthIndicator("MULTIPLE_BIRTH_INDICATOR");
        pid.setBirthOrder("BIRTH_ORDER");
        pid.setCitizenship("CITIZENSHIP");
        pid.setVeteransMilitaryStatus("VETERANS_MILITARY_STATUS");
        pid.setNationality("NATIONALITY");
        pid.setPatientDeathDateandTime("PATIENT_DEATH_DATE_AND_TIME");
        pid.setPatientDeathIndicator("PATIENT_DEATH_INDICATOR");
        pid.setIdentityUnknownIndicator("IDENTITY_UNKNOWN_INDICATOR");
        pid.setIdentityReliabilityCode("IDENTITY_RELIABILITY_CODE");
        pid.setLastUpdateDateTime("LAST_UPDATE_DATE_TIME");
        pid.setLastUpdateFacility("LAST_UPDATE_FACILITY");
        pid.setSpeciesCode("SPECIES_CODE");
        pid.setBreedCode("BREED_CODE");
        pid.setStrain("STRAIN");
        pid.setProductionClassCode("PRODUCTION_CLASS_CODE");
        pid.setTribalCitizenship("TRIBAL_CITIZENSHIP");
        Assert.assertEquals(testString,pid.toString());
    }

    @Test
    public void CreatePD1()
    {
        String testString ="PD1|" +
                "LIVING_DEPENDENCY|LIVING_ARRANGEMENT|PATIENT_PRIMARY_FACILITY|PATIENT_PRIMARY_CARE_PROVIDER_NAME_AND_ID_NO|STUDENT_INDICATOR|HANDICAP|" +
                "LIVING_WILL_CODE|ORGAN_DONOR_CODE|SEPARATE_BILL|DUPLICATE_PATIENT|PUBLICITY_CODE|PROTECTION_INDICATOR|PROTECTION_INDICATOR_EFFECTIVE|PLACE_OF_WORSHIP|" +
                "ADVANCE_DIRECTIVE_CODE|IMMUNIZATION_REGISTRY_STATUS|IMMUNIZATION_REGISTRY_STATUS_EFFECTIVE_DATE|PUBLICITY_CODE_EFFECTIVE_DATE|MILITARY_BRANCH|MILITARY_RANK_GRADE|" +
                "MILITARY_STATUS";
        PD1Object pd1 = new PD1Object();
        pd1.setLivingDependency("LIVING_DEPENDENCY");
        pd1.setLivingArrangement("LIVING_ARRANGEMENT");
        pd1.setPatientPrimaryFacility("PATIENT_PRIMARY_FACILITY");
        pd1.setPatientPrimaryCareProviderNameandIDNo("PATIENT_PRIMARY_CARE_PROVIDER_NAME_AND_ID_NO");
        pd1.setStudentIndicator("STUDENT_INDICATOR");
        pd1.setHandicap("HANDICAP");
        pd1.setLivingWillCode("LIVING_WILL_CODE");
        pd1.setOrganDonorCode("ORGAN_DONOR_CODE");
        pd1.setSeparateBill("SEPARATE_BILL");
        pd1.setDuplicatePatient("DUPLICATE_PATIENT");
        pd1.setPublicityCode("PUBLICITY_CODE");
        pd1.setProtectionIndicator("PROTECTION_INDICATOR");
        pd1.setProtectionIndicatorEffective("PROTECTION_INDICATOR_EFFECTIVE");
        pd1.setPlaceofWorship("PLACE_OF_WORSHIP");
        pd1.setAdvanceDirectiveCode("ADVANCE_DIRECTIVE_CODE");
        pd1.setImmunizationRegistryStatus("IMMUNIZATION_REGISTRY_STATUS");
        pd1.setImmunizationRegistryStatusEffectiveDate("IMMUNIZATION_REGISTRY_STATUS_EFFECTIVE_DATE");
        pd1.setPublicityCodeEffectiveDate("PUBLICITY_CODE_EFFECTIVE_DATE");
        pd1.setMilitaryBranch("MILITARY_BRANCH");
        pd1.setMilitaryRankGrade("MILITARY_RANK_GRADE");
        pd1.setMilitaryStatus("MILITARY_STATUS");
        Assert.assertEquals(testString,pd1.toString());
    }

    @Test
    public void CreatePV1()
    {
        String testString ="PV1|" +
                "1|PATIENT_CLASS|ASSIGNED_PATIENT_LOCATION|ADMISSION_TYPE|PREADMIT_NUMBER|" +
                "PRIOR_PATIENT_LOCATION|ATTENDING_DOCTOR|REFERRING_DOCTOR|CONSULTING_DOCTOR|HOSPITAL_SERVICE|TEMPORARY_LOCATION|" +
                "PREADMIT_TEST_INDICATOR|READMISSION_INDICATOR|ADMIT_SOURCE|AMBULATORY_STATUS|VIP_INDICATOR|ADMITTING_DOCTOR|" +
                "PATIENT_TYPE|VISIT_NUMBER|FINANCIAL_CLASS|CHARGE_PRICE_INDICATOR|COURTESY_CODE|CREDIT_RATING|CONTRACT_CODE|" +
                "CONTRACT_EFFECTIVE_DATE|CONTRACT_AMOUNT|CONTRACT_PERIOD|INTEREST_CODE|TRANSFER_TO_BAD_DEBT_CODE|TRANSFER_TO_BAD_DEBT_DATE|" +
                "BAD_DEBT_AGENCY_CODE|BAD_DEBT_TRANSFER_AMOUNT|BAD_DEBT_RECOVERY_AMOUNT|DELETE_ACCOUNT_INDICATOR|DELETE_ACCOUNT_DATE|" +
                "DISCHARGE_DISPOSITION|DISCHARGED_TO_LOCATION|DIET_TYPE|SERVICING_FACILITY|BED_STATUS|ACCOUNT_STATUS|PENDING_LOCATION|" +
                "PRIOR_TEMPORARY_LOCATION|ADMIT_DATE_TIME|DISCHARGE_DATE_TIME|CURRENT_PATIENT_BALANCE|TOTAL_CHARGES|TOTAL_ADJUSTMENTS|" +
                "TOTAL_PAYMENTS|ALTERNATE_VISIT_ID|VISIT_INDICATOR|OTHER_HEALTHCARE_PROVIDER";
        PV1Object pv1 = new PV1Object();
        pv1.setSetIDPV1("1");
        pv1.setPatientClass("PATIENT_CLASS");
        pv1.setAssignedPatientLocation("ASSIGNED_PATIENT_LOCATION");
        pv1.setAdmissionType("ADMISSION_TYPE");
        pv1.setPreadmitNumber("PREADMIT_NUMBER");
        pv1.setPriorPatientLocation("PRIOR_PATIENT_LOCATION");
        pv1.setAttendingDoctor("ATTENDING_DOCTOR");
        pv1.setReferringDoctor("REFERRING_DOCTOR");
        pv1.setConsultingDoctor("CONSULTING_DOCTOR");
        pv1.setHospitalService("HOSPITAL_SERVICE");
        pv1.setTemporaryLocation("TEMPORARY_LOCATION");
        pv1.setPreadmitTestIndicator("PREADMIT_TEST_INDICATOR");
        pv1.setReadmissionIndicator("READMISSION_INDICATOR");
        pv1.setAdmitSource("ADMIT_SOURCE");
        pv1.setAmbulatoryStatus("AMBULATORY_STATUS");
        pv1.setVIPIndicator("VIP_INDICATOR");
        pv1.setAdmittingDoctor("ADMITTING_DOCTOR");
        pv1.setPatientType("PATIENT_TYPE");
        pv1.setVisitNumber("VISIT_NUMBER");
        pv1.setFinancialClass("FINANCIAL_CLASS");
        pv1.setChargePriceIndicator("CHARGE_PRICE_INDICATOR");
        pv1.setCourtesyCode("COURTESY_CODE");
        pv1.setCreditRating("CREDIT_RATING");
        pv1.setContractCode("CONTRACT_CODE");
        pv1.setContractEffectiveDate("CONTRACT_EFFECTIVE_DATE");
        pv1.setContractAmount("CONTRACT_AMOUNT");
        pv1.setContractPeriod("CONTRACT_PERIOD");
        pv1.setInterestCode("INTEREST_CODE");
        pv1.setTransfertoBadDebtCode("TRANSFER_TO_BAD_DEBT_CODE");
        pv1.setTransfertoBadDebtDate("TRANSFER_TO_BAD_DEBT_DATE");
        pv1.setBadDebtAgencyCode("BAD_DEBT_AGENCY_CODE");
        pv1.setBadDebtTransferAmount("BAD_DEBT_TRANSFER_AMOUNT");
        pv1.setBadDebtRecoveryAmount("BAD_DEBT_RECOVERY_AMOUNT");
        pv1.setDeleteAccountIndicator("DELETE_ACCOUNT_INDICATOR");
        pv1.setDeleteAccountDate("DELETE_ACCOUNT_DATE");
        pv1.setDischargeDisposition("DISCHARGE_DISPOSITION");
        pv1.setDischargedtoLocation("DISCHARGED_TO_LOCATION");
        pv1.setDietType("DIET_TYPE");
        pv1.setServicingFacility("SERVICING_FACILITY");
        pv1.setBedStatus("BED_STATUS");
        pv1.setAccountStatus("ACCOUNT_STATUS");
        pv1.setPendingLocation("PENDING_LOCATION");
        pv1.setPriorTemporaryLocation("PRIOR_TEMPORARY_LOCATION");
        pv1.setAdmitDateTime("ADMIT_DATE_TIME");
        pv1.setDischargeDateTime("DISCHARGE_DATE_TIME");
        pv1.setCurrentPatientBalance("CURRENT_PATIENT_BALANCE");
        pv1.setTotalCharges("TOTAL_CHARGES");
        pv1.setTotalAdjustments("TOTAL_ADJUSTMENTS");
        pv1.setTotalPayments("TOTAL_PAYMENTS");
        pv1.setAlternateVisitID("ALTERNATE_VISIT_ID");
        pv1.setVisitIndicator("VISIT_INDICATOR");
        pv1.setOtherHealthcareProvider("OTHER_HEALTHCARE_PROVIDER");
        Assert.assertEquals(testString,pv1.toString());
    }

    @Test
    public void CreatePV2()
    {
        String testString ="PV2|" +
                "PRIOR_PENDING_LOCATION|ACCOMMODATION_CODE|ADMIT_REASON|TRANSFER_REASON|PATIENT_VALUABLES|PATIENT_VALUABLES_LOCATION|" +
                "VISIT_USER_CODE|EXPECTED_ADMIT_DATE_TIME|EXPECTED_DISCHARGE_DATE_TIME|ESTIMATED_LENGTH_OF_INPATIENT_STAY|" +
                "ACTUAL_LENGTH_OF_INPATIENT_STAY|VISIT_DESCRIPTION|REFERRAL_SOURCE_CODE|PREVIOUS_SERVICE_DATE|EMPLOYMENT_ILLNESS_RELATED_INDICATOR|" +
                "PURGE_STATUS_CODE|PURGE_STATUS_DATE|SPECIAL_PROGRAM_CODE|RETENTION_INDICATOR|EXPECTED_NUMBER_OF_INSURANCE_PLANS|" +
                "VISIT_PUBLICITY_CODE|VISIT_PROTECTION_INDICATOR|CLINIC_ORGANIZATION_NAME|PATIENT_STATUS_CODE|VISIT_PRIORITY_CODE|" +
                "PREVIOUS_TREATMENT_DATE|EXPECTED_DISCHARGE_DISPOSITION|SIGNATURE_ON_FILE_DATE|FIRST_SIMILAR_ILLNESS_DATE|" +
                "PATIENT_CHARGE_ADJUSTMENT_CODE|RECURRING_SERVICE_CODE|BILLING_MEDIA_CODE|EXPECTED_SURGERY_DATE_AND_TIME|" +
                "MILITARY_PARTNERSHIP_CODE|MILITARY_NON_AVAILABILITY_CODE|NEWBORN_BABY_INDICATOR|BABY_DETAINED_INDICATOR|" +
                "MODE_OF_ARRIVAL_CODE|RECREATIONAL_DRUG_USE_CODE|ADMISSION_LEVEL_OF_CARE_CODE|PRECAUTION_CODE|PATIENT_CONDITION_CODE|" +
                "LIVING_WILL_CODE|ORGAN_DONOR_CODE|ADVANCE_DIRECTIVE_CODE|PATIENT_STATUS_EFFECTIVE_DATE|EXPECTED_LOA_RETURN_DATE_TIME|" +
                "EXPECTED_PREADMISSION_TESTING_DATE_TIME|NOTIFY_CLERGY_CODE";
        PV2Object pv2 = new PV2Object();
        pv2.setPriorPendingLocation("PRIOR_PENDING_LOCATION");
        pv2.setAccommodationCode("ACCOMMODATION_CODE");
        pv2.setAdmitReason("ADMIT_REASON");
        pv2.setTransferReason("TRANSFER_REASON");
        pv2.setPatientValuables("PATIENT_VALUABLES");
        pv2.setPatientValuablesLocation("PATIENT_VALUABLES_LOCATION");
        pv2.setVisitUserCode("VISIT_USER_CODE");
        pv2.setExpectedAdmitDateTime("EXPECTED_ADMIT_DATE_TIME");
        pv2.setExpectedDischargeDateTime("EXPECTED_DISCHARGE_DATE_TIME");
        pv2.setEstimatedLengthofInpatientStay("ESTIMATED_LENGTH_OF_INPATIENT_STAY");
        pv2.setActualLengthofInpatientStay("ACTUAL_LENGTH_OF_INPATIENT_STAY");
        pv2.setVisitDescription("VISIT_DESCRIPTION");
        pv2.setReferralSourceCode("REFERRAL_SOURCE_CODE");
        pv2.setPreviousServiceDate("PREVIOUS_SERVICE_DATE");
        pv2.setEmploymentIllnessRelatedIndicator("EMPLOYMENT_ILLNESS_RELATED_INDICATOR");
        pv2.setPurgeStatusCode("PURGE_STATUS_CODE");
        pv2.setPurgeStatusDate("PURGE_STATUS_DATE");
        pv2.setSpecialProgramCode("SPECIAL_PROGRAM_CODE");
        pv2.setRetentionIndicator("RETENTION_INDICATOR");
        pv2.setExpectedNumberofInsurancePlans("EXPECTED_NUMBER_OF_INSURANCE_PLANS");
        pv2.setVisitPublicityCode("VISIT_PUBLICITY_CODE");
        pv2.setVisitProtectionIndicator("VISIT_PROTECTION_INDICATOR");
        pv2.setClinicOrganizationName("CLINIC_ORGANIZATION_NAME");
        pv2.setPatientStatusCode("PATIENT_STATUS_CODE");
        pv2.setVisitPriorityCode("VISIT_PRIORITY_CODE");
        pv2.setPreviousTreatmentDate("PREVIOUS_TREATMENT_DATE");
        pv2.setExpectedDischargeDisposition("EXPECTED_DISCHARGE_DISPOSITION");
        pv2.setSignatureonFileDate("SIGNATURE_ON_FILE_DATE");
        pv2.setFirstSimilarIllnessDate("FIRST_SIMILAR_ILLNESS_DATE");
        pv2.setPatientChargeAdjustmentCode("PATIENT_CHARGE_ADJUSTMENT_CODE");
        pv2.setRecurringServiceCode("RECURRING_SERVICE_CODE");
        pv2.setBillingMediaCode("BILLING_MEDIA_CODE");
        pv2.setExpectedSurgeryDateandTime("EXPECTED_SURGERY_DATE_AND_TIME");
        pv2.setMilitaryPartnershipCode("MILITARY_PARTNERSHIP_CODE");
        pv2.setMilitaryNonAvailabilityCode("MILITARY_NON_AVAILABILITY_CODE");
        pv2.setNewbornBabyIndicator("NEWBORN_BABY_INDICATOR");
        pv2.setBabyDetainedIndicator("BABY_DETAINED_INDICATOR");
        pv2.setModeofArrivalCode("MODE_OF_ARRIVAL_CODE");
        pv2.setRecreationalDrugUseCode("RECREATIONAL_DRUG_USE_CODE");
        pv2.setAdmissionLevelofCareCode("ADMISSION_LEVEL_OF_CARE_CODE");
        pv2.setPrecautionCode("PRECAUTION_CODE");
        pv2.setPatientConditionCode("PATIENT_CONDITION_CODE");
        pv2.setLivingWillCode("LIVING_WILL_CODE");
        pv2.setOrganDonorCode("ORGAN_DONOR_CODE");
        pv2.setAdvanceDirectiveCode("ADVANCE_DIRECTIVE_CODE");
        pv2.setPatientStatusEffectiveDate("PATIENT_STATUS_EFFECTIVE_DATE");
        pv2.setExpectedLOAReturnDateTime("EXPECTED_LOA_RETURN_DATE_TIME");
        pv2.setExpectedPreadmissionTestingDateTime("EXPECTED_PREADMISSION_TESTING_DATE_TIME");
        pv2.setNotifyClergyCode("NOTIFY_CLERGY_CODE");
        Assert.assertEquals(testString,pv2.toString());
    }

    @Test
    public void CreateOBX()
    {
        String testString ="OBX|" +
                "1|VALUE_TYPE|OBSERVATION_IDENTIFIER|OBSERVATION_SUB_ID|OBSERVATION_VALUE|UNITS|REFERENCES_RANGE|" +
                "ABNORMAL_FLAGS|PROBABILITY|NATURE_OF_ABNORMAL_TEST|OBSERVATION_RESULT_STATUS|EFFECTIVE_DATE_OF_REFERENCERANGE|" +
                "USER_DEFINED_ACCESS_CHECKS|DATE_TIME_OF_THE_OBSERVATION|PRODUCERS_REFERENCE|RESPONSIBLE_OBSERVER|OBSERVATION_METHOD|" +
                "EQUIPMENT_INSTANCE_IDENTIFIER|DATE_TIME_OF_THE_ANALYSIS|RESV_FOR_HARMON_WITH_V2620|RESV_FOR_HARMON_WITH_V2621|" +
                "RESV_FOR_HARMON_WITH_V2622|PERFORMING_ORGANIZATION_NAME|PERFORMING_ORGANIZATION_ADDRESS|PERFORMING_ORGANIZATION_MEDICAL_DIRECTOR";
        OBXObject obx = new OBXObject();
        obx.setSetIDOBX("1");
        obx.setValueType("VALUE_TYPE");
        obx.setObservationIdentifier("OBSERVATION_IDENTIFIER");
        obx.setObservationSubID("OBSERVATION_SUB_ID");
        obx.setObservationValue("OBSERVATION_VALUE");
        obx.setUnits("UNITS");
        obx.setReferencesRange("REFERENCES_RANGE");
        obx.setAbnormalFlags("ABNORMAL_FLAGS");
        obx.setProbability("PROBABILITY");
        obx.setNatureofAbnormalTest("NATURE_OF_ABNORMAL_TEST");
        obx.setObservationResultStatus("OBSERVATION_RESULT_STATUS");
        obx.setEffectiveDateofReferenceRange("EFFECTIVE_DATE_OF_REFERENCERANGE");
        obx.setUserDefinedAccessChecks("USER_DEFINED_ACCESS_CHECKS");
        obx.setDateTimeoftheObservation("DATE_TIME_OF_THE_OBSERVATION");
        obx.setProducersReference("PRODUCERS_REFERENCE");
        obx.setResponsibleObserver("RESPONSIBLE_OBSERVER");
        obx.setObservationMethod("OBSERVATION_METHOD");
        obx.setEquipmentInstanceIdentifier("EQUIPMENT_INSTANCE_IDENTIFIER");
        obx.setDateTimeoftheAnalysis("DATE_TIME_OF_THE_ANALYSIS");
        obx.setResvForHarmonWithV2620("RESV_FOR_HARMON_WITH_V2620");
        obx.setResvForHarmonWithV2621("RESV_FOR_HARMON_WITH_V2621");
        obx.setResvForHarmonWithV2622("RESV_FOR_HARMON_WITH_V2622");
        obx.setPerformingOrganizationName("PERFORMING_ORGANIZATION_NAME");
        obx.setPerformingOrganizationAddress("PERFORMING_ORGANIZATION_ADDRESS");
        obx.setPerformingOrganizationMedicalDirector("PERFORMING_ORGANIZATION_MEDICAL_DIRECTOR");
        Assert.assertEquals(testString,obx.toString());
    }

    @Test
    public void CreateDG1()
    {
        String testString ="DG1|" +
                "1|DIAGNOSIS_CODING_METHOD|DIAGNOSIS_CODE_DG1|DIAGNOSIS_DESCRIPTION|DIAGNOSIS_DATE_TIME|" +
                "DIAGNOSIS_TYPE|MAJOR_DIAGNOSTIC_CATEGORY|DIAGNOSTIC_RELATED_GROUP|DRG_APPROVAL_INDICATOR|" +
                "DRG_GROUPER_REVIEW_CODE|OUTLIER_TYPE|OUTLIER_DAYS|OUTLIER_COST|GROUPER_VERSION_AND_TYPE|" +
                "DIAGNOSIS_PRIORITY|DIAGNOSING_CLINICIAN|DIAGNOSIS_CLASSIFICATION|CONFIDENTIAL_INDICATOR|" +
                "ATTESTATION_DATE_TIME|DIAGNOSIS_IDENTIFIER|DIAGNOSIS_ACTIONCODE" ;
        DG1Object dg1 = new DG1Object();
        dg1.setSetIDDG1("1");
        dg1.setDiagnosisCodingMethod("DIAGNOSIS_CODING_METHOD");
        dg1.setDiagnosisCodeDG1("DIAGNOSIS_CODE_DG1");
        dg1.setDiagnosisDescription("DIAGNOSIS_DESCRIPTION");
        dg1.setDiagnosisDateTime("DIAGNOSIS_DATE_TIME");
        dg1.setDiagnosisType("DIAGNOSIS_TYPE");
        dg1.setMajorDiagnosticCategory("MAJOR_DIAGNOSTIC_CATEGORY");
        dg1.setDiagnosticRelatedGroup("DIAGNOSTIC_RELATED_GROUP");
        dg1.setDRGApprovalIndicator("DRG_APPROVAL_INDICATOR");
        dg1.setDRGGrouperReviewCode("DRG_GROUPER_REVIEW_CODE");
        dg1.setOutlierType("OUTLIER_TYPE");
        dg1.setOutlierDays("OUTLIER_DAYS");
        dg1.setOutlierCost("OUTLIER_COST");
        dg1.setGrouperVersionAndType("GROUPER_VERSION_AND_TYPE");
        dg1.setDiagnosisPriority("DIAGNOSIS_PRIORITY");
        dg1.setDiagnosingClinician("DIAGNOSING_CLINICIAN");
        dg1.setDiagnosisClassification("DIAGNOSIS_CLASSIFICATION");
        dg1.setConfidentialIndicator("CONFIDENTIAL_INDICATOR");
        dg1.setAttestationDateTime("ATTESTATION_DATE_TIME");
        dg1.setDiagnosisIdentifier("DIAGNOSIS_IDENTIFIER");
        dg1.setDiagnosisActionCode("DIAGNOSIS_ACTIONCODE");
        Assert.assertEquals(testString,dg1.toString());
    }

}
