public class Tools {

    //Output a string at a rate of 75ms + newLine
    public static void reader(String str){
        int rate = 100;

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
        System.out.println();

    }
}
