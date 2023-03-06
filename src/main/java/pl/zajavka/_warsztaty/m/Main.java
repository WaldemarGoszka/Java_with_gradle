package pl.zajavka._warsztaty.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static public String[] alph = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "w", "v", "x", "y", "z"};
    public static void main(String[] args) {


        System.out.println(check("The quick brown fox jumps over the lazy dog ."));
    }
    static public boolean check(String sentence){
        List<String> listAlphabet= new ArrayList<>(Arrays.asList(alph));
        for (String s : sentence.toLowerCase().split("")) {
            if(listAlphabet.contains(s)){
                listAlphabet.remove(s);
            }
        }
        return listAlphabet.isEmpty();
    }
}
