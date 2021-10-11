package blue.lhf.kahvi.cli;

import blue.lhf.kahvi.util.ProjectUtils;

public class KahviCLI {
    public static void main(String[] args) {
        KahviCLI cli = new KahviCLI();
        cli.welcome();
    }

    public void welcome() {
        System.out.printf("""
                welcome to kahvi!
                   java-based interpreted language
                loading kahvi-cli v%s
                """, ProjectUtils.getManifest()
                .getMainAttributes()
                .getValue("Implementation-Version")
        );
    }
}
