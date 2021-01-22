import java.util.*;
public class practice{
    public static void main(String[] args){
        for(int i=1;i<10;i++) {
            for (int j = 1; j <= i; j++)
                System.out.format("%d*%d=%d\t", j, i, j * i);
            System.out.format("\n");
        }
    }
}
