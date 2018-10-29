import Builders.AIGBuilder;
import Builders.AISBuilder;
import Builders.NTEBuilder;
import Builders.RGSBuilder;
import MessageObjects.NTEObject;
import MessageObjects.RGS.AIG.AIGGroupObject;
import MessageObjects.RGS.AIG.AIGObject;
import MessageObjects.RGS.AIG.ZPDObject;
import MessageObjects.RGS.AIL.AILObject;
import MessageObjects.RGS.AIP.AIPObject;
import MessageObjects.RGS.AIS.AISGroupObject;
import MessageObjects.RGS.AIS.AISObject;
import MessageObjects.RGS.RGSGroupObject;
import MessageObjects.RGS.RGSObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RGSTest
{
    @Test
    public void CreateRGS()
    {
        String testRGSString = RGSBuilder.getTestRGSString("1");
        RGSObject rgs = RGSBuilder.getRgsObject();
        Assert.assertEquals(testRGSString, rgs.toString());
    }

    @Test
    public void CreateBlankRGSGroupObject()
    {
        RGSGroupObject rgsGroupObject = new RGSGroupObject();
        Assert.assertEquals("", rgsGroupObject.toString());
    }

    @Test
    public void CreateRGSGroupObject()
    {
        String testRGSString = RGSBuilder.getTestRGSString("1");
        RGSObject rgs = RGSBuilder.getRgsObject();
        RGSGroupObject rgsGroupObject = new RGSGroupObject();
        rgsGroupObject.setRgs(rgs);
        Assert.assertEquals(testRGSString, rgsGroupObject.toString());
    }

    @Test
    public void CreateRGSGroupObjectWithRGSAndAIS()
    {
        String testRGSString = RGSBuilder.getTestRGSString("1");
        RGSObject rgs = RGSBuilder.getRgsObject();
        AISGroupObject ais = CreateAISGroupObjectWithTwoNTEObjects();
        ArrayList<AISGroupObject> aisGroupObjects = new ArrayList<>();
        aisGroupObjects.add(ais);
        RGSGroupObject rgsGroupObject = new RGSGroupObject();
        rgsGroupObject.setRgs(rgs);
        rgsGroupObject.setAisGroupObject(aisGroupObjects);
        String testString = testRGSString+"\n"+getAISGroupObjectWithTwoNTEObjectsString();
        Assert.assertEquals(testString, rgsGroupObject.toString());
    }

    @Test
    public void CreateRGSGroupObjectWithRGSAndAIG()
    {
        String testRGSString = RGSBuilder.getTestRGSString("1");
        RGSObject rgs = RGSBuilder.getRgsObject();
        AIGGroupObject aig = CreateAIGGroupObjectWithTwoNTEObjects();
        ArrayList<AIGGroupObject> aigGroupObjects = new ArrayList<>();
        aigGroupObjects.add(aig);
        RGSGroupObject rgsGroupObject = new RGSGroupObject();
        rgsGroupObject.setRgs(rgs);
        rgsGroupObject.setAigGroupObject(aigGroupObjects);
        String testString = testRGSString+"\n"+getAIGGroupObjectWithTwoNTEObjectsString();
        Assert.assertEquals(testString, rgsGroupObject.toString());
    }

    public AISGroupObject CreateAISGroupObjectWithTwoNTEObjects()
    {
        AISObject ais = AISBuilder.getAisObject();
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        AISGroupObject aisGroupObject = new AISGroupObject();
        aisGroupObject.setAis(ais);
        aisGroupObject.setNteObjects(nteObjects);
        return aisGroupObject;
    }

    public String getAISGroupObjectWithTwoNTEObjectsString()
    {
        String testAISString = AISBuilder.getTestAISString("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        String testAISGroupString = testAISString+"\n"+testNTEString1;
        return testAISGroupString;
    }


    public AIGGroupObject CreateAIGGroupObjectWithTwoNTEObjects()
    {
        AIGObject aig = AIGBuilder.getAigObject();
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        aigGroupObject.setAig(aig);
        aigGroupObject.setNteObjects(nteObjects);
        return aigGroupObject;
    }

    public String getAIGGroupObjectWithTwoNTEObjectsString()
    {
        String testAIGString = AIGBuilder.getTestAIGString("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        String testAIGGroupString = testAIGString+"\n"+testNTEString1;
        return testAIGGroupString;
    }

}
