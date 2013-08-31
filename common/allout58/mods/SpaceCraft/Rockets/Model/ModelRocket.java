package allout58.mods.SpaceCraft.Rockets.Model;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelRocket extends ModelBase
{
    private IModelCustom fuselage;
    private IModelCustom[] externalRockets = new IModelCustom[4];
    private IModelCustom[] engines = new IModelCustom[5];

    public ModelRocket()
    {
        fuselage = AdvancedModelLoader.loadModel("/assets/spacecraft/models/fuselage.obj");

    }

    public void render()
    {
        fuselage.renderAll();
    }

    public void renderPart(String partName)
    {
        fuselage.renderPart(partName);
    }

}