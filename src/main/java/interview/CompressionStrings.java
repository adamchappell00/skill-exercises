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
        char currentChar = inputString.charAt(0);
        int thisCharCount = 1;
        int i = 1;
        System.out.println("Input String:"+inputString+" with length "+inputString.length());

        while(i <= (inputString.length())){
            System.out.println("Start Loop, char:" + currentChar + " output:" +outputString + ", index:"+i);
            if(inputString.charAt(i) == currentChar){
                thisCharCount += 1;
                i++;
            } else {
                outputString = outputString + thisCharCount + currentChar;
                currentChar = inputString.charAt(i);
                thisCharCount = 1;
                i++;
            }
            if(i == (inputString.length())){
                outputString = outputString + thisCharCount + currentChar;
                i++;
            }
        }

        System.out.println("Output String Complete: " + outputString);
        return outputString;
    }
}