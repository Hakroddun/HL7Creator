import MessageObjects.*;
import org.junit.Assert;
import org.junit.Test;

public class HL7Test
{
    @Test
    public void CreateMSH()
    {
        String testString = "MSH|" +
                "^~\\&|SENDING_APPLICATION|SENDING_FACILITY|RECEIVING_APPLICATION|RECEIVING_FACILITY|DATE_TIME_OF_MESSAGE|SECURITY|" +
                "MESSAGE_TYPE|MESSAGE_CONTROL_ID|PROCESSING_ID|VERSION_ID|SEQUENCE_NUMBER|CONTINUATION_POINTER|ACCEPT_ACKNOWLEDGE_TYPE|" +
                "APPLICATION_ACKNOWLEDGE_TYPE|COUNTRY_CODE|CHARACTER_SET|PRINCIPAL_LANGUAGE_OF_MESSAGE|ALT_CHARSET_HANDLING_SCHEME|MESSAGE_PROFILE_IDENTIFIER";
        MSHObject msh = new MSHObject();
        msh.setFieldSeparator("|");
        msh.setEncodingCharacters("^~\\&");
        msh.setSendingApplication("SENDING_APPLICATION");
        msh.setSendingFacility("SENDING_FACILITY");
        msh.setReceivingApplication("RECEIVING_APPLICATION");
        msh.setReceivingFacility("RECEIVING_FACILITY");
        msh.setDateTimeOfMessage("DATE_TIME_OF_MESSAGE");
        msh.setSecurity("SECURITY");
        msh.setMessageType("MESSAGE_TYPE");
        msh.setMessageControlID("MESSAGE_CONTROL_ID");
        msh.setProcessingID("PROCESSING_ID");
        msh.setVersionID("VERSION_ID");
        msh.setSequenceNumber("SEQUENCE_NUMBER");
        msh.setContinuationPointer("CONTINUATION_POINTER");
        msh.setAcceptAcknowledgmentType("ACCEPT_ACKNOWLEDGE_TYPE");
        msh.setApplicationAcknowledgmentType("APPLICATION_ACKNOWLEDGE_TYPE");
        msh.setCountryCode("COUNTRY_CODE");
        msh.setCharacterSet("CHARACTER_SET");
        msh.setPrincipalLanguageOfMessage("PRINCIPAL_LANGUAGE_OF_MESSAGE");
        msh.setAltCharsetHandlingScheme("ALT_CHARSET_HANDLING_SCHEME");
        msh.setMessageProfileIdentifier("MESSAGE_PROFILE_IDENTIFIER");
        Assert.assertEquals(testString,msh.toString());
    }

