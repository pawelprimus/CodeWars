package primus.pawel;
// extract file name
// 6kyu
// https://www.codewars.com/kata/597770e98b4b340e5b000071/train/java
// 2021-09-11 T:15:03:50
class Exercise_216 {

    public static String extractFileName(String dirtyFileName) {
        StringBuilder wordWithoutDate = new StringBuilder(dirtyFileName.replaceAll("^[^_]*\\d_", ""));
        int dotCount = 0;
        for (int i = 0; i < wordWithoutDate.length(); i++) {

            if(wordWithoutDate.charAt(i) == '.'){
                dotCount++;
            }

            if(dotCount==2){
                wordWithoutDate.delete(i, wordWithoutDate.length());
            }

        }
        return wordWithoutDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(extractFileName(""));
    }

}

/*public class FileNameExtractor {
  public static String extractFileName(String f) {
    return f.substring(f.indexOf('_')+1,f.lastIndexOf('.'));
  }

  public static String extractFileName(String d) {
       return d.replaceAll(".*?_(.*)\\..*","$1");
    }

}*/