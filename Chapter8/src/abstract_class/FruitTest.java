package abstract_class;

import java.util.Scanner;

//추상 부모 클래스
abstract class Fruit {
 public abstract void showInfo();
}

//포도 클래스
class Grape extends Fruit {
 @Override
 public void showInfo() {
     System.out.println("포도는 맛있고 항산화 효과가 있습니다.");
 }
}

//복숭아 클래스
class Peach extends Fruit {
 @Override
 public void showInfo() {
     System.out.println("복숭아는 달콤하고 비타민이 풍부합니다.");
 }
}

//바나나 클래스
class Banana extends Fruit {
 @Override
 public void showInfo() {
     System.out.println("바나나는 에너지원이 풍부하고 소화가 잘 됩니다.");
 }
}

public class FruitTest {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("1. 포도 | 2. 복숭아 | 3. 바나나");
     System.out.print("선택> ");
     
     try {
         int menu = scanner.nextInt();
         
         Fruit fruit = null;
         if(menu == 1) {
             fruit = new Grape();
         } else if(menu == 2) {
             fruit = new Peach();
         } else if(menu == 3) {
             fruit = new Banana();
         } else {
             System.out.println("올바른 메뉴를 선택하세요.");
             return;  // 프로그램 종료
         }
         
         fruit.showInfo();
     } finally {
         scanner.close();
     }
 }
}
