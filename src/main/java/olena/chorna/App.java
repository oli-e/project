package olena.chorna;

public final class App {
    public static void main(String[] args){
        Zespolone a = new Zespolone(1,0);
        Zespolone b = new Zespolone(0,1);
        Zespolone c = a.dodaj(b);
        System.out.println("re: " + c.re + ", im: " + c.im);
        System.out.println("ooooo");
    }
}

class Zespolone{
    public int re, im;
    public Zespolone(int re, int im) {
        this.re = re;
        this.im = im;
    }
    public Zespolone dodaj(Zespolone b) {
        Zespolone c = new Zespolone(this.re + b.re, this.im + b.im );
        return (c);
    }
}
