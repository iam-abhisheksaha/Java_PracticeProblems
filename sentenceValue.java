import java.util.ArrayList;


public class sentenceValue {
    public static void sentence_value(ArrayList<String> list){
        // System.out.println(list);
        int value = 0;
        String characters = "0abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < list.size(); i++){
            // System.out.println(list.get(i));
            int count = 0;
            int temp = 0;
            int len = list.get(i).length();
            for(int j = 0; j < len; j++){
                // System.out.println(list.get(i).charAt(j));
                char symbol = list.get(i).charAt(j);
                if(Character.isUpperCase(symbol)){
                    count = count + 1;
                    // System.out.println("Ji");
                }
                if(Character.isUpperCase(symbol) || Character.isLowerCase(symbol)){
                    // System.out.println("hi");
                    int mader = characters.indexOf(Character.toLowerCase(symbol));
                    // System.out.println(mader);
                    temp = temp + mader;
                }
            }
            // System.out.println(temp);
            if(count == list.get(i).length()){
                temp = temp * 2;
            }
            value = value + temp;
        }
        System.out.println(value);
    }

    public static void main(String[] args){


        String sentence = "abc ABC Abc";
        int len = sentence.length();
        ArrayList<String> list = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i < len; i++) {
            if(sentence.charAt(i) == ' '){
                // System.out.println("Hi");
                list.add(temp);
                temp = "";
            }
            else{
                temp = temp + sentence.charAt(i);
            }
        }
        list.add(temp);
        // System.out.println(list);
        sentence_value(list);
    }
}
