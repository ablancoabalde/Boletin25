package boletin25;

import static boletin25.Main.*;
import java.util.ArrayList;

public class Logica {

    static Integer numCajas=0;
    ArrayList<Integer> arraySorteo=new ArrayList();
    ArrayList<Integer> arrayElegidos=new ArrayList();

    public void nPremiado() {

        jLg1.setText(nRandomNoRepeat());
        jLg2.setText(nRandomNoRepeat());
        jLg3.setText(nRandomNoRepeat());
        jLg4.setText(nRandomNoRepeat());
        jLg5.setText(nRandomNoRepeat());
        jLg6.setText(nRandomNoRepeat());
    }

    public String nRandomNoRepeat() {
        Boolean encontrado=false;
        Integer num;
        do {
            num=(int) (Math.random()*49)+1;

        } while (arraySorteo.indexOf(num)!=-1);

        arraySorteo.add(num);
        return Integer.toString(num);
    }

    public void acertados() {
        Integer acertados=0;
        for (Integer p : arraySorteo) {
            for (Integer j : arrayElegidos) {
                if (p==j) {
                    acertados+=1;
                }
            }
        }
        jLnAciertos.setText(Integer.toString(acertados));
    }

    public void introducir(int num) {

        switch (numCajas) {
            case 0:
                Caja1.setText(Integer.toString(num));
                numCajas+=1;
                arrayElegidos.add(num);
                break;
            case 1:
                Caja2.setText(Integer.toString(num));
                numCajas+=1;
                arrayElegidos.add(num);
                break;
            case 2:
                Caja3.setText(Integer.toString(num));
                numCajas+=1;
                arrayElegidos.add(num);
                break;
            case 3:
                Caja4.setText(Integer.toString(num));
                numCajas+=1;
                arrayElegidos.add(num);
                break;
            case 4:
                Caja5.setText(Integer.toString(num));
                numCajas+=1;
                arrayElegidos.add(num);
                break;
            case 5:
                Caja6.setText(Integer.toString(num));
                numCajas=0;
                arrayElegidos.add(num);
                break;
        }

    }

}
