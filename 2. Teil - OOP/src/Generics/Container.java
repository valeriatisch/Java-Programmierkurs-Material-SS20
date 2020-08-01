package Generics;

//generic class
public class Container<E, T> {
    
    /*
    E - element
    K, V - key, value
    T - types
     */

    private T attribut;

    void setAttribut(T attribut) {
        this.attribut = attribut;
    }

    T getAttribut(){
        return this.attribut;
    }

}
