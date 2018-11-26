public class Aufgabe4_1810653445 {
        public static void main(String[] args){

            System.out.println("Do-While-Schleife: ");
            int zahl1 = 1; //do while Schleife ist eine Fusßgesteuerte schleife, d.h. zuerst wird der Wert errechnet und dann verglichen
            do {
                System.out.println("Der Schleifenzähler ist: " + zahl1++);
            } while(zahl1 <= 10);

            System.out.println(" ");

            System.out.println("for-Schleife: "); //for und while schleife sind Kopfgesteuerte schleifen, Wert wird zuerst verglichen
            for (int zahl2 = 1; zahl2 <= 10; zahl2++){
                System.out.println("Der Schleifenzähler ist: " + zahl2);
            }
            System.out.println(" ");

            System.out.println("While-Schleife: ");
            int zahl3 = 1;
            while(zahl3 <= 10){
                System.out.println("Der Schleifenzähler ist: " + zahl3++);
            }


        }
    }

