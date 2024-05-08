public class Main {
    public static String toUpper(String str){
    String s = "";
    for(int i=0 ; i<str.length();i++){
        if(Character.isLowerCase(str.charAt(i))){
            s += (char)(str.charAt(i)-32);
        }
        else{
            s += str.charAt(i)+"";
        }
    }
    return s;
}

    public static boolean test_case1(String str){
        String compare="VAMSI";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case2(String str){
        String compare="VAMSI";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case3(String str){
        String compare="VAMSI";
        return toUpper(str).equals(compare);
    }
     public static boolean test_case4(String str){
        String compare="VA@MSI";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case5(String str){
        String compare="";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case6(String str){
        String compare="1234";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case7(String str){
        String compare="@#$";
        return toUpper(str).equals(compare);
    }
    public static boolean test_case8(String str){
        String compare="VA2451MSI";
        return toUpper(str).equals(compare);
    }
public static void main(String[] args) {
        System.out.println(test_case1("vamsi"));
        System.out.println(test_case2("VAMSI"));
        System.out.println(test_case3("vAmSI"));
        System.out.println(test_case4("va@msi"));
        System.out.println(test_case5(""));
        System.out.println(test_case6("1234"));
        System.out.println(test_case7("@#$"));
        System.out.println(test_case8("va2451msi"));
        
    }
}
