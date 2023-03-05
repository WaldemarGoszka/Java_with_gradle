package pl.zajavka._warsztaty.m;

public class Main {
    public static void main(String[] args) {
        //1..2,147,483,647
        int num = 1376796946;
        String[] str = Integer.toBinaryString(num).split("");
        System.out.println(Integer.toBinaryString(num));
        int count = 0;
        int max = 0;
        boolean sFlag = false;
        boolean fFlag = false;

        for (String s : str) {
            if(s.equals("1") & !sFlag){
                sFlag = true;
            }
            if(s.equals("0") && sFlag){
                count++;
            }
            if(count > 0 && s.equals("1") && sFlag && !fFlag){
                if(max < count) {
                    max = count;
                }
                count = 0;
                //sFlag = false;
                fFlag = false;
            }
        }
        System.out.println("max: "+ max);
    }
}
