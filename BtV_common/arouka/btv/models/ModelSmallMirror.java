// Date: 5/24/2014 1:15:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package arouka.btv.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSmallMirror extends ModelBase
{
  //fields
    ModelRenderer Mirror;
    ModelRenderer Edge1;
    ModelRenderer Edge2;
    ModelRenderer Edge3;
    ModelRenderer Edge4;
    ModelRenderer Stand1;
    ModelRenderer Stand2;
  
  public ModelSmallMirror()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Mirror = new ModelRenderer(this, 27, 14);
      Mirror.addBox(-6F, -9.5F, -1.5F, 12, 19, 3);
      Mirror.setRotationPoint(0F, 15.4F, 1.4F);
      Mirror.setTextureSize(64, 64);
      Mirror.mirror = true;
      setRotation(Mirror, -0.7853982F, 0F, 0F);
      Edge1 = new ModelRenderer(this, 0, 29);
      Edge1.addBox(-1F, -10.5F, -2F, 2, 21, 4);
      Edge1.setRotationPoint(-7F, 15.1F, 1F);
      Edge1.setTextureSize(64, 64);
      Edge1.mirror = true;
      setRotation(Edge1, -0.7853982F, 0F, 0F);
      Edge2 = new ModelRenderer(this, 13, 29);
      Edge2.addBox(-1F, -10.5F, -2F, 2, 21, 4);
      Edge2.setRotationPoint(7F, 15.1F, 1F);
      Edge2.setTextureSize(64, 64);
      Edge2.mirror = true;
      setRotation(Edge2, -0.7853982F, 0F, 0F);
      Edge3 = new ModelRenderer(this, 27, 0);
      Edge3.addBox(-6F, -1F, -2F, 12, 2, 4);
      Edge3.setRotationPoint(0F, 8.4F, 7.7F);
      Edge3.setTextureSize(64, 64);
      Edge3.mirror = true;
      setRotation(Edge3, -0.7853982F, 0F, 0F);
      Edge4 = new ModelRenderer(this, 27, 7);
      Edge4.addBox(-6F, -1F, -2F, 12, 2, 4);
      Edge4.setRotationPoint(0F, 21.8F, -5.7F);
      Edge4.setTextureSize(64, 64);
      Edge4.mirror = true;
      setRotation(Edge4, -0.7853982F, 0F, 0F);
      Stand1 = new ModelRenderer(this, 0, 12);
      Stand1.addBox(-5F, -6.5F, -1.5F, 10, 13, 3);
      Stand1.setRotationPoint(0F, 18F, 6F);
      Stand1.setTextureSize(64, 64);
      Stand1.mirror = true;
      setRotation(Stand1, 0F, 0F, 0F);
      Stand2 = new ModelRenderer(this, 0, 0);
      Stand2.addBox(-5F, -4.5F, -1F, 8, 9, 2);
      Stand2.setRotationPoint(1F, 20F, 3F);
      Stand2.setTextureSize(64, 64);
      Stand2.mirror = true;
      setRotation(Stand2, -0.7482227F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Mirror.render(f5);
    Edge1.render(f5);
    Edge2.render(f5);
    Edge3.render(f5);
    Edge4.render(f5);
    Stand1.render(f5);
    Stand2.render(f5);
  }
  
  
  public void renderModel(float f){
	 Mirror.render(f);
	 Edge1.render(f);
	 Edge2.render(f);
	 Edge3.render(f);
	 Edge4.render(f);
	 Stand1.render(f);
	 Stand2.render(f);
	  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
