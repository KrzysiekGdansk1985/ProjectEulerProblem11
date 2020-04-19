public class ProductMax {
    public static int PM(int [] tab){
        int productMax = 0;
        int temp;

        //horizontally
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                temp = tab[i*20 + j]*tab[i*20 + j+1]*tab[i*20 + j+2]*tab[i*20 + j+3];
                if (productMax < temp) productMax = temp;
            }
        }

        //vertical
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                temp = tab[i*20 + j]*tab[i*20 + j + 20]*tab[i*20 + j + 40]*tab[i*20 + j + 60];
                if (productMax < temp) productMax = temp;
            }
        }

        //diagonal up-left to down-right
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                temp = tab[i*20 + j]*tab[i*20 + j + 21]*tab[i*20 + j + 42]*tab[i*20 + j + 63];
                if (productMax < temp) productMax = temp;
            }
        }

        //diagonal up-right to down-left
        for (int i = 0; i < 17; i++) {
            for (int j = 3; j < 20; j++) {
                temp = tab[i*20 + j]*tab[i*20 + j + 19]*tab[i*20 + j + 38]*tab[i*20 + j + 57];
                if (productMax < temp) productMax = temp;
            }
        }

        return productMax;
    }
}
