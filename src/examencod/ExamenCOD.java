package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 11;
        if (metodoMio(num)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int numX = 2; numX < 1000; numX++) {
            if (metodoMio(numX)) {
                System.out.print(numX + " ");
            }
        }
    }

    public static boolean metodoMio(int variable) {
        int num = 2;
        boolean situacion = true;
        while ((situacion) && (num != variable)) {
            if (variable % num == 0) {
                situacion = false;
            }
            num++;
        }
        return situacion;
    }

}
