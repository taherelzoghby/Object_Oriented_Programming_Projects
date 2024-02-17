
import java.util.Scanner;

public class testDoor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        DogDoor door = new DogDoor();
        door.setAllowedBark(new Bark("WO WO"));
        door.setAllowedBark(new Bark("WOf WOf"));
        door.setAllowedBark(new Bark("WOoo wooo"));
        barkRecognizer reco = new barkRecognizer(door);
        Remote remote = new Remote(door);
        System.out.println("Bruce starts barking");
        reco.barkReco(new Bark("wo w"));
        System.out.println("\nBruce has gone outside...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("\nBruce’s all done...");
        System.out.println("...but he’s stuck outside!");
// Simulate the hardware hearing a bark (not Bruce!)
        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking.");
        reco.barkReco(smallDogBark);
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
        }
// Simulate the hardware hearing a bark again
        System.out.println("Bruce starts barking.");
        reco.barkReco(new Bark("rooowlf"));
        System.out.println("\nBruce ’s back inside...");

        // sum binary
//		System.out.print("enter binary number1 : ");
//		String num1 = input.next();
//		System.out.print("enter binary number2 : ");
//		String num2 = input.next();
//		int number1 = Integer.parseInt(num1, 2);
//		int number2 = Integer.parseInt(num2, 2);
//		int sum = number1 + number2;
//		System.out.println("sum of binary numbers : "+Integer.toBinaryString(sum));
//		//sum octal
//		String num1 = input.next();
//		String num2 = input.next();
//		int number1 = Integer.parseInt(num1, 8);
//		int number2 = Integer.parseInt(num2, 8);
//		int sum = number1 + number2;
//		System.out.println(Integer.toOctalString(sum));
    }

}
