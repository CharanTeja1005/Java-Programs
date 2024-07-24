public class StringBuilderAndBufferPerformance {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for(int i=0;i<100;i++) stringBuffer.append("test");
        long endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + "ns");

        StringBuilder stringBuilder = new StringBuilder();
        startTime =System.nanoTime();
        for(int i=0;i<100;i++) stringBuilder.append("Test");
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ns");

    }
}
