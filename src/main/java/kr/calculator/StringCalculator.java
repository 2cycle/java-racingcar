package kr.calculator;

public class StringCalculator {

    public int calcualtor(String text){

        int res = 0;
        String[] values = text.split(" ");


        res = getRes(values[1],Integer.parseInt(values[0]),values[2]);
        for(int i=3;i<values.length; i = i+2){

            res = getRes(values[i],res,values[i+1]);
        }


        return res;

    }

    private Integer getRes(String value ,int first, String second) {
        int v1 = first;
        int v2 = Integer.parseInt(second);

        if (value.equals("+")){
            return v1 + v2;
        }

        if (value.equals("-")){
            return v1 - v2;
        }

        if (value.equals("*")){
            return v1 * v2;
        }

        if (value.equals("/")){
            return v1 / v2;
        }
        return 0;
    }


}
