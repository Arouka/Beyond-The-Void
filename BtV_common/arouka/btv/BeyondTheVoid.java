package arouka.btv;

import config.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import arouka.btv.block.BtvBlocks;
import arouka.btv.item.BtvItems;
import arouka.btv.lib.BtvTab;
import arouka.btv.lib.Refrence;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
@NetworkMod(channels = {Refrence.CHANNEL}, clientSideRequired=true, serverSideRequired=false, packetHandler = PacketHandler.class)
public class BeyondTheVoid 
{
	public static CreativeTabs btv = new BtvTab(CreativeTabs.getNextID(), Refrence.MOD_ID);
	{
            
};
    // The instance of your mod that Forge uses.
    @Instance(Refrence.MOD_ID)
    public static BeyondTheVoid instance;
   
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="arouka.btv.client.ClientProxy", serverSide="arouka.btv.CommonProxy")
    public static CommonProxy proxy;
   
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
    	BtvItems.init();
    	BtvBlocks.init();
    	
    }
   
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
    	BtvItems.addNames();
    	BtvBlocks.addNames();
    	BtvItems.registerRecipies();
        
    	LanguageRegistry.instance().addStringLocalization("itemGroup." + Refrence.MOD_NAME, "en_Us",
         		Refrence.MOD_NAME);
            // End Basic Blocks
    	
    	proxy.initSounds();
    	proxy.initRenderers();
        
    }

    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
    
}

