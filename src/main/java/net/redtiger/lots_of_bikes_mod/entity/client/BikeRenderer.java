package net.redtiger.lots_of_bikes_mod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.redtiger.lots_of_bikes_mod.Bikes;
import net.redtiger.lots_of_bikes_mod.entity.custom.BikeEntity;

public class BikeRenderer extends MobEntityRenderer<BikeEntity, BikeModel<BikeEntity>> {
    private static final Identifier TEXTURE = new Identifier(Bikes.MOD_ID, "textures/entity/blue_bike.png");

    public BikeRenderer(EntityRendererFactory.Context context) {
        super(context, new BikeModel<>(context.getPart(ModModelLayers.BIKE)), 0.6f);
    }

    @Override
    public Identifier getTexture(BikeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BikeEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
