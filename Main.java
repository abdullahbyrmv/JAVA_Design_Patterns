import Builder_Pattern.Builder;

public class Main {
    public static void main(String[] args) {
        Builder.BuilderPattern build = Builder.builder();
        Builder a = build.build();
    }
}
