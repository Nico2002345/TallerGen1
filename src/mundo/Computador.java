/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author nicol
 */
public class Computador extends Electronico{

	public enum Operativo
	{
		Windows,MacOs,Linux,Ubuntu
	}

	private Operativo operativo;  

	public Computador(Gama pGama, double pPrecio,Operativo pOperativo)
	{
		super(pGama, pPrecio);
		operativo = pOperativo;
	}

	public String toString()
	{
		return "Computador "+operativo.name()+" - "+"Gama "+gama;
	}

}