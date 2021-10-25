class enums {
    // An "enum" is used to define collections of constants, separated by a comma.
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN;
    } 
    // They define variables that represent members of a fixed set.
    public enum Color {
        RED, BLUE, GREEN;
    }
    public static void main(String[] args) {
        // They can be reffered to using the "dot" syntax.
        Rank a = Rank.SOLDIER;
        
        // It is possible to check for the corresponding values in an "enum".
        // For example, using a "switch" statement:
        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says Hi!");
                break;
            case SERGEANT: 
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
            default:
                break;
        }
    }
    /*
        Enums should always be used when a variable can only take
        one out of a small set of possible values.
    */
}
