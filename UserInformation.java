public class UserInformation {
  public static void main(String[] args) {
    String name = "ナナ";
    int age = 23;
    double  height = 1.2;
    double weight = 27;
    double  bmi  = weight/height/height;

    System.out.println("名前は" + name +"です");
    System.out.println("年齢は" + age +"歳です");
    System.out.println("身長は" + height +"mです");
    System.out.println("体重は" + weight +"kgです");
    System.out.println("BMIは" + bmi +"です");
  }
}
