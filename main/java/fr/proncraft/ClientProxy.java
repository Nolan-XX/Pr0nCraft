package fr.proncraft;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRender()
	{
		System.out.println("m�thode c�t� client");
	}
}