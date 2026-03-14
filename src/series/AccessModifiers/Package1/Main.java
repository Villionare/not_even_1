package series.AccessModifiers.Package1;

public class Main {
    //this is an Example to Understand the Access Modifiers in Java.
    // 4 - types of modifiers are there:
    //public - private - protected - default

//    Modifier,Same Class,  Same Package (non-subclass),    Subclass (different package),   Different Package (non-subclass)
//    private,  Yes,          No,                                   No,                                    No,
//    default,Yes,Yes,No,No
//    protected,Yes,Yes,Yes,No
//    public,Yes,Yes,Yes,Yes

    static public int variable_public = 9090;
    static protected int variable_protected = 9090;
    static int variable_default = 100;
    static private int variable_private = 9090;


}
