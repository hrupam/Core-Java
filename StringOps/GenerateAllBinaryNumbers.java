package StringOps;

import java.util.LinkedList;
import java.util.List;

public class GenerateAllBinaryNumbers {

    public static void main(String[] args) {
        int bits = 4;
        List<String> binaries = new LinkedList<>();
        generateBinary(bits, new StringBuffer(), 1, binaries);
        System.out.println(binaries);
    }

    public static void generateBinary(int bits, StringBuffer binaryString, int index, List<String> binaries) {
        if (index > bits) {
            binaries.add(binaryString.toString());
            return;
        }

        binaryString.append(0);
        generateBinary(bits, binaryString, index + 1, binaries);
        binaryString.deleteCharAt(binaryString.length() - 1);
        binaryString.append(1);
        generateBinary(bits, binaryString, index + 1, binaries);
        binaryString.deleteCharAt(binaryString.length() - 1);
    }
}
