package net.trique.mythicupgrades.effect;

import static net.trique.mythicupgrades.MythicUpgrades.CONFIG;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class OceanShieldEffect extends MobEffect {
    public OceanShieldEffect(MobEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (!livingEntity.level().isClientSide()) {
            Entity attacker = livingEntity.getLastHurtByMob();
            if (livingEntity.hurtTime == 9) {
                if (attacker instanceof LivingEntity entity && !attacker.equals(livingEntity)) {
                    entity.hurt(livingEntity.level().damageSources().thorns(livingEntity), amplifier);
                    entity.playSound(SoundEvents.ELDER_GUARDIAN_HURT, 1.0f, livingEntity.getVoicePitch());
                    entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,
                            (int)(CONFIG.aquamarineConfig.ocean_shield_duration() * 20), amplifier), livingEntity);
                }
            }
        }
        super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}