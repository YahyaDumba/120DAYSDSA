// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void permutation(String str,String perm,int index) {
        if(str.length()==0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char currchar = str.charAt(i);

            String newstr = str.substring(0, i)+str.substring(i+1);

                permutation(newstr,perm+currchar,index+1);
        }
    }
    public static void main(String[] args) {
            String str="ABC";
            permutation(str,"",0);
        }
    }
