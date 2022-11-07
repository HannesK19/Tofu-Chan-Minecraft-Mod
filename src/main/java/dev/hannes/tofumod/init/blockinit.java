package dev.hannes.tofumod.init;

import dev.hannes.tofumod.hannesandskullz1192tofumod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class blockinit {
    public static final DeferredRegister<Block> BLOCKS= DeferredRegister.create(ForgeRegistries.BLOCKS, hannesandskullz1192tofumod.MODID);
    public static final RegistryObject<Block> CHEESE_BLOCK = register("cheese_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).friction(0.5f)),
            new Item.Properties().tab(hannesandskullz1192tofumod.TOFUTAB));
    public static final RegistryObject<Block> BREAD_BLOCK = register("bread_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)),
            new Item.Properties().tab(hannesandskullz1192tofumod.TOFUTAB));

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        iteminit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

}