package com.examplemod.entity;

import com.examplemod.ExampleMod;
import com.examplemod.entity.raccoon.RaccoonEntity;
import com.examplemod.entity.raccoon.RaccoonRenderer;
import com.examplemod.util.Logger;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.EntityType.EntityFactory;

public class Entities {

    public static final EntityType<RaccoonEntity> RACCOON = createEntity(RaccoonEntity::new, RaccoonEntity.Dimensions);

    private static <T extends Entity> EntityType<T> createEntity(EntityFactory<T> factory, EntityDimensions dimensions) {
        return FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, factory).dimensions(dimensions).build();
    }

    private static <T extends Entity> void registerEntity(String name, EntityType<T> entry, EntityRendererFactory<T> entityRendererFactory) {
        EntityType<T> entityType = Registry.register(Registry.ENTITY_TYPE, new Identifier(ExampleMod.MOD_ID, name), entry);
        
		EntityRendererRegistry.register(entityType, entityRendererFactory);
    }

    public static void registerAll() {
		registerEntity("raccoon", RACCOON, RaccoonRenderer::new);

		Logger.loaded(Entities.class.getSimpleName());
    }
    
}
