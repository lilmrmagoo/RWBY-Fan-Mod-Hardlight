package dragonofcreativity.rwbyfm.init;

import java.util.ArrayList;
import java.util.List;

import dragonofcreativity.rwbyfm.Main;
import dragonofcreativity.rwbyfm.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block HARDLIGHT_FORGE = new BlockBase("hardlight_forge", Material.IRON,Main.rwbyfmtab);
}
