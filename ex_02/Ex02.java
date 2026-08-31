class Ex02 {
    public static String getAngryDog(int nbr) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nbr; i++) {
            result.append("woof");
        }
        return result.append('\n').toString();
    }
}
