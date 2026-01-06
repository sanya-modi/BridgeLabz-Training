package linear_and_binarysearch.stringbuffer;

public class ComparePerformance {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        // StringBuffer 
        StringBuffer stringBuffer = new StringBuffer();

        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        //StringBuilder 
        StringBuilder stringBuilder = new StringBuilder();

        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        //Result
        System.out.println("Time taken by StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder : " + builderTime + " ns");
    }
}

