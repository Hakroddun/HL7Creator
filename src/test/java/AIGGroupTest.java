import Builders.AIGBuilder;
import Builders.NTEBuilder;
import Builders.ZPDBuilder;
import MessageObjects.NTEObject;
import MessageObjects.RGS.AIG.AIGGroupObject;
import MessageObjects.RGS.AIG.AIGObject;
import MessageObjects.RGS.AIG.ZPDObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AIGGroupTest
{

    @Test
    public void CreateAIG()
    {
        String testAIGString = AIGBuilder.getTestAIGString("1");
        AIGObject aig = AIGBuilder.getAigObject();
        Assert.assertEquals(testAIGString, aig.toString());
    }

    @Test
    public void CreateZPD()
    {
        String testZPDString = ZPDBuilder.getTestZPDString("1");
        ZPDObject zpd = ZPDBuilder.getZpdObject();
        Assert.assertEquals(testZPDString, zpd.toString());
    }
    
    @Test
    public void CreateBlankAIGGroupObject()
    {
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        Assert.assertEquals("", aigGroupObject.toString());
    }

    @Test
    public void CreateAIGGroupObjectWithAIGObject()
    {
        AIGObject aig = AIGBuilder.getAigObject();
        String testAIGString = AIGBuilder.getTestAIGString("1");
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        aigGroupObject.setAig(aig);
        Assert.assertEquals(testAIGString, aigGroupObject.toString());
    }

    @Test
    public void CreateAIGGroupObjectWithTwoNTEObjects()
    {
        AIGObject aig = AIGBuilder.getAigObject();
        String testAIGString = AIGBuilder.getTestAIGString("1");
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        NTEObject nte2 = NTEBuilder.getNteObject("2");
        String testNTEString2 = NTEBuilder.getTestNTEString("2");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        nteObjects.add(nte2);
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        aigGroupObject.setAig(aig);
        aigGroupObject.setNteObjects(nteObjects);
        String testAIGGroupString = testAIGString+"\n"+testNTEString1+"\n"+testNTEString2;
        Assert.assertEquals(testAIGGroupString, aigGroupObject.toString());
    }

    @Test
    public void CreateAIGGroupObjectWithZPDObject()
    {
        AIGObject aig = AIGBuilder.getAigObject();
        String testAIGString = AIGBuilder.getTestAIGString("1");
        ZPDObject zpd = ZPDBuilder.getZpdObject();
        String testZPDString = ZPDBuilder.getTestZPDString("1");
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        aigGroupObject.setAig(aig);
        aigGroupObject.setZpd(zpd);
        String testAIGGroupString = testAIGString+"\n"+testZPDString;
        Assert.assertEquals(testAIGGroupString, aigGroupObject.toString());
    }


    @Test
    public void CreateAIGGroupObjectWithAllObjects()
    {
        AIGObject aig = AIGBuilder.getAigObject();
        String testAIGString = AIGBuilder.getTestAIGString("1");
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        NTEObject nte2 = NTEBuilder.getNteObject("2");
        String testNTEString2 = NTEBuilder.getTestNTEString("2");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        nteObjects.add(nte2);
        ZPDObject zpd = ZPDBuilder.getZpdObject();
        String testZPDString = ZPDBuilder.getTestZPDString("1");
        AIGGroupObject aigGroupObject = new AIGGroupObject();
        aigGroupObject.setAig(aig);
        aigGroupObject.setNteObjects(nteObjects);
        aigGroupObject.setZpd(zpd);
        String testAIGGroupString = testAIGString+"\n"+testNTEString1+"\n"+testNTEString2+"\n"+testZPDString;
        Assert.assertEquals(testAIGGroupString, aigGroupObject.toString());
    }
}
