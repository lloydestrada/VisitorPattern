public enum TelcoType {
    Smart("Smart"),
    Globe("Globe"),
    Ditto("Ditto");

    private String name;

    TelcoType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
