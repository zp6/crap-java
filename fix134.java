package fix;
public class Fix134 {
  public static boolean notBlank(String s) { return s!=null && !s.trim().isEmpty(); }
}
