package Arrays;

import java.util.HashSet;

public class HashSetExmp {

    public static void main(String[] args) {

        HashSet<String> tvs = new HashSet<String>();
        tvs.add("LG");
        tvs.add("SAMSUNG");
        tvs.add("PANOSONIC");
        tvs.add("VIZIO");
        tvs.add("TCL");

        System.out.println("HashSet elements :"+tvs);
        System.out.println("Size: " +  tvs.size());



    }
}
