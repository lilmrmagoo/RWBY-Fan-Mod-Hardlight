package dragonofcreativity.rwbyfm.creativetabs;


import dragonofcreativity.rwbyfm.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RWBYFMTab extends CreativeTabs
{
	public RWBYFMTab(String label) 
	{
		super("rwbyfmtab");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.ICON);
	}
}