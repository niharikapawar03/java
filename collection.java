import java.util.ArrayList;
import java.util.List;

//WAP to add element which are integer a print all the elemnet of a list.
public class collection {
    public static void listPrint(String str){
        List<Integer> ls=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                ls.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i));
        }
    }
    public static void main(String[] args) {
       String str="A13B256ND4E5RI905TDF5";
       listPrint(str);
    }
}