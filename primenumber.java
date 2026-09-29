public class primenumber {
    public static void bintodec(int bin){
        int mubin = bin;
        int pow = 0;
        int dec = 0;

        while(bin > 0){
            int lastdig = bin % 10;
            dec = dec + (lastdig * (int)Math.pow(2,pow));
            pow++;
            bin = bin/10;

        }
        System.out.print("my bnary is "+mubin+"and ts decimal  is : "+dec);

    }

    public static void dectobin(int dec){
        int mydec = dec;
        int pow = 0;
        int bin = 0;

        while(dec > 0){
            int rem = dec%2;
            bin = bin + (rem *(int)Math.pow(10,pow));
            pow++;
            dec = dec/2;
        }
        System.out.print("my decimal is"+mydec+"And its bin is : "+bin);
    }
    public static void main(String args[]){
        bintodec(1111);
        System.out.println();
        dectobin(15);

    }
}