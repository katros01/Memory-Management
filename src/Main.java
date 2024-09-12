import java.util.List;
import java.util.ArrayList;

public class Main {
    private static final int DATA_SIZE = 3000;

    public static void main(String[] args) {
        List<String> dataList = new ArrayList<>();

        for (int i = 0; i < DATA_SIZE; i++) {
            String data = "Data " + i;
            dataList.add(data);
        }

        long sum = 0;
        for (String data : dataList) {

            sum += Integer.parseInt(data.replaceAll("[^0-9]", ""));
        }

//        for (int i = 0; i < DATA_SIZE; i++) {
//            String data = new StringBuilder().append("Data ").append(i).toString();
//            dataList.add(data);
//        }
//
//        long sum = dataList.stream()
//                .mapToInt(data -> Integer.parseInt(data.replace("Data ", "")))
//                .sum();
//
        System.out.println("Sum of numbers: " + sum);


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}