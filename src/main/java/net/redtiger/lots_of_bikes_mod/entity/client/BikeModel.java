package net.redtiger.lots_of_bikes_mod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.redtiger.lots_of_bikes_mod.entity.custom.BikeEntity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BikeModel<T extends BikeEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Bike;
	public BikeModel(ModelPart root) {
		this.Bike = root.getChild("Bike");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Bike = modelPartData.addChild("Bike", ModelPartBuilder.create(), ModelTransform.pivot(7.4216F, 16.7123F, 5.625F));

		ModelPartData Frame = Bike.addChild("Frame", ModelPartBuilder.create().uv(0, 4).cuboid(-7.25F, -9.0F, -1.0F, 12.5F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(19, 25).cuboid(13.5F, -8.0F, -1.5F, 1.0F, 9.75F, 1.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-2.0F, 0.0F, -2.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(15, 25).cuboid(13.5F, -8.0F, 0.5F, 1.0F, 9.75F, 1.0F, new Dilation(0.0F))
		.uv(29, 2).cuboid(13.5F, -8.0F, -1.25F, 1.0F, 0.75F, 2.5F, new Dilation(0.0F)), ModelTransform.pivot(-12.1716F, -5.7123F, -5.625F));

		ModelPartData cube_r1 = Frame.addChild("cube_r1", ModelPartBuilder.create().uv(24, 8).cuboid(-1.0F, -1.25F, -1.25F, 2.5F, 2.5F, 2.5F, new Dilation(0.0F)), ModelTransform.of(13.75F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r2 = Frame.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-4.625F, -1.393F, -1.0F, 12.75F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.5F, -4.75F, 0.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r3 = Frame.addChild("cube_r3", ModelPartBuilder.create().uv(0, 8).cuboid(-4.625F, -1.393F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -4.25F, 0.0F, 0.0F, 0.0F, -1.9635F));

		ModelPartData Steering = Bike.addChild("Steering", ModelPartBuilder.create(), ModelTransform.pivot(-0.4167F, -0.75F, -5.625F));

		ModelPartData cube_r4 = Steering.addChild("cube_r4", ModelPartBuilder.create().uv(13, 12).cuboid(-0.625F, 2.625F, -0.625F, 0.75F, 0.25F, 0.75F, new Dilation(0.0F)), ModelTransform.of(0.4167F, 0.75F, 5.625F, 1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r5 = Steering.addChild("cube_r5", ModelPartBuilder.create().uv(13, 13).cuboid(-0.625F, 2.625F, -0.125F, 0.75F, 0.25F, 0.75F, new Dilation(0.0F)), ModelTransform.of(0.4167F, 0.75F, -5.625F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r6 = Steering.addChild("cube_r6", ModelPartBuilder.create().uv(23, 25).cuboid(-0.575F, -4.375F, -0.075F, 0.65F, 11.0F, 0.65F, new Dilation(0.0F)), ModelTransform.of(0.4167F, 0.75F, -1.125F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r7 = Steering.addChild("cube_r7", ModelPartBuilder.create().uv(27, 29).cuboid(-0.875F, -2.625F, -0.375F, 1.25F, 5.5F, 1.25F, new Dilation(0.0F)), ModelTransform.of(0.4167F, 0.75F, -0.125F, -1.5708F, 0.0F, 0.0F));

		ModelPartData cube_r8 = Steering.addChild("cube_r8", ModelPartBuilder.create().uv(0, 12).cuboid(-0.375F, -1.625F, -0.375F, 0.75F, 3.25F, 0.75F, new Dilation(0.0F)), ModelTransform.of(0.1667F, -1.0F, -1.125F, 0.7854F, 0.0F, 0.0F));

		ModelPartData cube_r9 = Steering.addChild("cube_r9", ModelPartBuilder.create().uv(8, 31).cuboid(-0.375F, -1.625F, -0.375F, 0.75F, 3.25F, 0.75F, new Dilation(0.0F)), ModelTransform.of(0.1667F, -1.0F, 1.125F, -0.7854F, 0.0F, 0.0F));

		ModelPartData Pedals = Bike.addChild("Pedals", ModelPartBuilder.create().uv(18, 12).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.1716F, -13.7123F, -5.625F));

		ModelPartData cube_r10 = Pedals.addChild("cube_r10", ModelPartBuilder.create().uv(0, 26).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.5F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 0.0F, 2.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r11 = Pedals.addChild("cube_r11", ModelPartBuilder.create().uv(14, 12).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 0.0F, 2.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r12 = Pedals.addChild("cube_r12", ModelPartBuilder.create().uv(7, 27).cuboid(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 0.0F, -2.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r13 = Pedals.addChild("cube_r13", ModelPartBuilder.create().uv(27, 25).cuboid(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.5F, new Dilation(0.0F)), ModelTransform.of(4.5F, 0.0F, -2.5F, 0.0F, -1.5708F, 0.0F));

		ModelPartData WheelBack = Bike.addChild("WheelBack", ModelPartBuilder.create().uv(0, 18).cuboid(-3.5F, -3.5F, -0.25F, 7.25F, 7.25F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(-18.4216F, -13.7123F, -5.625F));

		ModelPartData WheelFront = Bike.addChild("WheelFront", ModelPartBuilder.create().uv(17, 17).cuboid(-3.5F, -3.75F, -0.25F, 7.25F, 7.25F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(1.5784F, -13.7123F, -5.625F));

		ModelPartData BottomSteering = Bike.addChild("BottomSteering", ModelPartBuilder.create(), ModelTransform.pivot(0.6062F, -3.3865F, -5.625F));

		ModelPartData cube_r14 = BottomSteering.addChild("cube_r14", ModelPartBuilder.create().uv(0, 30).cuboid(-0.75F, -1.625F, -0.75F, 1.5F, 3.25F, 1.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(BikeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Bike.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return Bike;
	}
}