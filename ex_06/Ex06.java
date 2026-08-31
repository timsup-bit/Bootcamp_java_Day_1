class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String term = "1";

        for (int i = 0; i <= nbr; i++) {
            System.out.println(term);
            term = nextTerm(term);
        }
    }

    private static String nextTerm(String term) {
        StringBuilder next = new StringBuilder();

        for (int i = 0; i < term.length(); ) {
            char digit = term.charAt(i);
            int count = 0;

            while (i < term.length() && term.charAt(i) == digit) {
                count++;
                i++;
            }
            next.append(count).append(digit);
        }
        return next.toString();
    }
}
