public class Tools {

    //Reader method to slow output
    public static void reader(String str, int newRate){
        int rate = newRate;

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(rate);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }


    //Output a string at a rate of 50ms + newLine
    public static void readerln(String str){
        int rate = 50;

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(rate);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();

    }

    //Output a string at a defined rate + newLine
    public static void readerln(String str, int newRate){
        int rate = newRate;

        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(rate);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();

    }

}
