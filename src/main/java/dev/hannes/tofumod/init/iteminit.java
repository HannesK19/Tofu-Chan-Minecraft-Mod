package dev.hannes.tofumod.init;

import dev.hannes.tofumod.hannesandskullz1192tofumod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class iteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, hannesandskullz1192tofumod.MODID);

    public static final RegistryObject<Item> CHEESE_ROLL = ITEMS.register("cheese_roll",
            () -> new Item(new Item.Properties().tab(hannesandskullz1192tofumod.TOFUTAB)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(hannesandskullz1192tofumod.TOFUTAB)));

    }

