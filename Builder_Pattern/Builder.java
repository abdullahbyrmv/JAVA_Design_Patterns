package Builder_Pattern;

import Singleton_Pattern.Singleton;

public class Builder {
    private String name = null;
    private Singleton s = null;

    private Builder() {

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Singleton getS() {
        return s;
    }

    private void setS(Singleton s) {
        this.s = s;
    }

    public static BuilderPattern builder(){
        return new BuilderPattern();
    }

    public static class BuilderPattern {
        private Builder b = null;

        public BuilderPattern builder() {
            b = new Builder();
            return this;
        }

        public Builder build() {
            return this.b;
        }

        public BuilderPattern setName(String name) {
            this.b.setName(name);
            return this;
        }

        public BuilderPattern setS(Singleton s) {
            this.b.setS(s);
            return this;
        }
    }
}
