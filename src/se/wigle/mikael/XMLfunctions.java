package se.wigle.mikael;

/**
 * Created by mikae_000 on 2014-11-20.
 */
public final class XMLfunctions {
    private XMLfunctions() {
    // Private constructor, static class.
    }

    public static String makeTag(String name, String content){
        String str = "<" + name + "> " + content + " </" + name + ">";
        return str;
    }
}
