package com.srkotapati.examplemod.init;

import com.srkotapati.examplemod.SetUp;
import com.srkotapati.examplemod.blocks.BlockTest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExampleBlocks {
	//add your own block variables here wherever example_block appears
	public static Block example_block;
	public static void init(){
		//Use Material.block methods to get a block similar to the one you're creating
		//example_block = new BlockTest(Material.wood).setUnlocalizedName("example_block");
		//example_block.setCreativeTab(CreativeTabs.tabBlock);
	}
	public static void register(){
		//GameRegistry.registerBlock(example_block, example_block.getUnlocalizedName().substring(5));
	}
	public static void registerRenders(){
		//registerRender(example_block);
	}
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(SetUp.MODID+"i"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}
