package net.redtiger.lots_of_bikes_mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redtiger.lots_of_bikes_mod.Bikes;
import net.redtiger.lots_of_bikes_mod.entity.custom.BikeEntity;

public class ModEntities {
    public static final EntityType<BikeEntity> BIKE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Bikes.MOD_ID, "bike"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BikeEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,1.5f)).build());

}
