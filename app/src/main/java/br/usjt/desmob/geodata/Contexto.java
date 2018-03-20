package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Created by joaoqueiroga93 on 20/03/18.
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
