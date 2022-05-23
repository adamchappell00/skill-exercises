package interview;

public class CompressionStrings {

    public static String decompressString(String inputString){
        String outputString = "";
        char currentChar = ' ';
        int currentNum;
        int i = 0;
        while(i < inputString.length()){
            currentNum = 0;
            if(!Character.isDigit(inputString.charAt(i))){
                currentChar = inputString.charAt(i);
                i++;
            } else{
                while(Character.isDigit(inputString.charAt(i)) && i < inputString.length()){
                    int holder = Integer.parseInt(""+ inputString.charAt(i));
                    currentNum = (currentNum * 10) + holder;
                    i++;
                    currentChar = inputString.charAt(i);
                }
                for(int k = 0; k < currentNum; k++){
                    outputString = outputString + currentChar;
                }
            }
        }
        return outputString;
    }

    public static String compressString(String inputString){
        String outputString = "";
        return outputString;
    }
}