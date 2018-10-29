import Builders.AIPBuilder;
import Builders.NTEBuilder;
import MessageObjects.NTEObject;
import MessageObjects.RGS.AIP.AIPGroupObject;
import MessageObjects.RGS.AIP.AIPObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AIPGroupTest
{

    @Test
    public void CreateAIP()
    {
        String testAIPString = AIPBuilder.getTestAIPString("1");
        AIPObject aip = AIPBuilder.getAipObject();
        Assert.assertEquals(testAIPString, aip.toString());
    }

    @Test
    public void CreateBlankAIPGroupObject()
    {
        AIPGroupObject aipGroupObject = new AIPGroupObject();
        Assert.assertEquals("", aipGroupObject.toString());
    }

    @Test
    public void CreateAIPGroupObjectWithAIPObject()
    {
        AIPObject aip = AIPBuilder.getAipObject();
        String testAIPString = AIPBuilder.getTestAIPString("1");
        AIPGroupObject aipGroupObject = new AIPGroupObject();
        aipGroupObject.setAip(aip);
        Assert.assertEquals(testAIPString, aipGroupObject.toString());
    }

    @Test
    public void CreateAIPGroupObjectWithTwoNTEObjects()
    {
        AIPObject aip = AIPBuilder.getAipObject();
        String testAIPString = AIPBuilder.getTestAIPString("1");
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        NTEObject nte2 = NTEBuilder.getNteObject("2");
        String testNTEString2 = NTEBuilder.getTestNTEString("2");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        nteObjects.add(nte2);
        AIPGroupObject aipGroupObject = new AIPGroupObject();
        aipGroupObject.setAip(aip);
        aipGroupObject.setNteObjects(nteObjects);
        String testAIPGroupString = testAIPString+"\n"+testNTEString1+"\n"+testNTEString2;
        Assert.assertEquals(testAIPGroupString, aipGroupObject.toString());
    }
}
