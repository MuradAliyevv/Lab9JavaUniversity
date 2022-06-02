class Main {
    public static void main(String[] args) {
        try {
            ThrowError.Error();
        } catch (ArrayIndexOutOfBoundsException arr) {
            arr.getMessage();
        } finally {
            System.out.println("Finally block has been run already");
        }
    }
}
