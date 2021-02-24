package uk.com.harhay.babydoggysword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BabyDoggySword.MODID, name = BabyDoggySword.NAME, version = BabyDoggySwordMod.VERSION)
public class BabyDoggySwordMod {

    public static final String VERSION = "1.0";

    public static BabyDoggySword mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Item.ToolMaterial toolMaterial = EnumHelper.addToolMaterial("name", 4, 10000, 20f, 100f, 30);
        mySword = new BabyDoggySword(toolMaterial);
    }
}