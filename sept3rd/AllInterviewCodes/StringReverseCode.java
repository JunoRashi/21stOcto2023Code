package sept3rd.AllInterviewCodes;

public class StringReverseCode {


    public static void main(String[] args) {


        String name = "Rashi";

        String revname = "";

        int l = name.length();
        //System.out.println(name.charAt(0));

        for (int i = l - 1; i >= 0; i--) {
            revname = revname + name.charAt(i);
        }
        System.out.println(revname);


        ///--------------------------------------------------------------


        //using StrinBuffer

        StringBuffer var1 = new StringBuffer("ABCDEFGH");

        System.out.println(var1.reverse());


    }

}
