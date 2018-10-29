package MessageObjects.RGS.AIP;

import MessageObjects.NTEObject;

import java.util.ArrayList;

public class AIPGroupObject
{
    private AIPObject aip;
    private ArrayList<NTEObject> nteObjects;

    public AIPObject getAip()
    {
        return aip;
    }

    public void setAip(AIPObject aip)
    {
        this.aip = aip;
    }

    public ArrayList<NTEObject> getNteObjects()
    {
        return nteObjects;
    }

    public void setNteObjects(ArrayList<NTEObject> nteObjects)
    {
        this.nteObjects = nteObjects;
    }

    @Override
    public String toString()
    {
        String aipString = getAipString();
        String nteString = getNteString();
        String returnString = getReturnString(new String[]{aipString, nteString});
        return returnString;
    }

    private String getReturnString(String[] strings)
    {
        String returnString = "";
        for (int i = 0; i < strings.length; i++)
        {
            Boolean hasValue = !strings[i].equals("");
            if (hasValue && (i > 0))
            {
                returnString = returnString + "\n";
            }
            if (hasValue)
            {
                returnString = returnString + strings[i];
            }
        }
        return returnString;
    }

    private String getAipString()
    {
        String aipString = "";
        if (aip != null)
        {
            aipString = aip.toString();
        }
        return aipString;
    }

    private String getNteString()
    {
        String nteString = "";
        if (nteObjects != null && aip != null)
        {
            for (int i = 0; i < nteObjects.size(); i++)
            {
                NTEObject nte = nteObjects.get(i);
                Boolean hasValue = !nte.equals("");
                if (hasValue && (i > 0))
                {
                    nteString = nteString + "\n";
                }
                if (hasValue)
                {
                    nte.setSetIDNTE(String.valueOf(i + 1));
                    nteString = nteString + nte.toString();
                }
            }
        }
        return nteString;
    }
}
