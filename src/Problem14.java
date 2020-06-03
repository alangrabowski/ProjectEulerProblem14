public class Problem14 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int howManyTermsInChain, longestChain=0, numberThatProducesTheLongestChain=0;
        long n;     //n has to be long, because it can (and will) exceed the range of int

        for (int i=1; i<1_000_000; i++) {
            n=i;
            howManyTermsInChain=1;
            while (n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                howManyTermsInChain++;
            }
            if (howManyTermsInChain > longestChain) {
                longestChain = howManyTermsInChain;
                numberThatProducesTheLongestChain = i;
            }
        }

        System.out.println("The longest chain has "+longestChain+" terms and it starts with "+numberThatProducesTheLongestChain);

        long end = System.currentTimeMillis();
        System.out.println(end-start+" ms");
    }
}
