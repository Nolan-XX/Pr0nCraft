package fr.proncraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "proncraft", name = "Pr0n Craft", version = "m.a.s.t.u.r.b.a.t.o.r")
public class MainClass
	{
		@Instance("proncraft")
		public static MainClass instance;
		public static final String MODID = "proncraft";
		@SidedProxy(clientSide = "fr.proncraft.ClientProxy", serverSide = "fr.proncraft.CommonProxy")
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{

		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.registerRender();
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{

		}
	}
