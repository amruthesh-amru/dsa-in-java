public class notString {
   static public String stringg(String str) {
        String temp = "not "+ str;
        String temp2="";
       System.out.println(str.equals(temp));
        if(str.equals(temp)){
            return str;
        }else {
            temp2 = str;
            return temp2;
        }
        // if(str.contains("not")){
        //   return str;
        // }else{
        //   return "not "+str;
        // }
    }

    public static void main(String[] args) {
       String result = stringg("is not");
        System.out.println(result);
    }
}
