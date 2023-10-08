package net.redtiger.lots_of_bikes_mod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.redtiger.lots_of_bikes_mod.Bikes;

public class ModModelLayers {
    public static final EntityModelLayer BIKE =
            new EntityModelLayer(new Identifier(Bikes.MOD_ID, "bike"), "main");
}
