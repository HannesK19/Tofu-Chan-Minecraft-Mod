package dev.hannes.tofumod.init;

import dev.hannes.tofumod.hannesandskullz1192tofumod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class iteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, hannesandskullz1192tofumod.MODID);

    public static final RegistryObject<Item> CHEESE_ROLL = ITEMS.register("cheese_roll", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<BlockItem> CHEESE_BLOCK = ITEMS.register("cheese_block", () -> new BlockItem(blockinit.CHEESE_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> BREAD_BLOCK = ITEMS.register("bread_block", () -> new BlockItem(blockinit.BREAD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
