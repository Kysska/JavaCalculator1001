public class ProgramCalculator {

    private binary currentBinary = binary.DEC;

    private enum binary {
        HEX,
        DEC,
        OCT,
        BIN
    }

    public String calculate(int op, int systemNumber, String num1) {
        setBinary(systemNumber);


        switch (op) {
            case 1: return hex(num1);
            case 2: return dec(num1);
            case 3: return oct(num1);
            case 4: return bin(num1);
            default: throw new IllegalArgumentException("Неправильная операция");
        }
    }

    private void setBinary(int systemNumber) {
        switch (systemNumber) {
            case 1: currentBinary = binary.HEX;
            break;
            case 2: currentBinary = binary.DEC;
            break;
            case 3: currentBinary = binary.OCT;
            break;
            case 4: currentBinary = binary.BIN;
            break;
            default: throw new IllegalArgumentException("Неправильная система счисления");
        }
    }

    private int parseInteger(String num) {
        return Integer.parseInt(num, getRadix());
    }

    private int getRadix() {
        switch (currentBinary) {
            case OCT: return 8;
            case BIN: return 2;
            case HEX: return 16;
            case DEC: return 10;
            default: throw new IllegalArgumentException("Неправильная система счисления");
        }
    }

    public String hex(String num1) {
        int decResult = parseInteger(num1);
        return Integer.toHexString(decResult);
    }

    public String dec(String num1) {
        int result = parseInteger(num1);
        return String.valueOf(result);
    }

    public String oct(String num1) {
        int decResult = parseInteger(num1);
        return Integer.toOctalString(decResult);
    }

    public String bin(String num1) {
        int decResult = parseInteger(num1);
        return Integer.toBinaryString(decResult);
    }
}
