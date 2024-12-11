package info.dmerej;

public class TestConsoleInteractor implements IConsoleInteractor {
    private String[] input;
    private java.util.List<String> output;

    public TestConsoleInteractor(String[] input) {
        this.input = input;
        this.output = new java.util.ArrayList<>();
    }

    @Override
    public String readInput() {
        if (input.length == 0) {
            return null;
        }
        String firstElement = input[0];
        input = java.util.Arrays.copyOfRange(input, 1, input.length);
        return firstElement;
    }

    @Override
    public void printMessage(String message) {
        output.add(message);
    }

    public java.util.List<String> getOutput() {
        return output;
    }

}