    @Test
    public void CreateSCH()
    {
        String testString = "SCH|" +
                "PLACER_APPOINTMENT_ID|FILLER_APPOINTMENT_ID|OCCURRENCE_NUMBER|PLACER_GROUP_NUMBER|SCHEDULE_ID|EVENT_REASON|APPOINTMENT_REASON|" +
                "APPOINTMENT_TYPE|APPOINTMENT_DURATION|APPOINTMENT_DURATION_UNITS|APPOINTMENT_TIMING_QUANTITY|PLACER_CONTACT_PERSON|PLACER_CONTACT_PHONE_NUMBER|" +
                "PLACER_CONTACT_ADDRESS|PLACER_CONTACT_LOCATION|FILLER_CONTACT_PERSON|FILLER_CONTACT_PHONE_NUMBER|FILLER_CONTACT_ADDRESS|FILLER_CONTACT_LOCATION|" +
                "ENTERED_BY_PERSON|ENTERED_BY_PHONE_NUMBER|ENTERED_BY_LOCATION|PARENT_PLACER_APPOINTMENT_ID|PARENT_FILLER_APPOINTMENT_ID|FILLER_STATUS_CODE|" +
                "PLACER_ORDER_NUMBER|FILLER_ORDER_NUMBER";
        SCHObject sch = new SCHObject();
        sch.setPlacerAppointmentID("PLACER_APPOINTMENT_ID");
        sch.setFillerAppointmentID("FILLER_APPOINTMENT_ID");
        sch.setOccurrenceNumber("OCCURRENCE_NUMBER");
        sch.setPlacerGroupNumber("PLACER_GROUP_NUMBER");
        sch.setScheduleID("SCHEDULE_ID");
        sch.setEventReason("EVENT_REASON");
        sch.setAppointmentReason("APPOINTMENT_REASON");
        sch.setAppointmentType("APPOINTMENT_TYPE");
        sch.setAppointmentDuration("APPOINTMENT_DURATION");
        sch.setAppointmentDurationUnits("APPOINTMENT_DURATION_UNITS");
        sch.setAppointmentTimingQuantity("APPOINTMENT_TIMING_QUANTITY");
        sch.setPlacerContactPerson("PLACER_CONTACT_PERSON");
        sch.setPlacerContactPhoneNumber("PLACER_CONTACT_PHONE_NUMBER");
        sch.setPlacerContactAddress("PLACER_CONTACT_ADDRESS");
        sch.setPlacerContactLocation("PLACER_CONTACT_LOCATION");
        sch.setFillerContactPerson("FILLER_CONTACT_PERSON");
        sch.setFillerContactPhoneNumber("FILLER_CONTACT_PHONE_NUMBER");
        sch.setFillerContactAddress("FILLER_CONTACT_ADDRESS");
        sch.setFillerContactLocation("FILLER_CONTACT_LOCATION");
        sch.setEnteredByPerson("ENTERED_BY_PERSON");
        sch.setEnteredByPhoneNumber("ENTERED_BY_PHONE_NUMBER");
        sch.setEnteredByLocation("ENTERED_BY_LOCATION");
        sch.setParentPlacerAppointmentID("PARENT_PLACER_APPOINTMENT_ID");
        sch.setParentFillerAppointmentID("PARENT_FILLER_APPOINTMENT_ID");
        sch.setFillerStatusCode("FILLER_STATUS_CODE");
        sch.setPlacerOrderNumber("PLACER_ORDER_NUMBER");
        sch.setFillerOrderNumber("FILLER_ORDER_NUMBER");
        Assert.assertEquals(testString,sch.toString());
    }

    @Test
    public void CreateTQ1()
    {
        String testString = "TQ1|" +
                "1|QUANTITY|REPEAT_PATTERN|EXPLICIT_TIME|RELATIVE_TIME_AND_UNITS|SERVICE_DURATION|START_DATE_TIME|END_DATE_TIME|PRIORITY|" +
                "CONDITION_TEXT|TEXT_INSTRUCTION|CONJUNCTION|OCCURRENCE_DURATION|TOTAL_OCCURRENCES";
        TQ1Object tq1 = new TQ1Object();
        tq1.setSetIDTQ1("1");
        tq1.setQuantity("QUANTITY");
        tq1.setRepeatPattern("REPEAT_PATTERN");
        tq1.setExplicitTime("EXPLICIT_TIME");
        tq1.setRelativeTimeandUnits("RELATIVE_TIME_AND_UNITS");
        tq1.setServiceDuration("SERVICE_DURATION");
        tq1.setStartdatetime("START_DATE_TIME");
        tq1.setEnddatetime("END_DATE_TIME");
        tq1.setPriority("PRIORITY");
        tq1.setConditiontext("CONDITION_TEXT");
        tq1.setTextinstruction("TEXT_INSTRUCTION");
        tq1.setConjunction("CONJUNCTION");
        tq1.setOccurrenceduration("OCCURRENCE_DURATION");
        tq1.setTotaloccurrences("TOTAL_OCCURRENCES");
        Assert.assertEquals(testString,tq1.toString());
    }

    @Test
    public void CreateNTE()
    {
        String testString ="NTE|1|SOURCE_OF_COMMENT|COMMENT|COMMENT_TYPE";
        NTEObject nte = new NTEObject();
        nte.setSetIDNTE("1");
        nte.setSourceofComment("SOURCE_OF_COMMENT");
        nte.setComment("COMMENT");
        nte.setCommentType("COMMENT_TYPE");
        Assert.assertEquals(testString,nte.toString());
    }

    @Test
    public void CreateZCD()
    {
        String testString ="ZCD|" +
                "1|CALIBRATION_DEVICE_USED|PATIENT_AGE_AT_SURGERY|CASE_ACTIONED" ;
        ZCDObject zcd = new ZCDObject();
        zcd.setSetIDZCD("1");
        zcd.setCalibrationDeviceUsed("CALIBRATION_DEVICE_USED");
        zcd.setPatientAgeatSurgery("PATIENT_AGE_AT_SURGERY");
        zcd.setCaseActioned("CASE_ACTIONED");
        Assert.assertEquals(testString,zcd.toString());
    }
}
