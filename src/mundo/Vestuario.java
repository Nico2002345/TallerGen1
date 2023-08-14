/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author nicol
 */
public class Vestuario extends Producto{

	public enum Talla{

		XS, S, M, L, XL, XXL, XXXL
	}

	protected Talla talla;

	public Vestuario(Talla pTalla, double pPrecio)
	{
		super(pPrecio);
		talla = pTalla;

	}

}
