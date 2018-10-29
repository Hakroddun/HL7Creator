import MessageObjects.*;
import MessageObjects.PID.*;
import MessageObjects.RGS.AIG.AIGObject;
import MessageObjects.RGS.AIG.ZPDObject;
import MessageObjects.RGS.AIL.AILObject;
import MessageObjects.RGS.AIP.AIPObject;
import MessageObjects.RGS.AIS.AISObject;
import MessageObjects.RGS.RGSObject;
import org.junit.Assert;
import org.junit.Test;

public class HL7CreatorTest
{
    @Test
    public void CreateHL7()
    {
        String testString ="ZCD|SET_ID_ZCD|CALIBRATION_DEVICE_USED|PATIENT_AGE_AT_SURGERY|CASE_ACTIONED" ;
        ZCDObject zcd = new ZCDObject();
        zcd.setSetIDZCD("SET_ID_ZCD");
        zcd.setCalibrationDeviceUsed("CALIBRATION_DEVICE_USED");
        zcd.setPatientAgeatSurgery("PATIENT_AGE_AT_SURGERY");
        zcd.setCaseActioned("CASE_ACTIONED");
        Assert.assertEquals(testString,zcd.toString());
    }
}
