package MessageObjects.RGS;

import MessageObjects.RGS.AIG.AIGGroupObject;
import MessageObjects.RGS.AIL.AILGroupObject;
import MessageObjects.RGS.AIP.AIPGroupObject;
import MessageObjects.RGS.AIS.AISGroupObject;

import java.util.ArrayList;

public class RGSGroupObject
{
    private RGSObject rgs;
    private ArrayList<AISGroupObject> aisGroupObject;
    private ArrayList<AIGGroupObject> aigGroupObject;
    private ArrayList<AILGroupObject> ailGroupObject;
    private ArrayList<AIPGroupObject> aipGroupObject;

    public RGSObject getRgs()
    {
        return rgs;
    }

    public void setRgs(RGSObject rgs)
    {
        this.rgs = rgs;
    }

    public ArrayList<AISGroupObject> getAisGroupObject()
    {
        return aisGroupObject;
    }

    public void setAisGroupObject(ArrayList<AISGroupObject> aisGroupObject)
    {
        this.aisGroupObject = aisGroupObject;
    }

    public ArrayList<AIGGroupObject> getAigGroupObject()
    {
        return aigGroupObject;
    }

    public void setAigGroupObject(ArrayList<AIGGroupObject> aigGroupObject)
    {
        this.aigGroupObject = aigGroupObject;
    }

    public ArrayList<AILGroupObject> getAilGroupObject()
    {
        return ailGroupObject;
    }

    public void setAilGroupObject(ArrayList<AILGroupObject> ailGroupObject)
    {
        this.ailGroupObject = ailGroupObject;
    }

    public ArrayList<AIPGroupObject> getAipGroupObject()
    {
        return aipGroupObject;
    }

    public void setAipGroupObject(ArrayList<AIPGroupObject> aipGroupObject)
    {
        this.aipGroupObject = aipGroupObject;
    }

    @Override
    public String toString()
    {
        String rgsString = getRgsString();
        String aisString = getAisString();
        String aigString = getAigString();
        String ailString = getAilString();
        String aipString = getAipString();
        String returnString = getReturnString(new String[]{rgsString,aisString,aigString,ailString,aipString});
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

    private String getRgsString()
    {
        String aisString = "";
        if (rgs != null)
        {
            aisString = rgs.toString();
        }
        return aisString;
    }

    private String getAisString()
    {
        String aisString = "";
        if (aisGroupObject != null && rgs != null)
        {
            for (int i = 0; i < aisGroupObject.size(); i++)
            {
                AISGroupObject aisObject = aisGroupObject.get(i);
                Boolean hasValue = !aisObject.equals("");
                if (hasValue && (i > 0))
                {
                    aisString = aisString + "\n";
                }
                if (hasValue)
                {
                    aisString = aisString + aisObject.toString();
                }
            }
        }
        return aisString;
    }

    private String getAigString()
    {
        String aigString = "";
        if (aigGroupObject != null && rgs != null)
        {
            for (int i = 0; i < aigGroupObject.size(); i++)
            {
                AIGGroupObject aigObject = aigGroupObject.get(i);
                Boolean hasValue = !aigObject.equals("");
                if (hasValue && (i > 0))
                {
                    aigString = aigString + "\n";
                }
                if (hasValue)
                {
                    aigString = aigString + aigObject.toString();
                }
            }
        }
        return aigString;
    }

    private String getAilString()
    {
        String ailString = "";
        if (ailGroupObject != null && rgs != null)
        {
            for (int i = 0; i < ailGroupObject.size(); i++)
            {
                AILGroupObject ailObject = ailGroupObject.get(i);
                Boolean hasValue = !ailObject.equals("");
                if (hasValue && (i > 0))
                {
                    ailString = ailString + "\n";
                }
                if (hasValue)
                {
                    ailString = ailString + ailObject.toString();
                }
            }
        }
        return ailString;
    }

    private String getAipString()
    {
        String aipString = "";
        if (aipGroupObject != null && rgs != null)
        {
            for (int i = 0; i < aipGroupObject.size(); i++)
            {
                AIPGroupObject aipObject = aipGroupObject.get(i);
                Boolean hasValue = !aipObject.equals("");
                if (hasValue && (i > 0))
                {
                    aipString = aipString + "\n";
                }
                if (hasValue)
                {
                    aipString = aipString + aipObject.toString();
                }
            }
        }
        return aipString;
    }
    
    
}
