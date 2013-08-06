package allout58.mods.SpaceCraft.Blocks;

import allout58.mods.SpaceCraft.SpaceCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreStarSteel extends Block
{

    public BlockOreStarSteel(int par1, Material par2Material)
    {
        super(par1, par2Material);
        setLightValue(0.65F);
        setHardness(2.0F);
        setStepSound(soundStoneFootstep);
        setUnlocalizedName("oreStarSteel");
        setCreativeTab(SpaceCraft.creativeTab);
        func_111022_d("spacecraft:" + this.getUnlocalizedName().substring(5));
    }
}