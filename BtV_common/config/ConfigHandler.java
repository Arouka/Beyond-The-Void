package config;

import java.io.File;

import arouka.btv.block.BlockInfo;
import arouka.btv.item.ItemInfo;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	

	public static void init (File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.CRYINOBS_ID = config.getBlock(BlockInfo.CRYINOBS_KEY, BlockInfo.CRYINOBS_DEFAULT).getInt();
		BlockInfo.AGORE_ID = config.getBlock(BlockInfo.AGORE_KEY, BlockInfo.AGORE_DEFAULT).getInt();
		BlockInfo.MUSHTABLE_ID = config.getBlock(BlockInfo.MUSHTABLE_KEY, BlockInfo.MUSHTABLE_DEFAULT).getInt();
		BlockInfo.SMALLMIRROR_ID = config.getBlock(BlockInfo.SMALLMIRROR_KEY, BlockInfo.SMALLMIRROR_DEFAULT).getInt();
		BlockInfo.CYBERWOLF_ID = config.getBlock(BlockInfo.CYBERWOLF_KEY, BlockInfo.CYBERWOLF_DEFAULT).getInt();
		BlockInfo.ENDERCHILLA_ID = config.getBlock(BlockInfo.ENDERCHILLA_KEY, BlockInfo.ENDERCHILLA_DEFAULT).getInt();
		BlockInfo.SEARCHSTATION_ID = config.getBlock(BlockInfo.SEARCHSTATION_KEY, BlockInfo.SEARCHSTATION_DEFAULT).getInt();
		BlockInfo.SPAWNCHANGE_ID = config.getBlock(BlockInfo.SPAWNCHANGE_KEY, BlockInfo.SPAWNCHANGE_DEFAULT).getInt();
		BlockInfo.BOOKSTAND_ID = config.getBlock(BlockInfo.BOOKSTAND_KEY, BlockInfo.BOOKSTAND_DEFAULT).getInt();
		BlockInfo.SHOWCHAIR_ID = config.getBlock(BlockInfo.SHOWCHAIR_KEY, BlockInfo.SHOWCHAIR_DEFAULT).getInt();
		
		ItemInfo.NET_ID = config.getItem(ItemInfo.NET_KEY, ItemInfo.NET_DEFAULT).getInt() - 256;
		ItemInfo.RAWAG_ID = config.getItem(ItemInfo.RAWAG_KEY, ItemInfo.RAWAG_DEFAULT).getInt() - 256;
		ItemInfo.CRYSTAG_ID = config.getItem(ItemInfo.CRYSTAG_KEY, ItemInfo.CRYSTAG_DEFAULT).getInt() - 256;
		ItemInfo.COIN_ID = config.getItem(ItemInfo.COIN_KEY, ItemInfo.COIN_DEFAULT).getInt() - 256;
		ItemInfo.SOUL_ID = config.getItem(ItemInfo.SOUL_KEY,  ItemInfo.SOUL_DEFAULT).getInt() - 256;
		
		config.save();
	
	
	
	

	}
}
