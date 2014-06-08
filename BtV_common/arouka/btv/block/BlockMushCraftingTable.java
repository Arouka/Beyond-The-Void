package arouka.btv.block;

import arouka.btv.BeyondTheVoid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockMushCraftingTable extends Block {
	
	public BlockMushCraftingTable(int id) {
		super(id, Material.wood);
		
		setCreativeTab(BeyondTheVoid.btv);
		setHardness(2.5F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.MUSHTABLE_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	@SideOnly(Side.CLIENT)
	private Icon frontIcon;
	@SideOnly(Side.CLIENT)
	private Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	private Icon offIcon;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.MUSHTABLE_TOP);
		sideIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.MUSHTABLE_SIDE);
		frontIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.MUSHTABLE_FRONT);
		bottomIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.MUSHTABLE_BOT);
		offIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.MUSHTABLE_OFF);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return bottomIcon;
		}else if(side == 1) {
			return isDisabled(meta) ? offIcon : topIcon;
		}else if(side == 2) {
			return sideIcon;
		}else if(side == 3) {
			return sideIcon;
		}else{
			return frontIcon;
	
		}
	}
	
	private boolean isDisabled(int meta) {
		return meta == 1;
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (!world.isRemote && !isDisabled(world.getBlockMetadata(x, y, z))) {
			spawnMushroom(world, x, y + 1, z);
		}
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int id) {
		if (!world.isRemote && world.isBlockIndirectlyGettingPowered(x, y, z ) && !isDisabled(world.getBlockMetadata(x, y, z))) {
			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					spawnMushroomBlock(world, x + i, y + 4, z + j);
				}
			}
		}
	}
	
	private void spawnMushroom(World world, int x, int y, int z) {
		if (world.isAirBlock(x, y, z)) {
		world.setBlock(x, y, z, Block.mushroomRed.blockID); }
		}
	private void spawnMushroomBlock(World world, int x, int y, int z) {
		if (world.isAirBlock(x, y, z)) {
		world.setBlock(x, y, z, Block.mushroomCapRed.blockID);
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			int newMeta = world.getBlockMetadata(x, y, z) == 0 ? 1 : 0;
			
			world.setBlockMetadataWithNotify(x, y, z, newMeta, 3);
		}
		
		return true;
	}
}

