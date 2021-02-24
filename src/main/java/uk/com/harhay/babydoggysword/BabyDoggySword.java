package uk.com.harhay.babydoggysword;

import net.minecraft.item.ItemSword;

public class BabyDoggySword extends ItemSword {

    public static final String MODID = "sword";
    public static final String NAME = "Baby Doggy Sword";

    public BabyDoggySword(ToolMaterial material) {
        super(material);
        this.setRegistryName("baby-doggy-sword");
        this.setUnlocalizedName("baby-doggy-sword");
    }
}
