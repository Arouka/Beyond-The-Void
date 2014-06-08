package arouka.btv.lib;

import arouka.btv.block.BtvBlocks;
import net.minecraft.creativetab.CreativeTabs;

public class BtvTab extends CreativeTabs {
	
	public BtvTab(int id, String name) {
		super (id, name);
	}

@Override
public int getTabIconItemIndex() {
	return BtvBlocks.cryinobs.blockID;
}
}