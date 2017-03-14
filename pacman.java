package latihan;
import java.util.Scanner;
public class pacman {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        posisi a = new posisi();
        int i, j;
        int area[][] = new int[10][10];
        int poin=0, sisalangkah=20;
        String arah;
        a.PosisiAwal();        
        //makanan
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i==7 && j==1 || i==3&&j==8||i==8&&j==8){
                    area[i][j]=3;
                }
            }
        }

        do {
            
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (i==0&&j>=0&&j<=9 || i==1&&j==0|| i==1&&j==9||
                    i==2&&j==0|| i==2&&j==9|| i==3&&j==0|| i==3&&j==9||
                    i==4&&j==0|| i==4&&j==9|| i==5&&j==0|| i==5&&j==9||
                    i==6&&j==0|| i==6&&j==9|| i==7&&j==0|| i==7&&j==9||
                    i==8&&j==0|| i==8&&j==9|| i==9&&j>=0&&j<=9
                    ) {
                    area[i][j]=2;
                }
                else if (area[i][j]!=3){
                    area[i][j]=1;
                }
            }
        }
        System.out.print("Perintah Arah(w/a/s/d) : ");
        arah = in.nextLine();
        switch (arah) {
            case "a" :
                a.Kiri();
                if(a.getx()==0)
                    a.Kanan();
                break;
            case "d" :
                a.Kanan();
                if(a.getx()==9)
                    a.Kiri();
                break;
            case "s" :
                a.Bawah();
                if (a.gety()==9)
                    a.Atas();
                break;
            case "w" :
                a.Atas(); 
                if (a.gety()==0)
                    a.Bawah();
                break;
        }
        if (area[a.gety()][a.getx()]==3) {
            poin =poin+1;
        }
        area[a.gety()][a.getx()] =0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (area[i][j]==3) {
                    System.out.print("O");
                }
                if (area[i][j]==2) {
                    System.out.print("#");
                }
                if (area[i][j]==0) {
                    System.out.print("❤");
                }
                if (area[i][j]==1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Sisa langkah: "+sisalangkah--);
        System.out.println("Poin: "+poin);    
        System.out.println("");   
        if (poin==3) {
            System.out.println("HORE KAMU MENANG");
            System.exit(0);
        }
        }while (sisalangkah>0);
        
        if (poin==3) {
            if (sisalangkah>=0) {
                System.out.println("HORE KAMU MENANG");
            }
            else
                System.out.println("KASIHAN KAMU KALAH");
        }
        else if (poin<3) {
            System.out.println("KASIHAN KAMU KALAH");
        }
    }    
}
