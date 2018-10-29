package MessageObjects.RGS.AIS;

import MessageObjects.NTEObject;

import java.util.ArrayList;

public class AISGroupObject
{
    private AISObject ais;
    private ArrayList<NTEObject> nteObjects;

    public AISObject getAis()
    {
        return ais;
    }

    public void setAis(AISObject ais)
    {
        this.ais = ais;
    }

    public ArrayList<NTEObject> getNteObjects()
    {
        return nteObjects;
    }

    public void setNteObjects(ArrayList<NTEObject> nte)
    {
        this.nteObjects = nte;
    }

    @Override
    public String toString()
    {
        String aisString = getAisString();
        String nteString = getNteString();
        String returnString = getReturnString(new String[]{aisString, nteString});
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

    private String getAisString()
    {
        String aisString = "";
        if (ais != null)
        {
            aisString = ais.toString();
        }
        return aisString;
    }

    private String getNteString()
    {
        String nteString = "";
        if (nteObjects != null && ais != null)
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
