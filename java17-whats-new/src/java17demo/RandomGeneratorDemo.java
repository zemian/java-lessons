package java17demo;

import java.util.random.RandomGenerator;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
        System.out.println(g.nextLong());
    }
}
