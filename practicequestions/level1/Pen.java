import java.io.*;
class Pen {
    public static void main(String[] args) {
        int total = 14;
        int std = 3;
        int perStd = total / std;
        int remaining = total % std;
        System.out.printf(
            "The Pen Per Student is %d and the remaining pen not distributed is %d%n",
            perStd, remaining
        );
    }
}
