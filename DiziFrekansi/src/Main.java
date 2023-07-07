import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size;



        System.out.println("Dizi boyutu : ");
        size = scan.nextInt();
        int[] list = new int[size];
        for(int i=0;i<list.length;i++) {
            System.out.print((i+1)+". Eleman : ");
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Olusturulan Dizi : "+Arrays.toString(list));

        int sayac = 1;

        for(int i=0;i<list.length;i++) {

            if(i == 0) {
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) {
                        sayac++;
                    }
                }
                System.out.println(list[i]+" sayisi "+sayac+" kere tekrar etti.");
            }
            else if(list[i] != list[i-1]) {
                for(int j=0;j<list.length;j++) {
                    if((i != j) && (list[i] == list[j])) {
                        sayac++;
                    }
                }
                System.out.println(list[i]+" sayisi "+sayac+" kere tekrar etti.");
            }

            sayac = 1;

        }





    }
}