package OCA.ch05.interfaces;

private final interface CanCrawl { // DOES NOT COMPILE

    private void dig(int depth); // DOES NOT COMPILE

    protected abstract double depth(); // DOES NOT COMPILE

    public final void surface(); // DOES NOT COMPILE
}
