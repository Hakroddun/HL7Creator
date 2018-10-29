package MessageObjects.RGS.AIL;

import MessageObjects.NTEObject;
import java.util.ArrayList;

public class AILGroupObject
{
    private AILObject ail;
    private ArrayList<NTEObject> nteObjects;

    public AILObject getAil()
    {
        return ail;
    }

    public void setAil(AILObject ail)
    {
        this.ail = ail;
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
        String ailString = getAilString();
        String nteString = getNteString();
        String returnString = getReturnString(new String[]{ailString, nteString});
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

    private String getAilString()
    {
        String ailString = "";
        if (ail != null)
        {
            ailString = ail.toString();
        }
        return ailString;
    }

    private String getNteString()
    {
        String nteString = "";
        if (nteObjects != null && ail != null)
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
