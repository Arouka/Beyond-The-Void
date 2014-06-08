package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import arouka.btv.tileentity.TileEntityBookStand;
import arouka.btv.tileentity.TileEntitySmallMirror;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBookStand extends Block implements ITileEntityProvider {
	
	public BlockBookStand(int id) {
		super(id, Material.wood);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(3F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.BOOKSTAND_UNLOCALIZED_NAME);
	}
	
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBookStand();
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
