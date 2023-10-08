package net.redtiger.lots_of_bikes_mod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.redtiger.lots_of_bikes_mod.entity.ModEntities;
import net.redtiger.lots_of_bikes_mod.entity.client.BikeRenderer;
import net.redtiger.lots_of_bikes_mod.entity.client.ModModelLayers;
import  net.redtiger.lots_of_bikes_mod.entity.client.BikeModel;

public class BikesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BIKE, BikeRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BIKE, BikeModel::getTexturedModelData);
    }
}
