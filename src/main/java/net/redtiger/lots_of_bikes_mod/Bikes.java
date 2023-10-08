package net.redtiger.lots_of_bikes_mod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.redtiger.lots_of_bikes_mod.entity.ModEntities;
import net.redtiger.lots_of_bikes_mod.entity.custom.BikeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bikes implements ModInitializer {
	public static final String MOD_ID = "lots_of_bikes_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(ModEntities.BIKE, BikeEntity.createBikeAttributes());
	}
}