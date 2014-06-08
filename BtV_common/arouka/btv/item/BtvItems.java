package arouka.btv.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.*;

public class BtvItems {
		public static Item net;
		public static Item rawag;
		public static Item crystag;
		public static Item coin;
		public static Item soul;
	
	public static void init() {
		net = new ItemNet (ItemInfo.NET_ID);
		rawag = new ItemAgateRaw(ItemInfo.RAWAG_ID);
		crystag= new ItemAgateCrystal(ItemInfo.CRYSTAG_ID);
		coin = new ItemCoin(ItemInfo.COIN_ID);
		soul = new ItemSoul(ItemInfo.SOUL_ID);
	}
	
	
	public static void addNames() {
		LanguageRegistry.addName(net, ItemInfo.NET_NAME);
		LanguageRegistry.addName(rawag, ItemInfo.RAWAG_NAME);
		LanguageRegistry.addName(crystag, ItemInfo.CRYSTAG_NAME);
		LanguageRegistry.addName(coin, ItemInfo.COIN_NAME);
		
		for (int i = 0; i < ItemInfo.SOUL_NAMES.length; i++) {
			LanguageRegistry.addName(new ItemStack(soul, 1, i), ItemInfo.SOUL_NAMES[i]);
			
			
		}
	}
	
	
	
	public static void registerRecipies() { {
		GameRegistry.addRecipe(new ItemStack(coin),
				new Object[] {	"XRX",
								"RGR",
								"XRX",
								
								'X', Item.ingotGold,
								'R', Item.redstone,
								'G', Item.ghastTear,
						});
								
		}
	
		GameRegistry.addRecipe(new ItemStack(net),
				new Object[] { 	"  N",
								" WS",
								"BSS",
					
								'N', Item.netherrackBrick,
								'W', Item.skull,
								'S', Block.slowSand,
								'B', Item.blazeRod,
						});	
								
		}
		
}
		
	
