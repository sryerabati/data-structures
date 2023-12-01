import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day1{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Advent of Code/day1/day1.txt");
        Scanner scan = new Scanner(file);
        int num1=999; int num2=999;
        int sum = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            for (int i = 0; i < line.length(); i++) {
                try{
                    if (num1 == 999){
                        num1 = Integer.parseInt(line.charAt(i) + "");
                    }
                    else{
                        num2 = Integer.parseInt(line.charAt(i) + "");
                    }
                    
                }
                catch(Exception e){
                    
                }
            }
            if(num2==999){
                num2=num1;
            }
            sum += Integer.parseInt(num1+""+num2);
            System.out.println(Integer.parseInt(num1+""+num2));
            num1=999; num2=999;
        }
        System.out.println(sum);

    }
}