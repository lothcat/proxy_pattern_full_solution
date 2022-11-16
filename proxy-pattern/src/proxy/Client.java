package proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter what level of magic doer you are
        System.out.println("Hello, good magic doer, please enter your magic power level id: ");
        int id = scanner.nextInt();
        Subject subject = new ProxyMagician(new RealSubject(id));
        subject.getPermission();

        System.out.println("Hello, good magic doer, please enter your magic power level id: ");
        int id2 = scanner.nextInt();
        Subject subject2 = new ProxyFairy(new RealSubject(id2));
        subject2.getPermission();



    }
}
