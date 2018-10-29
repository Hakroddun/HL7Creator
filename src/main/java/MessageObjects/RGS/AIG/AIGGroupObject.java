package MessageObjects.RGS.AIG;


import MessageObjects.NTEObject;

import java.util.ArrayList;

public class AIGGroupObject
{
    private AIGObject aig;
    private ArrayList<NTEObject> nteObjects;
    private ZPDObject zpd;

    public AIGObject getAig()
    {
        return aig;
    }

    public void setAig(AIGObject aig)
    {
        this.aig = aig;
    }

    public ArrayList<NTEObject> getNteObjects()
    {
        return nteObjects;
    }

    public void setNteObjects(ArrayList<NTEObject> nteObjects)
    {
        this.nteObjects = nteObjects;
    }

    public ZPDObject getZpd()
    {
        return zpd;
    }

    public void setZpd(ZPDObject zpd)
    {
        this.zpd = zpd;
    }

    @Override
    public String toString()
    {
        String aigString = getAigString();
        String nteString = getNteString();
        String zpdString = getZpdString();
        String returnString = getReturnString(new String[]{aigString, nteString, zpdString});
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

    private String getAigString()
    {
        String aigString = "";
        if (aig != null)
        {
            aigString = aig.toString();
        }
        return aigString;
    }

    private String getNteString()
    {
        String nteString = "";
        if (nteObjects != null && aig != null)
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

    private String getZpdString()
    {
        String zpdString = "";
        if (zpd != null)
        {
            zpdString = zpd.toString();
        }
        return zpdString;
    }
}
