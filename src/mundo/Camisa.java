/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author Nicolas
 */
public class Camisa extends Vestuario{

	public enum Marca
	{
		Polo,Nike,Adidas,Marco,Gef
	}
        private Marca marca;
        
      public Camisa(Marca pmarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pmarca;
	}

	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
