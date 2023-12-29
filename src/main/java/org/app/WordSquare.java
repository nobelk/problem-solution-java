package org.app;
import java.util.List;
import java.util.ArrayList;

public class WordSquare {

    public static boolean validWordSquare(List<String> words){
        for(int i=0; i<words.size(); i++){
            if(!getKthRow(words, i).equals(getKthCol(words, i))){
                return false;
            }
        }
        return true;
    }

    public static String getKthRow(List<String> words, int k){
        if(k<words.size()){
            return words.get(k);
        }
        return "";
    }

    public static String getKthCol(List<String> words, int k){
        StringBuilder cache = new StringBuilder();
        for(int i=0; i<words.size(); i++){
            String curr = words.get(i);
            if(k<curr.length()){
                cache.append(curr.charAt(k));
            }
        }

        return cache.toString();
    }

    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("abcd");
        l.add("bnrt");
        l.add("crmy");
        l.add("dtye");
        System.out.println(validWordSquare(l));

        l = new ArrayList<>();
        l.add("xbcd");
        l.add("bnrt");
        l.add("cymy");
        l.add("dtye");
        System.out.println(validWordSquare(l));
    }
}
