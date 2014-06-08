package arouka.btv.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntityShowChair;
import arouka.btv.tileentity.TileEntitySmallMirror;

public class BlockShowChair extends Block implements ITileEntityProvider {
	

	public BlockShowChair(int id) {
		super(id, Material.wood);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(4F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.SHOWCHAIR_UNLOCALIZED_NAME);
	}
	
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityShowChair();
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

