package dev.hannes.tofumod;

import dev.hannes.tofumod.init.blockinit;
import dev.hannes.tofumod.init.iteminit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(hannesandskullz1192tofumod.MODID)
public class hannesandskullz1192tofumod {
    public static final String MODID = "hannesandskullz1192tofumod";

    public hannesandskullz1192tofumod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        blockinit.BLOCKS.register(bus);
        iteminit.ITEMS.register(bus);
    }
}
