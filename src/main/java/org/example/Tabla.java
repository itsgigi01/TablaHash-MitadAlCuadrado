package org.example;

public class Tabla {
    Empleado[] T;

    public Tabla(){
        this.T=new Empleado[1000];
    }

    public void insertar(Empleado empleado){
        T[mCuadrado(empleado.id)]=empleado;
    }


    public int mCuadrado(int x){
        //System.out.println("la clave original: "+x);
        double rtado,idDouble;
        int claveF;
        idDouble=(double) x;
        rtado=idDouble*idDouble;
        rtado=rtado%1000;
        //System.out.println("La clave final es: "+rtado);
        claveF=(int)rtado;
        return claveF;
    }

    public void muestra(){
        System.out.println("             -- E M P L E A D O S --");
        for (int i=0;i<T.length;i++){
            if(T[i]!=null)
            {
                System.out.println("El empleado se ubico en la posicion: "+i+ " y su clave era : "+T[i].getId());
            }
        }
    }


}