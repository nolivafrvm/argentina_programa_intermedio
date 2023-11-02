package clase_dos.ComunVsFuncional;

public class TestSumar implements InterfazFuncional{

    @Override
    public int sumar(int numeroA, int numeroB) {
        System.out.println(numeroA+numeroB);
        return numeroA+numeroB;
    }

//    @Override
//    public int sumar(int numeroA, int numeroB, int sumarC) {
//        return 0;
//    }
}
