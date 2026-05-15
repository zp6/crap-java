package fix;

public class Fix134 {
    public static boolean isNotBlank(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static int safeParseInt(String value, int defaultValue) {
        if (value == null || value.trim().isEmpty()) return defaultValue;
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static boolean safeEquals(String a, String b) {
        if (a == null) return b == null;
        return a.equals(b);
    }
}
