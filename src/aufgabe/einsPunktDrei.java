package aufgabe;

public class einsPunktDrei{

    public static void main(String[] args) {

        String helloWorld = " Hello World! ";
        System.out.println(helloWorld);
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.toLowerCase());
        String replaceString = helloWorld.replace("World!","Codersbay");
        System.out.println(replaceString);
        helloWorld = helloWorld.trim();
        System.out.println(helloWorld);
        helloWorld+="\n";
        String repeatedString = helloWorld.repeat(15);
        System.out.print(repeatedString);


    }
}
