package app;
public class calculos {
    

    public  float suma(float valorUno, float valorDos) {
        float respuesta;
        respuesta=valorUno+valorDos;
        return respuesta;
        
    }
    public  float resta(float valorUno, float valorDos) {
        float respuesta;
        respuesta=valorUno-valorDos;
        return respuesta;
        
    }
    public float multiplicacion(float valorUno, float valorDos) {
        float respuesta;
        respuesta=valorUno*valorDos;
        return respuesta;
        
    }
    public  float division(float valorUno, float valorDos) {
        float respuesta;
        if(valorDos==0)
            respuesta=0;
        respuesta=valorUno/valorDos;
        return respuesta;
        
    }


}