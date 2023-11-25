package org.app;
import java.util.Arrays;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int[] mapStoT = new int[256];
        int[] mapTtoS = new int[256];

        Arrays.fill(mapStoT, -1);
        Arrays.fill(mapTtoS, -1);

        for(int i=0; i<s.length(); i++){

            if(mapStoT[s.charAt(i)] == -1 && mapTtoS[t.charAt(i)] == -1){
                mapStoT[s.charAt(i)] = t.charAt(i);
                mapTtoS[t.charAt(i)] = s.charAt(i);
            }
            else if (mapStoT[s.charAt(i)] != t.charAt(i) || mapTtoS[t.charAt(i)]!=s.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
