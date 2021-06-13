package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://mkyong.com/java/what-is-new-in-java-11/#jep-323-local-variable-syntax-for-lambda-parameters
public class LocalVarLambda {
    public static void main(String[] args) {
        // Local "var" declaration to lambda allows annotation to be used!
        List<String> list = Arrays.asList("a", "b", "c");
        String result = list.stream()
                .map((/* @NotNull var */ x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
