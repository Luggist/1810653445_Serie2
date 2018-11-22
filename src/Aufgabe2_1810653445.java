import javax.swing.*;

public class Aufgabe2_1810653445 {

    public static void main(String[] args){

        int a = (Integer.parseInt(JOptionPane.showInputDialog("bitte geben Sie eine Zahl 1 ein")));
        int b = (Integer.parseInt(JOptionPane.showInputDialog("bitte geben Sie eine Zahl 1 ein")));

        if (a==b) {
            System.out.println(a);
        }
        else{
            int c = 0;
            while(a != b){
                    c++;
                if(a<b) {
                    a++;
                }
                else{
                    b++;
                }
            }

            System.out.println(a);
            System.out.println(c);

        }

      }

    }