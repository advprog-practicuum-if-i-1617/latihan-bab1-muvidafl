package latihan;

public class posisi {
    int x,y;
    
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public void PosisiAwal() {
        x=1; y=1;
    }
    public void Atas() {
        y = y-1;
    }
    public void Bawah() {
        y = y+1;
    }
    public void Kiri() {
        x= x-1;
    }
    public void Kanan() {
        x= x+1;
    }
    
}
