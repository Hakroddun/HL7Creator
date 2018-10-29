package MessageObjects;

public class NTEObject
{
    private String FieldSeparator = "|";
    private String EncodingCharacters = "^~\\&";
    private String SetIDNTE = "";
    private String SourceofComment = "";
    private String Comment = "";
    private String CommentType = "";

    public String getFieldSeparator()
    {
        return FieldSeparator;
    }

    public void setFieldSeparator(String fieldSeparator)
    {
        FieldSeparator = fieldSeparator;
    }

    public String getEncodingCharacters()
    {
        return EncodingCharacters;
    }

    public void setEncodingCharacters(String encodingCharacters)
    {
        EncodingCharacters = encodingCharacters;
    }

    public String getSetIDNTE()
    {
        return SetIDNTE;
    }

    public void setSetIDNTE(String setIDNTE)
    {
        SetIDNTE = setIDNTE;
    }

    public String getSourceofComment()
    {
        return SourceofComment;
    }

    public void setSourceofComment(String sourceofComment)
    {
        SourceofComment = sourceofComment;
    }

    public String getComment()
    {
        return Comment;
    }

    public void setComment(String comment)
    {
        Comment = comment;
    }

    public String getCommentType()
    {
        return CommentType;
    }

    public void setCommentType(String commentType)
    {
        CommentType = commentType;
    }

    @Override
    public String toString()
    {
        return "NTE" + FieldSeparator +
                SetIDNTE + FieldSeparator +
                SourceofComment + FieldSeparator +
                Comment + FieldSeparator +
                CommentType;
    }
}
