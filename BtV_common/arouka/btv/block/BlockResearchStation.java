package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntityResearchStation;
import arouka.btv.tileentity.TileEntitySmallMirror;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockResearchStation extends Block implements ITileEntityProvider {
	
	public BlockResearchStation(int id) {
		super(id, Material.anvil);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(5F);
		setStepSound(Block.soundAnvilFootstep);
		setUnlocalizedName(BlockInfo.SEARCHSTATION_UNLOCALIZED_NAME);
	}
	
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityResearchStation();
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

