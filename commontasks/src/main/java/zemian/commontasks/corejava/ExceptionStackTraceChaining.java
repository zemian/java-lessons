package zemian.commontasks.corejava;

public class ExceptionStackTraceChaining {
    public static void main(String[] args) {
        try {
            foo(args);
        } catch (RuntimeException e) {
            // Silly example:
            // Rethrow a exception instance.
            throw e;
        }
    }

    private static void foo(String[] args) {
        try {
            bar(args);
        } catch (RuntimeException e) {
            // Ensure to pass 'e' so not to break exception chain!
            throw new RuntimeException("Something went wrong with foo.", e);
        }
    }

    private static void bar(String[] args) {
        // Do not catch any exception here.
        baz(args);
    }

    private static void baz(String[] args) {
        if (args.length > 0) {
            throw new RuntimeException("Something went wrong with baz. Too many arguments: " + args.length);
        }
    }
}
