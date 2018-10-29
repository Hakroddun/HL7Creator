import Builders.AILBuilder;
import Builders.NTEBuilder;
import MessageObjects.NTEObject;
import MessageObjects.RGS.AIL.AILObject;
import MessageObjects.RGS.AIL.AILGroupObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AILGroupTest
{

    @Test
    public void CreateAIL()
    {
        String testAILString = AILBuilder.getTestAILString("1");
        AILObject ail = AILBuilder.getAilObject();
        Assert.assertEquals(testAILString, ail.toString());
    }

    @Test
    public void CreateBlankAILGroupObject()
    {
        AILGroupObject ailGroupObject = new AILGroupObject();
        Assert.assertEquals("", ailGroupObject.toString());
    }

    @Test
    public void CreateAILGroupObjectWithAILObject()
    {
        AILObject ail = AILBuilder.getAilObject();
        String testAILString = AILBuilder.getTestAILString("1");
        AILGroupObject ailGroupObject = new AILGroupObject();
        ailGroupObject.setAil(ail);
        Assert.assertEquals(testAILString, ailGroupObject.toString());
    }

    @Test
    public void CreateAILGroupObjectWithTwoNTEObjects()
    {
        AILObject ail = AILBuilder.getAilObject();
        String testAILString = AILBuilder.getTestAILString("1");
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        NTEObject nte2 = NTEBuilder.getNteObject("2");
        String testNTEString2 = NTEBuilder.getTestNTEString("2");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        nteObjects.add(nte2);
        AILGroupObject ailGroupObject = new AILGroupObject();
        ailGroupObject.setAil(ail);
        ailGroupObject.setNteObjects(nteObjects);
        String testAILGroupString = testAILString+"\n"+testNTEString1+"\n"+testNTEString2;
        Assert.assertEquals(testAILGroupString, ailGroupObject.toString());
    }
}
