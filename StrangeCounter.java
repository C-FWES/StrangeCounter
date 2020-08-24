    static long strangeCounter(long t) {
        long two = findPowerTwo(t);
        return (3 * (two - 1) - t + 1);
    }

    public static long findPowerTwo(long t) {
        double x = (t + 3) / 3.0;
        double y = Math.log10(x) / Math.log10(2);
        long ceil = (long) Math.ceil(y);
        return 2L << (ceil - 1); //equivalent to 2 power of ceil
    }
