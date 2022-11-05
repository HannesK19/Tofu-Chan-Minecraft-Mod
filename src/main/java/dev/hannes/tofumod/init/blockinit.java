package dev.hannes.tofumod.init;

import dev.hannes.tofumod.hannesandskullz1192tofumod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockinit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, hannesandskullz1192tofumod.MODID);
    public static final RegistryObject<Block> CHEESE_BLOCK = BLOCKS.register("cheese_block", () -> new Block(BlockBehaviour.Properties.of(Material.CLAY)));
    public static final RegistryObject<Block> BREAD_BLOCK = BLOCKS.register("bread_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
}
