public class StringBuild {
     public static void main(String a[]) {
    StringBuilder sb =new StringBuilder("Hello");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
       //for setting char at index
    sb.setCharAt(0,'j');
    System.out.println(sb);
       //insert char after index
    sb.insert(1,'p');
    System.out.println(sb);
       //delete from start to end index
    sb.delete(1,2);
    System.out.println(sb);
       //to append at end of string
    sb.append(" Riyan");
    System.out.println(sb);
       //length of string
    System.out.println(sb.length());
       //reverse the string
    System.out.println(sb.reverse());
       //replace a part of string with other string
    System.out.println(sb.replace(0, 5, "rrr"));
    System.out.println(sb);
}
}
