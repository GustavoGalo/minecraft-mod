package com.examplemod.block.reinforcedIron;

import java.util.List;
import java.util.Random;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class HeatedReinforcedIronBlock extends Block {

    private float CHANCE_SHOW_PARTICLE = 0.5f;
    public static final HeatedReinforcedIronBlock INSTANCE = new HeatedReinforcedIronBlock(FabricBlockSettings.of(Material.METAL).strength(6f).luminance(12).requiresTool());

    public HeatedReinforcedIronBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {

        if (CHANCE_SHOW_PARTICLE < random.nextFloat()) {
            double x = pos.getX() + random.nextDouble();
            double y = pos.getY() + 0.25d;
            double z = pos.getZ() + random.nextDouble();

            world.addParticle(ParticleTypes.FLAME, true, x, y, z, 0, 0.05d, 0d);
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        if (entity instanceof LivingEntity livingEntity) {
            livingEntity.damage(DamageSource.HOT_FLOOR, 1);
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("block.examplemod.heated_reinforced_iron_block.tooltip").formatted(Formatting.RED));
    }
    
}
