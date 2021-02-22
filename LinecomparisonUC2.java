public class LinecomparisonUC2 {

   public static void main(String[] args) {

  double x1= Math.floor(Math.random() * 10);
  double x2= Math.floor(Math.random() * 10);
  double y1= Math.floor(Math.random() * 10);
  double y2= Math.floor(Math.random() * 10);


  double length1 = Math.floor(Math.sqrt((x2-y1)*(x2-y1)) + ((y2-y1)*(y2-y1)));
  double length2 = Math.floor(Math.sqrt((x2-y1)*(x2-y1)) + ((y2-y1)*(y2-y1)));

   System.out.println("length is =" +length1);
   System.out.println("length is =" +length2);

   System.out.println(length1 == length2);
   System.out.println(length1 >= length2);
   System.out.println(length1 <= length2);
  }
}
