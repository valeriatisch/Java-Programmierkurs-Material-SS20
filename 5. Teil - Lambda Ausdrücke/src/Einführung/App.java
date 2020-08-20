package Einführung;

public class App {

    public static void main(String[] args){
        Mensch marie = new Mensch();
        marie.gehen();
        geher(marie);

        Robot rob = new Robot();
        rob.gehen();
        geher(rob);

        //Anonyme Klasse
        geher(new Gehbar() {
            @Override
            public void gehen() {
                System.out.println("Objekt geht. 1");
            }
        });

        //Lambda Ausdruck
        geher(() -> System.out.println("Objekt geht. 2"));

        Gehbar geh = () -> System.out.println("Objekt geht. 3");
        geh.gehen();
        geher(geh);

        ALambda sumVar = () -> System.out.println(3 + "+" + 4 + "=" + (3+4));
        sumVar.methode();
        Calculate sumVar2 = (a, b) -> a+b;
        //also possible: Einführung.Calculate sumVar2 = Integer::sum;
        System.out.println(sumVar2.rechnen(5, 4));
        Calculate geteilt = (a, b) -> {
            if(a==0) {
                return 0;
            }
            return a/b;
        };
        System.out.println(geteilt.rechnen(10, 2));

        GenericInterface<String> s = (str) -> {
            StringBuilder res = new StringBuilder();
            for(int i = str.length() - 1; i >= 0; i--) {
                res.append(str.charAt(i));
            }
            return res.toString();
        };

        System.out.println(s.reverse("Raspberry Pi"));
    }

    public static void geher(Gehbar o) {
        o.gehen();
    }

    public int summe(int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
        return a+b;
    }

    public int teilen(int a, int b) {
        if(a==0){
            return 0;
        }
        return a/b;
    }

    public String reverse(String str){
        String res = "";
        for(int i = str.length() - 1; i > 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}

@FunctionalInterface
interface Calculate{
    int rechnen(int a, int b);
}

@FunctionalInterface
interface GenericInterface<T>{
    T reverse(T str);
}

