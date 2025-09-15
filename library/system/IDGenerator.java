package library.system;

public class IDGenerator {
    private static int nextBookIsbn = 1001;
    private static int nextMemberId = 1;

    public static int nextBookIsbn() {
        return nextBookIsbn++;
    }

    public static int nextMemberId() {
        return nextMemberId++;
    }
}
