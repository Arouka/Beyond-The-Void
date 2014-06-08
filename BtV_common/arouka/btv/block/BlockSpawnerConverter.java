package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntitySmallMirror;
import arouka.btv.tileentity.TileEntitySpawnerConverter;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSpawnerConverter extends Block implements ITileEntityProvider {
	
	public BlockSpawnerConverter(int id) {
		super(id, Material.anvil);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(5F);
		setStepSound(Block.soundAnvilFootstep);
		setUnlocalizedName(BlockInfo.SPAWNCHANGE_UNLOCALIZED_NAME);
	}
	
	public TileEntity createNewTileEntity(World world) {
		return new TileEntitySpawnerConverter();
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

