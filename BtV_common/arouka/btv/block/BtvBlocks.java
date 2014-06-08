package arouka.btv.block;

import arouka.btv.tileentity.TileEntityBookStand;
import arouka.btv.tileentity.TileEntityCyberwolf;
import arouka.btv.tileentity.TileEntityEnderchilla;
import arouka.btv.tileentity.TileEntityResearchStation;
import arouka.btv.tileentity.TileEntityShowChair;
import arouka.btv.tileentity.TileEntitySmallMirror;
import arouka.btv.tileentity.TileEntitySpawnerConverter;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class BtvBlocks {
	
	public static Block cryinobs;
	public static Block agore;
	public static Block mushtable;
	public static Block smirror;
	public static Block cwolf;
	public static Block echilla;
	public static Block rstation;
	public static Block sconvert;
	public static Block bstand;
	public static Block schair;
	
	public static void init() {
		{
			cryinobs = new BlockCryingObsidian(BlockInfo.CRYINOBS_ID);
			GameRegistry.registerBlock(cryinobs, BlockInfo.CRYINOBS_KEY);
		}
		
		{
			agore = new BlockAgateOre(BlockInfo.AGORE_ID);
			GameRegistry.registerBlock(agore, BlockInfo.AGORE_KEY);
		}
		
		{
			mushtable = new BlockMushCraftingTable(BlockInfo.MUSHTABLE_ID);
			GameRegistry.registerBlock(mushtable, BlockInfo.MUSHTABLE_KEY);
		}
		
		{
			smirror = new BlockSmallMirror(BlockInfo.SMALLMIRROR_ID);
			GameRegistry.registerTileEntity(TileEntitySmallMirror.class, BlockInfo.SMALLMIRROR_NAME);
			GameRegistry.registerBlock(smirror, BlockInfo.SMALLMIRROR_KEY);
		}
		
		{
			cwolf = new BlockCyberwolf(BlockInfo.CYBERWOLF_ID);
			GameRegistry.registerTileEntity(TileEntityCyberwolf.class, BlockInfo.CYBERWOLF_NAME);
			GameRegistry.registerBlock(cwolf, BlockInfo.CYBERWOLF_KEY);
		}
		
		{
			echilla = new BlockEnderchilla(BlockInfo.ENDERCHILLA_ID);
			GameRegistry.registerTileEntity(TileEntityEnderchilla.class, BlockInfo.ENDERCHILLA_UNLOCALIZED_NAME);
			GameRegistry.registerBlock(echilla, BlockInfo.ENDERCHILLA_KEY);
		}
		
		{
			rstation = new BlockResearchStation(BlockInfo.SEARCHSTATION_ID);
			GameRegistry.registerTileEntity(TileEntityResearchStation.class, BlockInfo.SEARCHSTATION_UNLOCALIZED_NAME);
			GameRegistry.registerBlock(rstation, BlockInfo.SEARCHSTATION_KEY);
		}
		
		{
			sconvert = new BlockSpawnerConverter(BlockInfo.SPAWNCHANGE_ID);
			GameRegistry.registerTileEntity(TileEntitySpawnerConverter.class, BlockInfo.SPAWNCHANGE_UNLOCALIZED_NAME);
			GameRegistry.registerBlock(sconvert, BlockInfo.SPAWNCHANGE_KEY);
		}
		
		{
			bstand = new BlockBookStand(BlockInfo.BOOKSTAND_ID);
			GameRegistry.registerTileEntity(TileEntityBookStand.class, BlockInfo.BOOKSTAND_UNLOCALIZED_NAME);
			GameRegistry.registerBlock(bstand, BlockInfo.BOOKSTAND_KEY);
		}
		
		{
			schair = new BlockShowChair(BlockInfo.SHOWCHAIR_ID);
			GameRegistry.registerTileEntity(TileEntityShowChair.class, BlockInfo.SHOWCHAIR_UNLOCALIZED_NAME);
			GameRegistry.registerBlock(schair, BlockInfo.SHOWCHAIR_KEY);
		}
		
	}
	
	public static void addNames() {
		LanguageRegistry.addName(cryinobs, BlockInfo.CRYINOBS_NAME);
		LanguageRegistry.addName(agore, BlockInfo.AGORE_NAME);
		LanguageRegistry.addName(mushtable, BlockInfo.MUSHTABLE_NAME);
		LanguageRegistry.addName(smirror, BlockInfo.SMALLMIRROR_NAME);
		LanguageRegistry.addName(cwolf, BlockInfo.CYBERWOLF_NAME);
		LanguageRegistry.addName(echilla, BlockInfo.ENDERCHILLA_NAME);
		LanguageRegistry.addName(rstation, BlockInfo.SEARCHSTATION_NAME);
		LanguageRegistry.addName(sconvert, BlockInfo.SPAWNCHANGE_NAME);
		LanguageRegistry.addName(bstand, BlockInfo.BOOKSTAND_NAME);
		LanguageRegistry.addName(schair, BlockInfo.SHOWCHAIR_NAME);
		
		
	}

}
