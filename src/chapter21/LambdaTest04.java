package chapter21;

interface IntAAA {
    void print(AAA aaa, int num);
}

interface StrBBB { // int 반환 !!
    int print(AAA aaa, String str);
}

interface StrCCC { // int 반환 !!
    int print(BBB b, String str);
}

class AAA {
    void print(int num) {
        System.out.println(num + "메서드");
    }
}

class BBB {
    int print(String str) {
        return str.length();
    }
}

public class LambdaTest04 {
    public static void main(String[] args) {
        
        AAA a = new AAA();
        BBB b = new BBB();
        
        // Lambda
        IntAAA intA = (aaa, num) -> aaa.print(num);
        intA.print(a, 5);
        
        // 더 간단히
        IntAAA intA2 = AAA::print;
        intA2.print(a, 5);
        
        System.out.println("===========================");
        
        // StrBBB는 int 반환
        StrBBB strB = (aaa, str) -> {
            aaa.print(5);
            return str.length();
        };
        System.out.println(strB.print(a, "문자열"));
        
        System.out.println("===========================");
        
        // StrCCC는 int 반환
        StrCCC strC = (bbb, str) -> bbb.print(str);
        System.out.println(strC.print(b, "안녕하세요"));
        
        System.out.println("===========================");
        
        StrCCC strC2 = BBB::print;
        System.out.println(strC2.print(b, "안녕하세요"));
    }
}