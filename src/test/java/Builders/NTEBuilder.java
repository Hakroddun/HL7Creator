package Builders;

import MessageObjects.NTEObject;

public class NTEBuilder
{
    public static NTEObject getNteObject(String id)
    {
        NTEObject nte = new NTEObject();
        nte.setSetIDNTE(id);
        nte.setSourceofComment("SOURCE_OF_COMMENT");
        nte.setComment("COMMENT");
        nte.setCommentType("COMMENT_TYPE");
        return nte;
    }

    public static String getTestNTEString(String id)
    {
        return "NTE|"+id+"|SOURCE_OF_COMMENT|COMMENT|COMMENT_TYPE";
    }
}
