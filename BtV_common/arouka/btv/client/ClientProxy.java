package arouka.btv.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import arouka.btv.CommonProxy;
import arouka.btv.renderer.RendererBookStand;
import arouka.btv.renderer.RendererCyberwolf;
import arouka.btv.renderer.RendererEnderchilla;
import arouka.btv.renderer.RendererResearchStation;
import arouka.btv.renderer.RendererShowChair;
import arouka.btv.renderer.RendererSmallMirror;
import arouka.btv.renderer.RendererSpawnerConverter;
import arouka.btv.tileentity.TileEntityBookStand;
import arouka.btv.tileentity.TileEntityCyberwolf;
import arouka.btv.tileentity.TileEntityEnderchilla;
import arouka.btv.tileentity.TileEntityResearchStation;
import arouka.btv.tileentity.TileEntityShowChair;
import arouka.btv.tileentity.TileEntitySmallMirror;
import arouka.btv.tileentity.TileEntitySpawnerConverter;

public class ClientProxy extends CommonProxy {
       
        @Override
        public void initRenderers() {
        	btvRenderId = RenderingRegistry.getNextAvailableRenderId();
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySmallMirror.class, new RendererSmallMirror());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCyberwolf.class, new RendererCyberwolf());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEnderchilla.class, new RendererEnderchilla());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityResearchStation.class, new RendererResearchStation());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpawnerConverter.class, new RendererSpawnerConverter());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBookStand.class, new RendererBookStand());
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityShowChair.class, new RendererShowChair());
        	
        	
        }
        
        public int btvRenderId;
        
        @Override
        public void initSounds() {
        	//This is for registering all the sounds
        	
        }
       
}