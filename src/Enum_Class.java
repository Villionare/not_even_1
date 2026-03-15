public enum Enum_Class {
    RISHI(1),
    JACK(2),
    DECORPUS_BELL(3),
    SHEYALA(4),
    MEGENTA(5);

    private final int characters;

    Enum_Class(int characters) {
        this.characters = characters;
    }

    public int getCharacters() {
        return characters;
    }
};