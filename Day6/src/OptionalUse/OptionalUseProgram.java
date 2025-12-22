package OptionalUse;

import java.util.Optional;

public class OptionalUseProgram {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Java");

        System.out.println(opt.orElse(null));

        String name = null;
//        System.out.println(Optional.of(name)); // get NullPointerException
        System.out.println(Optional.ofNullable(name));
    }
}
