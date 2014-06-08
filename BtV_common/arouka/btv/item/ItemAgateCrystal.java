package arouka.btv.item;

import arouka.btv.BeyondTheVoid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAgateCrystal extends Item {
	
	public ItemAgateCrystal(int id) {
		super(id);
		setCreativeTab(BeyondTheVoid.btv);
		setMaxStackSize(64);
		setUnlocalizedName(ItemInfo.CRYSTAG_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.CRYSTAG_ICON);
	}

}
