import Builders.AISBuilder;
import Builders.NTEBuilder;
import MessageObjects.NTEObject;
import MessageObjects.RGS.AIS.AISGroupObject;
import MessageObjects.RGS.AIS.AISObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AISGroupTest
{
    @Test
    public void CreateAIS()
    {
        String testAISString = AISBuilder.getTestAISString("1");
        AISObject ais = AISBuilder.getAisObject();
        Assert.assertEquals(testAISString, ais.toString());
    }

    @Test
    public void CreateBlankAISGroupObject()
    {
        AISGroupObject aisGroupObject = new AISGroupObject();
        Assert.assertEquals("", aisGroupObject.toString());
    }

    @Test
    public void CreateAISGroupObjectWithAISObject()
    {
        AISObject ais = AISBuilder.getAisObject();
        String testAISString = AISBuilder.getTestAISString("1");
        AISGroupObject aisGroupObject = new AISGroupObject();
        aisGroupObject.setAis(ais);
        Assert.assertEquals(testAISString, aisGroupObject.toString());
    }

    @Test
    public void CreateAISGroupObjectWithTwoNTEObjects()
    {
        AISObject ais = AISBuilder.getAisObject();
        String testAISString = AISBuilder.getTestAISString("1");
        NTEObject nte1 = NTEBuilder.getNteObject("1");
        String testNTEString1 = NTEBuilder.getTestNTEString("1");
        NTEObject nte2 = NTEBuilder.getNteObject("2");
        String testNTEString2 = NTEBuilder.getTestNTEString("2");
        ArrayList<NTEObject> nteObjects = new ArrayList<>();
        nteObjects.add(nte1);
        nteObjects.add(nte2);
        AISGroupObject aisGroupObject = new AISGroupObject();
        aisGroupObject.setAis(ais);
        aisGroupObject.setNteObjects(nteObjects);
        String testAISGroupString = testAISString+"\n"+testNTEString1+"\n"+testNTEString2;
        Assert.assertEquals(testAISGroupString, aisGroupObject.toString());
    }

}
