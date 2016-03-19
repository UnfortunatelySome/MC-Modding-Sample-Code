package com.srkotapati.examplemod;

import com.srkotapati.examplemod.init.ExampleBlocks;
import com.srkotapati.examplemod.init.ExampleItems;
import com.srkotapati.examplemod.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SetUp.MODID,name = SetUp.MOD_NAME, version = SetUp.MOD_VERSION)
public class ExampleMod {
	@SidedProxy(clientSide = SetUp.CLIENT_PROXY_CLASS, serverSide = SetUp.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ExampleBlocks.init();
		ExampleBlocks.register();
		ExampleItems.init();
		ExampleItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		GameRegistry.addRecipe(new ItemStack(ExampleItems.example_item), new Object[]{"WWW",
																					  "WWW"
																					, "WWW",'W',Blocks.planks});
	} 
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
