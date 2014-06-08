package arouka.btv.renderer;

import org.lwjgl.opengl.GL11;

import arouka.btv.block.BlockInfo;
import arouka.btv.models.ModelResearchStation;
import arouka.btv.models.ModelSmallMirror;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RendererResearchStation extends TileEntitySpecialRenderer {
	
	private static final ResourceLocation texture = new ResourceLocation(BlockInfo.TEXTURE_LOCATION, "textures/models/researchStation.png");
	
	private ModelResearchStation model;
	
	public RendererResearchStation(){
		this.model = new ModelResearchStation();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		this.bindTexture(texture);
		GL11.glPushMatrix();
		this.model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	


}