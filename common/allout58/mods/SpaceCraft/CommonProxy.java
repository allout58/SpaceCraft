package allout58.mods.SpaceCraft;

import allout58.mods.SpaceCraft.Blocks.Container.ContainerRocketAssembler;
import allout58.mods.SpaceCraft.Blocks.Logic.AssemblerLogic;
import allout58.mods.SpaceCraft.Constants.SpaceCraftGuiIDs;
import allout58.mods.SpaceCraft.client.gui.GuiRocketAssembler;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler
{
    // Client stuff
    public void registerRenderers()
    {
        // Nothing here as the server doesn't render graphics or entities!
    }

    public String getCurrentLanguage()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void addName(Object obj, String s)
    {
        // TODO Auto-generated method stub

    }

    public void addLocalization(String s1, String string)
    {
        // TODO Auto-generated method stub

    }

    public String getItemDisplayName(ItemStack stack)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == SpaceCraftGuiIDs.ROCKET_ASSEMBLER)
        {
            AssemblerLogic logic=(AssemblerLogic) world.getBlockTileEntity(x, y,z);
            return new ContainerRocketAssembler(player.inventory, logic);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == SpaceCraftGuiIDs.ROCKET_ASSEMBLER)
        {
            AssemblerLogic logic=(AssemblerLogic) world.getBlockTileEntity(x, y,z);
            return new GuiRocketAssembler(player.inventory, logic);
        }
        return null;
    }
}
