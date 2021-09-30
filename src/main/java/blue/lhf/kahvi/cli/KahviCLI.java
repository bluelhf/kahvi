package blue.lhf.kahvi.cli;

public class KahviCLI {
    public static void main(String[] args) {
        KahviCLI cli = new KahviCLI();
    }

    public void welcome() {
        System.out.printf("""
                welcome to kahvi!
                   java-based interpreted language
                loading kahvi-cli v
                """);
    }
}
