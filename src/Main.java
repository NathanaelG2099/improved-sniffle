
public class Main {

    //Output a string at a rate of 100ms
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
    }

    //Output a string at a defined rate
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
    public static void main(String[] args) {
        reader("This is a test at 100ms");
        System.out.println();
        reader("This is a new test at 500ms", 500);
    }
}