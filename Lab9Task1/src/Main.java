class Main {
    public static void main(String[] args) {
        try {
            NullPointer.Error();
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }
}
