/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author nicol
 */
public class Electronico extends Producto{

	public enum  Gama {
		ALTA, MEDIA, BAJA
	}

	protected Gama gama;

	public Electronico(Gama pGama,double pPrecio)
	{
		super(pPrecio);
		gama = pGama;
	}

}
