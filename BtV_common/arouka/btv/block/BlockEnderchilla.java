package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntityEnderchilla;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockEnderchilla extends Block implements ITileEntityProvider {
	
	public BlockEnderchilla(int id) {
		super(id, Material.cloth);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(2F);
		setStepSound(Block.soundClothFootstep);
		setUnlocalizedName(BlockInfo.ENDERCHILLA_UNLOCALIZED_NAME);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityEnderchilla();
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


