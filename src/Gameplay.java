import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Gameplay
{
    public static void main(String[] args) throws FileNotFoundException{

        String chosenMovie = "batman begins";
        String n1 = "no country for old men";
        String n2 = "the dark knight";
        String n3 = "schindler's list";
        String n4 = "pulp fiction";
        String n5 = "the lord of the rings";
        String n6 = "the good the bad and the ugly";
        String n7 = "fight club";
        String n8 = "the lord of the rings";
        String n9 = "forrest gump";
        String n10 = "star wars";
        String n11 = "inception";
        String n12 = "dunkirk";
        String n13 = "the matrix";
        String n14 = "samurai";
        String n15 = "star wars";
        String n16 = "city of god";
        String n17 = "the silence of the lambs";
        String n18 = "the shawshank redemption";
        String n19 = "die hard";
        String n20 = "chinatown";
        String n21 = "room";
        String n22 = "the lord of the rings";
        String n23 = "fargo";
        String n24 = "the godfather";

        double r;

        r  = Math.random()*100;
        r = (int)r % 24;
        {
            if(r==1){
                chosenMovie = n1;
            }

            else if(r==2){
                chosenMovie = n2;
            }
            else if(r==3){
                chosenMovie = n3;
            }
            else if(r==4){
                chosenMovie = n4;
            }
            else if(r==5){
                chosenMovie = n5;
            }
            else if(r==6){
                chosenMovie = n6;
            }
            if(r==7){
                chosenMovie = n7;
            }

            else if(r==8){
                chosenMovie = n8;
            }
            else if(r==9){
                chosenMovie = n9;
            }
            else if(r==10){
                chosenMovie = n10;
            }
            else if(r==11){
                chosenMovie = n11;
            }
            else if(r==12){
                chosenMovie = n12;
            }
            if(r==13){
                chosenMovie = n13;
            }

            else if(r==14){
                chosenMovie = n14;
            }
            else if(r==15){
                chosenMovie = n15;
            }
            else if(r==16){
                chosenMovie = n16;
            }
            else if(r==17){
                chosenMovie = n17;
            }
            else if(r==18){
                chosenMovie = n18;
            }
            if(r==19){
                chosenMovie = n19;
            }

            else if(r==20){
                chosenMovie = n20;
            }
            else if(r==21){
                chosenMovie = n21;
            }
            else if(r==22){
                chosenMovie = n22;
            }
            else if(r==23){
                chosenMovie = n23;
            }
            else if(r==24){
                chosenMovie = n24;
            }
        }

        int winPoint = 0;
        int lossPoint = 0;

        String unseenLetter= "" ;
        for(int x = 0; x < chosenMovie.length(); x++){
            if(chosenMovie.charAt(x) != ' '){
                unseenLetter = unseenLetter + '-';
                winPoint++;
            }

            else
                unseenLetter = unseenLetter + ' ';

        }

        char[] wrongChar = new char[20];


        char[] a = unseenLetter.toCharArray();

        char[] chosen = chosenMovie.toCharArray();

        while(winPoint != 0 && lossPoint != 10){

            System.out.println("You are guessing: " + String.valueOf(a));
            System.out.println("You have guessed ("+(lossPoint)+ ") wrong letter:" + String.valueOf(wrongChar));
            System.out.print("Guess a letter:");

            char gussedChar ;
            Scanner scan= new Scanner(System.in);
            gussedChar = scan.next().charAt(0);

            int  inspect = 0;
            for(int z=0 ; z < chosenMovie.length(); z++){
                if(chosen[z] == gussedChar){
                    a[z] = gussedChar;

                    chosen[z] = '_';
                    winPoint--;
                    inspect++;
                }
            }

            if( inspect == 0)
            {

                wrongChar[lossPoint]=gussedChar;
                lossPoint++;

            }
        }
        if(winPoint==0)
            System.out.println("You win!!!");
        else
            System.out.println("You Lose!");

    }
}


