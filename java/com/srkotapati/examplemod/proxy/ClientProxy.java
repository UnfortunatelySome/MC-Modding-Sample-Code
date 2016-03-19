package com.srkotapati.examplemod.proxy;

import com.srkotapati.examplemod.init.ExampleBlocks;
import com.srkotapati.examplemod.init.ExampleItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ExampleItems.registerRenders();
		ExampleBlocks.registerRenders();
	}
}
