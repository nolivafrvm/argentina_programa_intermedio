package clase_dos.ComunVsFuncional;

public class AppFuncional {

    public static void main(String[] args) {
        TestSumar test = new TestSumar();
//        test.sumar(1,2,3);
        test.sumar(1,2);

        InterfazFuncional miSuma = (int a, int b) -> {
            return a+b*2;
        };

        InterfaceComun interfaceComun = (int a, int b, int c) -> {
          return a + b * 10;
        };



        System.out.println(miSuma.sumar(1,2));
        System.out.println(interfaceComun.sumar(1,2,3));
//        System.out.println(interfaceComun.sumar(1,2));

    }

}
