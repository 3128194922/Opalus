package com.Uniye.Opalus.Items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class ChianswordItem extends SwordItem {
    public ChianswordItem(Tier tier, double damage, float attackSpeed, Properties properties) {
        super(tier, 7, -2.4F, properties);
    }

    // 玩家右键开始使用（长按）
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(player.getItemInHand(hand));
    }

    // 每 tick 调用（Forge 原生）
    @Override
    public void onUseTick(Level level, LivingEntity entity, ItemStack stack, int remainingUseDuration) {
        if (level.isClientSide) return;
        if (!(entity instanceof Player player)) return;

        // 每 4 tick 造成一次伤害
        if (player.tickCount % 4 != 0) return;

        // 前方攻击范围
        Vec3 look = player.getLookAngle();
        Vec3 eyePos = player.getEyePosition();
        AABB attackBox = new AABB(eyePos.add(look.scale(1.0)), eyePos.add(look.scale(3.0))).inflate(1.0);

        List<LivingEntity> targets = level.getEntitiesOfClass(LivingEntity.class, attackBox, e -> e != player && e.isAlive());
        for (LivingEntity target : targets) {
            target.hurt(level.damageSources().playerAttack(player), 4.0F);
        }
    }

    // 设置最大使用时间（如弓）
    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

}