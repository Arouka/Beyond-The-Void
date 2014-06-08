package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockAgateOre extends Block {
	
	public BlockAgateOre(int id) {
		super(id, Material.rock);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(3F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.AGORE_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon agoreIcon;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		agoreIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.AGORE_ICON);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		return agoreIcon;
	}
}

