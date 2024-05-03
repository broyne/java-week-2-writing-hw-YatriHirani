//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Programme_1 {
        /**
         * Write a Java programme using the following steps.
         * 1.1 Declare two instance variables.
         * 1.2 Declare one instance method.
         * 1.3 Call both instance variables into the instance method inside the print statement.
         * 1.4 Declare the Main method.
         * 1.5 Call the above instance method into the Main method and Run the programme.
         */
        // 1.1 Declare two instance variables.
        int a = 10;
        int b = 20;


        //1.2 Declare one instance method.
        //1.3  Call both instance variables into the instance method inside the print statement.

        public void instanceMethod(){
            System.out.println(a);
            System.out.println(b);
        }
    }
}