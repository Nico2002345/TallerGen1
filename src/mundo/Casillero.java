/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author nicol
 */
public class Casillero<T> {

    private T producto;

    public Casillero() {
        producto = null;
    }

    public boolean agregar(T pProducto) {
        if (producto == null) {
            producto = pProducto;
            return true;
        }
        return false;
    }

    public T darProducto() {
        return producto;
    }

    public T despachar() {
        T nObjeto = producto;
        producto = null;
        return nObjeto;
    }

    public boolean estaDesocupado() {
        return producto == null;
    }
}
