package arouka.btv.item;

import java.util.List;

import arouka.btv.BeyondTheVoid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemCoin extends Item {
	
	@SideOnly(Side.CLIENT)
	private Icon chargedIcon;
	
	public ItemCoin(int id) {
		super(id);
		setCreativeTab(BeyondTheVoid.btv);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.COIN_UNLOCALIZED_NAME);
	}
	

	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			if (isCharged(itemstack.getItemDamage())) {
				target.motionX = (target.posX - player.posX) *2;
				target.motionZ = (target.posZ - player.posZ) *2;
				
				itemstack.setItemDamage(0);
			}else{
			itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			}
		}
		
		return false;
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.COIN_ICON);
		chargedIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.COIN_CHARGED_ICON);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
		info.add("This Shen Gong Wu has been empowered " + itemstack.getItemDamage() + " times");
		
		if (isCharged(itemstack.getItemDamage())) {
			info.add("MANTIS FLIP COIN!");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg) {
		if (isCharged(dmg)) {
			return chargedIcon;
		}else{
			return itemIcon;
		}
	}
	
	private boolean isCharged(int dmg){
		return dmg >= 10;
		
	}
}
