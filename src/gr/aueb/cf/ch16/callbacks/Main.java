package gr.aueb.cf.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        //Anonymous Class
        IPrintable printable = new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };

        //Lambda Expression
        IPrintable printable2 = () -> System.out.println("Hello World");

        doPrint(new IPrintable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        doPrint(() -> System.out.println("Hello World"));

        doPrint(() ->sayHello());           //Lambda expression

        doPrint(Main::sayHello);            //Method Reference

    }

    public static void doPrint(IPrintable printable) {
        printable.print();
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }
}
