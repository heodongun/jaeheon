//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        char letter = input.charAt(0);
//        int [][]chess=new int[8][8];
//        int point=0;
//        int number = Character.getNumericValue(input.charAt(1));
//        int a = letter - 'a' + 1;
//        if(a+2<=8){
//            if(number+2<=8){
//                point++;
//            }
//            if(number-2>=1){
//                point++;
//            }
//        }
//        if(a-2>=1){
//            if(number+2<=8){
//                point++;
//            }
//            if(number-2>=1){
//                point++;
//            }
//        }
//        if(number+2<=8){
//            if(a+2<=8){
//                point++;
//            }
//            if(a-2>=1){
//                point++;
//            }
//        }
//        if(number-2>=1){
//            if(a+2<=8){
//                point++;
//            }
//            if(a-2>=1){
//                point++;
//            }
//        }
//        System.out.println(point);
//        sc.close();
//    }
//}
//class car {
//    String who ;
//    int number;
//    static String carjong="모닝";
//    static int year=0;
//}
//
//class Main{
//    public static void main(String[] args) {
//        car car1=new car();
//        car car2=new car();
//        car car3=new car();
//        car1.who="동운이꺼";
//        car2.who="도훈이꺼";
//        car3.who="제현쌤꺼";
//        car1.number=10010101;
//        car2.number=10000000;
//        car3.number=10000010;
//        System.out.println(car1.who);
//        System.out.println(car1.number);
//        System.out.println(car.carjong);
//        System.out.println(car.year+"년탐");
//        System.out.println(car2.who);
//        System.out.println(car2.number);
//        System.out.println(car.carjong);
//        System.out.println(car.year+"년탐");
//        System.out.println(car3.who);
//        System.out.println(car3.number);
//        System.out.println(car.carjong);
//        System.out.println(car.year+"년탐");
//    }
//}
//class Data3 { int x; }
//
//class Main {
//    public static void main(String[] args)
//    {
//        Data3 d = new Data3();
//        d.x = 10;
//
//        Data3 d2 = copy(d);
//        System.out.println("d.x ="+d.x);
//        System.out.println("d2.x="+d2.x);
//    }
//
//    static Data3 copy(Data3 d) {
//        Data3 tmp = new Data3();
//        tmp.x = d.x;
//
//        return tmp;
//    }
//}

//String result=a.concat(b);
//System.out.println(result); 이렇게 하면 합쳐짐)

//class Main {
//    public static void main(String[] args) {
//        String a = "돈까스";
//        String b = "해물파전";
//        String result = a.concat(b);
//        System.out.println(result);
//    }
//}



//class typeof{
//    String type;
//    typeof(){
//        this("null",10);
//    }
//    typeof(String type){
//        this.type="String";
//        System.out.println(type);
//        System.out.println(this.type);
//    }
//    typeof(int type){
//        this.type="int";
//        System.out.println(type);
//        System.out.println(this.type);
//    }
//    typeof(double type){
//        this.type="double";
//        System.out.println(type);
//        System.out.println(this.type);
//    }
//    typeof(char type){
//        this.type="char";
//        System.out.println(type);
//        System.out.println(this.type);
//    }
//    typeof(float type) {
//        this.type = "float";
//        System.out.println(type);
//        System.out.println(this.type);
//    }
//    typeof(String type,int a){
//        for(int i=0;i<a;i++){
//            System.out.println(type);
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args){
//        typeof A = new typeof();
//    }
//}
//


//class Shape { //도형
//    String color = "black";
//    void draw() {
//        System.out.printf("[color=%s]%n", color);
//    }
//}
//
//class Point { //점
//    int x;
//    int y;
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//    String getXY() {
//        return "("+x+","+y+")"; // x와 y의 값을 문자열로 반환
//    }
//}
//
//class Circle extends Shape { //원
//    Point center;   // 원의 원점좌표
//    int r;          // 반지름
//    Circle(Point center, int r) {
//        this.center = center;
//        this.r = r;
//    }
//    void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
//        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
//    }
//}
//
//class Triangle extends Shape { //삼각형
//    Point[] p;
//    Triangle(Point[] p) {
//        this.p = p;
//    }
//    void draw() {
//        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
//    }
//}
//class pjh {
//    public static void main(String[] args) {
//        Point[] p = {new Point(100, 100),
//                new Point(140, 50),
//                new Point(200, 100)
//        };
//        Triangle t = new Triangle(p);
//        Circle c = new Circle(new Point(150, 150), 50);
//
//        t.draw(); // 삼각형을 그린다.
//        c.draw(); // 원을 그린다.
//    }
//}




class pjh {
    public static void main(String args[]) {
        Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);	   	// 섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c); 	// System.out.println(c.toString());과 같다.
        d.shuffle();			// 카드를 섞는다.
        c = d.pick(0);		   	// 섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}
// Deck클래스
class Deck {
    final int CARD_NUM = 52;	// 카드의 개수
    Card cardArr[] = new Card[CARD_NUM];  // Card객체 배열을 포함
    Deck () {	// Deck의 카드를 초기화한다.
        int i=0;
        for(int k=Card.KIND_MAX; k > 0; k--)
            for(int n=0; n < Card.NUM_MAX ; n++)
                cardArr[i++] = new Card(k, n+1);
    }
    Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];
    }
    void shuffle() { // 카드의 순서를 섞는다.
        for(int i=0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
} // Deck클래스의 끝

// Card클래스
class Card {
    static final int KIND_MAX = 4;	// 카드 무늬의 수
    static final int NUM_MAX  = 13;	// 무늬별 카드 수
    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;
    int kind;
    int number;
    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

        return "kind : " + kinds[this.kind]
                + ", number : " + numbers.charAt(this.number);
    } // toString()의 끝
} // Card클래스의 끝