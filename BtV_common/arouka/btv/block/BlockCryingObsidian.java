package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockCryingObsidian extends Block {
	
	public BlockCryingObsidian(int id) {
		super(id, Material.rock);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(50F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.CRYINOBS_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon cryinIcon;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		cryinIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.CRYINOBS_ICON);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		return cryinIcon;
	}
}
