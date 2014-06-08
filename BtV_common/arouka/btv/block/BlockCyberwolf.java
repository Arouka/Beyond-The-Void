package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntityCyberwolf;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockOreStorage;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCyberwolf extends Block implements ITileEntityProvider {
	
	public BlockCyberwolf(int id) {
		super(id, Material.anvil);
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(10F);
		setStepSound(Block.soundAnvilFootstep);
		setUnlocalizedName(BlockInfo.CYBERWOLF_UNLOCALIZED_NAME);
	}
	
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityCyberwolf();
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
}

