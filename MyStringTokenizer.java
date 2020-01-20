import java.util.Collections;
import java.util.LinkedList;

public class MyStringTokenizer {

    LinkedList<String> tokens = new LinkedList<String>();
    LinkedList<Integer> indexOfDelimeters = new LinkedList<Integer>();


    MyStringTokenizer(String s, String del){
        indexOfDelimeters.add(-1);
        indexOfDelimeters.add(s.length());
        for(int i=0;i<del.length();i++){
          for(int j=0; j<s.length(); j++){
              if(del.charAt(i)==s.charAt(j) ){
                  indexOfDelimeters.add(j);
              }
          }
        }

        Collections.sort(indexOfDelimeters);
        for (int i=0;i<indexOfDelimeters.size();i++) {
            String subS = s.substring(indexOfDelimeters.removeFirst()+1,indexOfDelimeters.getFirst());
            tokens.add(subS);
        }
    }
    boolean hasMoreElements(){
        if (tokens.size()==0)
            return false;
        else
            return true;
    }
    String nextTokenizer(){
        return tokens.removeFirst();
    }
}