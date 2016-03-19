package com.srkotapati.examplemod.init;

import com.srkotapati.examplemod.SetUp;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExampleItems {
	//Add item variables for your own items
	public static Item example_item;
	public static Item another_example_item;
	//public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	
	public static void init(){
		//Add your own initialization statements
		another_example_item = new Item().setUnlocalizedName("another_example_item");
		another_example_item.setCreativeTab(CreativeTabs.tabCombat);
	}
	public static void register(){
		//Copy this registration line for your own items
		GameRegistry.registerItem(another_example_item, another_example_item.getUnlocalizedName().substring(5));
	}
	public static void registerRenders(){
		//Copy this registration line for your own items
		registerRender(another_example_item);
	}
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(SetUp.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));
	}
}
