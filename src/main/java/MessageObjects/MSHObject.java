package MessageObjects;

public class MSHObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SendingApplication = "";
    private String SendingFacility = "";
    private String ReceivingApplication = "";
    private String ReceivingFacility = "";
    private String DateTimeOfMessage = "";
    private String Security = "";
    private String MessageType = "";
    private String MessageControlID = "";
    private String ProcessingID = "";
    private String VersionID = "";
    private String SequenceNumber = "";
    private String ContinuationPointer = "";
    private String AcceptAcknowledgmentType = "";
    private String ApplicationAcknowledgmentType = "";
    private String CountryCode = "";
    private String CharacterSet = "";
    private String PrincipalLanguageOfMessage = "";
    private String AltCharsetHandlingScheme = "";
    private String MessageProfileIdentifier = "";

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

    public String getSendingApplication()
    {
        return SendingApplication;
    }

    public void setSendingApplication(String sendingApplication)
    {
        SendingApplication = sendingApplication;
    }

    public String getSendingFacility()
    {
        return SendingFacility;
    }

    public void setSendingFacility(String sendingFacility)
    {
        SendingFacility = sendingFacility;
    }

    public String getReceivingApplication()
    {
        return ReceivingApplication;
    }

    public void setReceivingApplication(String receivingApplication)
    {
        ReceivingApplication = receivingApplication;
    }

    public String getReceivingFacility()
    {
        return ReceivingFacility;
    }

    public void setReceivingFacility(String receivingFacility)
    {
        ReceivingFacility = receivingFacility;
    }

    public String getDateTimeOfMessage()
    {
        return DateTimeOfMessage;
    }

    public void setDateTimeOfMessage(String dateTimeOfMessage)
    {
        DateTimeOfMessage = dateTimeOfMessage;
    }

    public String getSecurity()
    {
        return Security;
    }

    public void setSecurity(String security)
    {
        Security = security;
    }

    public String getMessageType()
    {
        return MessageType;
    }

    public void setMessageType(String messageType)
    {
        MessageType = messageType;
    }

    public String getMessageControlID()
    {
        return MessageControlID;
    }

    public void setMessageControlID(String messageControlID)
    {
        MessageControlID = messageControlID;
    }

    public String getProcessingID()
    {
        return ProcessingID;
    }

    public void setProcessingID(String processingID)
    {
        ProcessingID = processingID;
    }

    public String getVersionID()
    {
        return VersionID;
    }

    public void setVersionID(String versionID)
    {
        VersionID = versionID;
    }

    public String getSequenceNumber()
    {
        return SequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber)
    {
        SequenceNumber = sequenceNumber;
    }

    public String getContinuationPointer()
    {
        return ContinuationPointer;
    }

    public void setContinuationPointer(String continuationPointer)
    {
        ContinuationPointer = continuationPointer;
    }

    public String getAcceptAcknowledgmentType()
    {
        return AcceptAcknowledgmentType;
    }

    public void setAcceptAcknowledgmentType(String acceptAcknowledgmentType)
    {
        AcceptAcknowledgmentType = acceptAcknowledgmentType;
    }

    public String getApplicationAcknowledgmentType()
    {
        return ApplicationAcknowledgmentType;
    }

    public void setApplicationAcknowledgmentType(String applicationAcknowledgmentType)
    {
        ApplicationAcknowledgmentType = applicationAcknowledgmentType;
    }

    public String getCountryCode()
    {
        return CountryCode;
    }

    public void setCountryCode(String countryCode)
    {
        CountryCode = countryCode;
    }

    public String getCharacterSet()
    {
        return CharacterSet;
    }

    public void setCharacterSet(String characterSet)
    {
        CharacterSet = characterSet;
    }

    public String getPrincipalLanguageOfMessage()
    {
        return PrincipalLanguageOfMessage;
    }

    public void setPrincipalLanguageOfMessage(String principalLanguageOfMessage)
    {
        PrincipalLanguageOfMessage = principalLanguageOfMessage;
    }

    public String getAltCharsetHandlingScheme()
    {
        return AltCharsetHandlingScheme;
    }

    public void setAltCharsetHandlingScheme(String altCharsetHandlingScheme)
    {
        AltCharsetHandlingScheme = altCharsetHandlingScheme;
    }

    public String getMessageProfileIdentifier()
    {
        return MessageProfileIdentifier;
    }

    public void setMessageProfileIdentifier(String messageProfileIdentifier)
    {
        MessageProfileIdentifier = messageProfileIdentifier;
    }

    @Override
    public String toString()
    {
        return "MSH" +
                FieldSeparator + EncodingCharacters + FieldSeparator +
                SendingApplication + FieldSeparator +
                SendingFacility + FieldSeparator +
                ReceivingApplication + FieldSeparator +
                ReceivingFacility + FieldSeparator +
                DateTimeOfMessage + FieldSeparator +
                Security + FieldSeparator +
                MessageType + FieldSeparator +
                MessageControlID + FieldSeparator +
                ProcessingID + FieldSeparator +
                VersionID + FieldSeparator +
                SequenceNumber + FieldSeparator +
                ContinuationPointer + FieldSeparator +
                AcceptAcknowledgmentType + FieldSeparator +
                ApplicationAcknowledgmentType + FieldSeparator +
                CountryCode + FieldSeparator +
                CharacterSet + FieldSeparator +
                PrincipalLanguageOfMessage + FieldSeparator +
                AltCharsetHandlingScheme + FieldSeparator +
                MessageProfileIdentifier;
    }
}
