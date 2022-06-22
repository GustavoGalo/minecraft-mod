package com.examplemod.block.reinforcedIron;

import java.util.List;
import java.util.Random;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class HeatedReinforcedIronBlock extends Block {

    private MinecraftClient CLIENT;
    private final float CHANCE_SHOW_PARTICLE = 0.5f;
    public static final HeatedReinforcedIronBlock INSTANCE = new HeatedReinforcedIronBlock(FabricBlockSettings.of(Material.METAL).strength(6f).luminance(12).requiresTool());
    
    public HeatedReinforcedIronBlock(Settings settings) {
        super(settings);

        CLIENT = MinecraftClient.getInstance();
    }

    @Override
	@SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        
        if (CLIENT.player != null) {
            CLIENT.player.setOnFireFor(1);
            CLIENT.player.damage(DamageSource.LAVA, 0.5f);
        }

        return super.getCollisionShape(state, world, pos, context);
    }
    
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

        if (CHANCE_SHOW_PARTICLE < random.nextFloat()) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + 0.25d;
            double z = pos.getZ() + random.nextDouble();

            world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0d, 0.05d, 0d);
        }
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("block.examplemod.heated_reinforced_iron_block.tooltip").formatted(Formatting.RED));
    }
    
}
