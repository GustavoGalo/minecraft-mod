package com.examplemod.block;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.damage.DamageSource;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ObsidianPressurePlate extends PressurePlateBlock {

	public ObsidianPressurePlate() {
		super(ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).noCollision().strength(0.6F, 26.0F));
	}

	@Override
	public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(DamageSource.LAVA, 0.5f);
	}

}